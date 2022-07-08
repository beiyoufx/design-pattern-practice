/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine;

import tech.suzaku.Result;

/**
 * @author 无羡 2022-07-08
 */
public class ResultBuilder<T> {
    private Result<T> result;

    public static <T> ResultBuilder<T> builder() {
        return new ResultBuilder<>();
    }

    private ResultBuilder() {
        this.result = new Result<>();
    }

    public ResultBuilder code(int code) {
        this.result.setCode(code);
        return this;
    }

    public ResultBuilder data(T data) {
        this.result.setData(data);
        return this;
    }

    public Result<T> build() {
        return this.result;
    }
}
