/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine.logistics;

import tech.suzaku.refine.bean.JingdongFreshOrder;
import tech.suzaku.refine.bean.JingdongOrder;
import tech.suzaku.refine.bean.Order;

import java.util.UUID;

/**
 * 京东物流订单服务
 *
 * @author 无羡 2022-07-06
 */
public class JingdongLogisticsAdapter implements LogisticsService {

    /**
     * 创建物流订单
     *
     * @param goodsName
     * @return
     */
    public Order createOrder(String goodsName) {
        return new JingdongOrder("JD" + System.currentTimeMillis());
    }

    /**
     * 创建生鲜订单
     *
     * @param goodsName
     * @return
     */
    public Order createFreshOrder(String goodsName) {
        return new JingdongFreshOrder("JD" + System.currentTimeMillis());
    }
}
