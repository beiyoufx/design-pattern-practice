/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine.client;

/**
 * 模拟的顺丰客户端
 *
 * @author TGG 7/25/22
 */
public class ShunfengClient {

    /**
     * 创建顺丰订单
     *
     * @param type 1=普通快递，2=生鲜物流
     * @param content 包裹内容物
     * @return
     */
    public String createOrder(int type, String content) {
        System.out.println("创建顺丰" + (type == 1 ? "快递" : "生鲜物流") + "订单成功，配送物品=" + content);
        return "SF" + System.currentTimeMillis();
    }
}
