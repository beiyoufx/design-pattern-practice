/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.bean;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author TGG 2022-07-13
 */
public class HtmlTemplate {

    // 源码
    private String source;
    // 模板参数
    private Map<String, String> params = new HashMap<>();
    // 渲染后的结果缓存
    private String html;
    // 插值
    private Set<String> slotSet = new HashSet<>();

    public HtmlTemplate(String source) {
        this.source = source;

        init();
    }

    private void init() {
        if (slotSet.isEmpty()) {
            // 插值匹配
            String SLOT_PATTERN = "\\{\\{[a-zA-z0-9]+}}";
            Pattern r = Pattern.compile(SLOT_PATTERN);
            Matcher m = r.matcher(source);

            while (m.find()) {
                slotSet.add(m.group());
            }
        }
    }

    private void render() {
        html = source;
        for (String slot : slotSet) {
            html = html.replace(slot, params.getOrDefault(slot.replace("{{", "").replace("}}", ""), slot));
        }
    }

    public String getHtml() {
        if (html == null) {
            render();
        }
        return html;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
