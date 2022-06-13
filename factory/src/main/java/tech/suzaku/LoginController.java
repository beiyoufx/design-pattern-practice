/*
 * Copyright (c) 2022. 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 */

package tech.suzaku;

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
        if (request.getLoginType() == 1) {
            UsernameLoginService loginService = new UsernameLoginService();
            return loginService.login(request.getUuid(), request.getPassword());
        } else if (request.getLoginType() == 2) {
            PhoneLoginService loginService = new PhoneLoginService();
            return loginService.login(request.getUuid(), request.getPassword());
        } else {
            throw new RuntimeException("登录出错啦！");
        }
    }
}
