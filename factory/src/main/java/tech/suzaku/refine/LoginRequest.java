/*
 * Copyright (c) 2022. 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 */

package tech.suzaku.refine;

/**
 * 登录请求
 *
 * @author TGG 2022-06-13
 */
public class LoginRequest {
    /**
     * 1用户名密码登录
     * 2手机号验证码登录
     */
    private Integer loginType;

    /**
     * 用户唯一标识
     * 用户名/手机号
     */
    private String uuid;

    /**
     * 密码/验证码
     */
    private String password;

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
