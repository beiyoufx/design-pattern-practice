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
public interface LogisticsService {

    /**
     * 创建物流订单
     *
     * @param goodsName
     * @return
     */
    String createOrder(String goodsName);

    /**
     * 创建生鲜订单
     *
     * @param goodsName
     * @return
     */
    String createFreshOrder(String goodsName);
}
