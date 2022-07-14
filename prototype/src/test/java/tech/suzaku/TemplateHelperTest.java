/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author TGG 2022-07-13
 */
public class TemplateHelperTest {

    @Test
    public void getHtml() throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("hello", "你好");
        params.put("world", "Java实践笔记");
        String content = TemplateHelper.getHtml(params);
        System.out.println(content);
    }
}