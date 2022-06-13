/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine;

import org.junit.Test;
import tech.suzaku.LoginController;
import tech.suzaku.LoginRequest;

import static org.junit.Assert.*;

/**
 * @author TGG 2022-06-13
 */
public class LoginControllerTest {

    @Test
    public void login() {
        tech.suzaku.LoginController loginController = new LoginController();

        tech.suzaku.LoginRequest request = new LoginRequest();
        request.setLoginType(1);
        request.setUuid("滕哥");
        request.setPassword("123");

        String token = loginController.login(request);
        System.out.println(token);
    }
}