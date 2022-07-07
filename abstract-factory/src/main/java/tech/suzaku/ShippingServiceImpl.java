/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import tech.suzaku.bean.JingdongFreshOrder;
import tech.suzaku.bean.JingdongOrder;
import tech.suzaku.bean.ShunfengFreshOrder;
import tech.suzaku.bean.ShunfengOrder;
import tech.suzaku.logistics.JingdongLogisticsAdapter;
import tech.suzaku.logistics.ShunfengLogisticsAdapter;

/**
 * 发货服务
 *
 * @author 无羡 2022-07-06
 */
public class ShippingServiceImpl implements ShippingService {
    private ShunfengLogisticsAdapter shunfengLogisticsAdapter;
    private JingdongLogisticsAdapter jingdongLogisticsAdapter;

    public ShippingServiceImpl(ShunfengLogisticsAdapter shunfengLogisticsAdapter, JingdongLogisticsAdapter jingdongLogisticsAdapter) {
        this.shunfengLogisticsAdapter = shunfengLogisticsAdapter;
        this.jingdongLogisticsAdapter = jingdongLogisticsAdapter;
    }

    /**
     * 普通快递发货
     *
     * @param goodsName 商品名称
     * @param logisticsChannel 物流渠道
     */
    @Override
    public void shipNormal(String goodsName, String logisticsChannel) {
        String orderNo;
        int logisticsFee;
        if ("shunfeng".equalsIgnoreCase(logisticsChannel)) {
            JingdongOrder order = jingdongLogisticsAdapter.createOrder(goodsName);
            orderNo = order.getOrderNo();
            logisticsFee = order.getLogisticsFee();
        } else if ("jingdong".equalsIgnoreCase(logisticsChannel)) {
            ShunfengOrder order = shunfengLogisticsAdapter.createOrder(goodsName);
            orderNo = order.getOrderNo();
            logisticsFee = order.getLogisticsFee();
        } else {
            throw new RuntimeException("物流渠道错误");
        }

        System.out.println(goodsName + "发货完成,运单号=" + orderNo + ",费用=" + logisticsFee + "元.");
    }

    /**
     * 冷链物流发货
     *
     * @param goodsName 商品名称
     * @param logisticsChannel 物流渠道
     */
    @Override
    public void shipFresh(String goodsName, String logisticsChannel) {
        String orderNo;
        int logisticsFee;
        if ("shunfeng".equalsIgnoreCase(logisticsChannel)) {
            JingdongFreshOrder order = jingdongLogisticsAdapter.createFreshOrder(goodsName);
            orderNo = order.getOrderNo();
            logisticsFee = order.getLogisticsFee();
        } else if ("jingdong".equalsIgnoreCase(logisticsChannel)) {
            ShunfengFreshOrder order = shunfengLogisticsAdapter.createFreshOrder(goodsName);
            orderNo = order.getOrderNo();
            logisticsFee = order.getLogisticsFee();
        } else {
            throw new RuntimeException("物流渠道错误");
        }

        System.out.println(goodsName + "发货完成,运单号=" + orderNo + ",费用=" + logisticsFee + "元.");
    }
}
