/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

/**
 * 登录
 *
 * @author TGG 2022-07-08
 */
public class LoginController {

    /**
     * 登录
     */
    public Result<String> login(String username, String password) {
        Result<String> result = new Result<>();
        if ("javanote".equalsIgnoreCase(username) && "123456".equalsIgnoreCase(password)) {
            result.setCode(0);
            result.setData("登录成功");
        } else {
            result.setCode(1);
            result.setData("登录失败");
        }
        return result;
    }
}
