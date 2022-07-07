/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine;

import tech.suzaku.refine.bean.Order;
import tech.suzaku.refine.logistics.LogisticsService;

/**
 * @author 无羡 2022-07-06
 */
public class ShippingServiceImpl implements ShippingService {
    private LogisticsService logisticsService;

    public ShippingServiceImpl(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    /**
     * 普通快递发货
     *
     * @param goodsName 商品名称
     */
    @Override
    public void shipNormal(String goodsName) {
        Order order = logisticsService.createOrder(goodsName);
        String orderNo = order.getOrderNo();
        int logisticsFee = order.getLogisticsFee();

        System.out.println(goodsName + "发货完成,运单号=" + orderNo + ",费用=" + logisticsFee + "元.");
    }

    /**
     * 冷链物流发货
     *
     * @param goodsName 商品名称
     */
    @Override
    public void shipFresh(String goodsName) {
        Order order = logisticsService.createFreshOrder(goodsName);
        String orderNo = order.getOrderNo();
        int logisticsFee = order.getLogisticsFee();

        System.out.println(goodsName + "发货完成,运单号=" + orderNo + ",费用=" + logisticsFee + "元.");
    }
}
