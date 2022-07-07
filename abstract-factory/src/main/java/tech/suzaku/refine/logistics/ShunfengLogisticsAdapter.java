/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine.logistics;


import tech.suzaku.refine.bean.Order;
import tech.suzaku.refine.bean.ShunfengFreshOrder;
import tech.suzaku.refine.bean.ShunfengOrder;

import java.util.UUID;

/**
 * 顺丰订单服务
 *
 * @author 无羡 2022-07-06
 */
public class ShunfengLogisticsAdapter implements LogisticsService {

    /**
     * 创建速运订单
     *
     * @param goodsName
     * @return
     */
    public Order createOrder(String goodsName) {
        return new ShunfengOrder("SF" + System.currentTimeMillis());
    }

    /**
     * 创建生鲜订单
     *
     * @param goodsName
     * @return
     */
    public Order createFreshOrder(String goodsName) {
        return new ShunfengFreshOrder("SF" + System.currentTimeMillis());
    }
}
