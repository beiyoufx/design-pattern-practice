/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.bean;

/**
 * 顺丰速运订单
 *
 * @author 无羡 2022-07-06
 */
public class ShunfengOrder {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 物流费
     */
    private int logisticsFee = 10;

    public ShunfengOrder(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(int logisticsFee) {
        this.logisticsFee = logisticsFee;
    }
}
