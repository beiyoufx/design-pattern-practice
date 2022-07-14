/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine;

import tech.suzaku.refine.bean.HtmlTemplate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

/**
 * @author TGG 2021-06-08
 */
public class TemplateHelper {
    private static final String TPL_PATH = "/template.html";

    // 原型对象
    private static HtmlTemplate htmlTemplateProtoType;

    static {
        try {
            init();
        } catch (IOException e) {
            System.out.println("初始化模板原型异常！");
        }
    }

    // 初始化原型对象
    private synchronized static void init() throws IOException {
        if (htmlTemplateProtoType != null) {
            return;
        }
        String filePath = TemplateHelper.class.getResource(TPL_PATH).getFile();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String str;
        while ((str = reader.readLine()) != null) {
            content.append(str);
        }
        reader.close();

        String templateSource = content.toString();

        htmlTemplateProtoType = new HtmlTemplate(templateSource);
    }

    // 通过模板生成html字符串
    public static String getHtml(Map<String, String> param) throws IOException {
        HtmlTemplate template = getTemplate();

        template.setParams(param);
        return template.getHtml();
    }

    // 获取模板
    private static HtmlTemplate getTemplate() throws IOException {
        if (htmlTemplateProtoType == null) {
            init();
        }

        // 使用原型创建新对象
        return htmlTemplateProtoType.clone();
    }
}
