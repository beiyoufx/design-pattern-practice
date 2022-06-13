/*
 * Copyright (c) 2022. 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 */

package tech.suzaku.refine;

import tech.suzaku.LoginRequest;
import tech.suzaku.PhoneLoginService;
import tech.suzaku.UsernameLoginService;

/**
 * 登录
 *
 * @author TGG 2022-06-13
 */
public class LoginController {

    /**
     * 登录
     */
    public String login(LoginRequest request) {
        LoginService loginService = LoginServiceFactory.get(request.getLoginType());
        return loginService.login(request.getUuid(), request.getPassword());
    }
}
