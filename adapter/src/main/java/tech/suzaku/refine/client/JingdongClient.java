/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine.client;

/**
 * 模拟的京东客户端
 *
 * @author TGG 7/25/22
 */
public class JingdongClient {

    /**
     * 创建京东订单
     *
     * @param content 包裹内容物
     * @return
     */
    public String createOrder(String content) {
        System.out.println("创建京东快送订单成功，配送物品=" + content);
        return "JD" + System.currentTimeMillis();
    }

    /**
     * 创建京东订单
     *
     * @param content 包裹内容物
     * @return
     */
    public String createFreshOrder(String content) {
        System.out.println("创建京东生鲜物流订单成功，配送物品=" + content);
        return "JD" + System.currentTimeMillis();
    }
}
