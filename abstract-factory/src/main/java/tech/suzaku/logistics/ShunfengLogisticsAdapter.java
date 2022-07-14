/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.logistics;

import tech.suzaku.bean.ShunfengFreshOrder;
import tech.suzaku.bean.ShunfengOrder;

import java.util.UUID;

/**
 * 顺丰订单服务
 *
 * @author TGG 2022-07-06
 */
public class ShunfengLogisticsAdapter {

    /**
     * 创建速运订单
     *
     * @param goodsName
     * @return
     */
    public ShunfengOrder createOrder(String goodsName) {
        return new ShunfengOrder("SF" + System.currentTimeMillis());
    }

    /**
     * 创建生鲜订单
     *
     * @param goodsName
     * @return
     */
    public ShunfengFreshOrder createFreshOrder(String goodsName) {
        return new ShunfengFreshOrder("SF" + System.currentTimeMillis());
    }
}
