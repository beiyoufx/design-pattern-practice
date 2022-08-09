/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

/**
 * 物流服务
 *
 * @author TGG 2022-07-06
 */
public class LogisticsServiceImpl implements LogisticsService {
    private static ShunfengClient shunfengClient = new ShunfengClient();

    /**
     * 创建物流订单
     *
     * @param goodsName
     * @return
     */
    @Override
    public String createOrder(String goodsName) {
        return shunfengClient.createOrder(1, goodsName);
    }

    /**
     * 创建生鲜订单
     *
     * @param goodsName
     * @return
     */
    @Override
    public String createFreshOrder(String goodsName) {
        return shunfengClient.createOrder(2, goodsName);
    }
}
