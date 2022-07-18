/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

/**
 * @author TGG 2022-07-18
 */
public class OpenClient {
    private OpenConfig config;

    public OpenClient(OpenConfig config) {
        this.config = config;
    }

    /**
     * 执行API请求
     *
     * @param request 请求
     * @return 具体的API响应
     */
    public String execute(OpenRequest request) {
        return request.getMethod() + "执行成功！";
    }
}
