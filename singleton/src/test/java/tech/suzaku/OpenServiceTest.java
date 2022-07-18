/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author TGG 2022-07-18
 */
public class OpenServiceTest {

    @Test
    public void hello() {
        OpenService service = new OpenService();
        OpenService service1 = new OpenService();
        OpenService service2 = new OpenService();
        String result = service.hello("world");
        System.out.println(result);
    }
}