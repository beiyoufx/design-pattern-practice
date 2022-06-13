/*
 * Copyright (c) 2022. 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 */

package tech.suzaku.refine;

/**
 * @author TGG 2022-06-13
 */
public class PhoneLoginService implements LoginService {

    @Override
    public String login(String phoneNumber, String code) {
        return "token";
    }
}
