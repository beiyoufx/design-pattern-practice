/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import tech.suzaku.bean.HtmlTemplate;

import java.io.*;
import java.util.Map;

/**
 * @author TGG 2021-06-08
 */
public class TemplateHelper {
    private static final String TPL_PATH = "/template.html";

    // 通过模板生成html字符串
    public static String getHtml(Map<String, String> param) throws IOException {
        HtmlTemplate template = getTemplate();

        template.setParams(param);
        return template.getHtml();
    }

    // 获取模板
    private static HtmlTemplate getTemplate() throws IOException {
        String filePath = TemplateHelper.class.getResource(TPL_PATH).getFile();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String str;
        while ((str = reader.readLine()) != null) {
            content.append(str);
        }
        reader.close();

        String templateSource = content.toString();

        return new HtmlTemplate(templateSource);
    }
}
