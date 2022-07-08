/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine;

import tech.suzaku.Result;

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
        if ("javanote".equalsIgnoreCase(username) && "123456".equalsIgnoreCase(password)) {
            return ResultBuilder.<String>builder()
                    .code(0)
                    .data("登录成功")
                    .build();
        }
        return ResultBuilder.<String>builder()
                .code(1)
                .data("登录失败")
                .build();
    }
}
