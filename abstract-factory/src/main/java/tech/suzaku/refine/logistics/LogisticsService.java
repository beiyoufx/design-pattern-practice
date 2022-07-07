/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine.logistics;

import tech.suzaku.refine.bean.Order;

/**
 * 物流服务
 *
 * @author 无羡 2022-07-06
 */
public interface LogisticsService {

    /**
     * 创建物流订单
     *
     * @param goodsName
     * @return
     */
    Order createOrder(String goodsName);

    /**
     * 创建生鲜订单
     *
     * @param goodsName
     * @return
     */
    Order createFreshOrder(String goodsName);
}
