/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 无羡 2022-07-08
 */
public class LoginControllerTest {

    @Test
    public void login() {
        LoginController controller = new LoginController();

        Result<String> result = controller.login("javanote", "123456");

        Assert.assertNotNull(result);
        Assert.assertEquals(result.getCode(), 0);
    }
}