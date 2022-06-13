/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine;

/**
 * 登录服务工厂
 * @author TGG 2022-06-13
 */
public class LoginServiceFactory {

    public static LoginService get(Integer loginType) {
        if (loginType == 1) {
            return new UsernameLoginService();
        } else if (loginType == 2) {
            return new PhoneLoginService();
        } else {
            throw new RuntimeException("登录出错啦！");
        }
    }
}
