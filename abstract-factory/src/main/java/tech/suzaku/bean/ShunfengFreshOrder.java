/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.bean;

/**
 * 顺丰生鲜订单
 *
 * @author 无羡 2022-07-06
 */
public class ShunfengFreshOrder extends ShunfengOrder {
    public ShunfengFreshOrder(String orderNo) {
        super(orderNo);
    }

    /**
     * 生鲜订单配送费要贵
     *
     * @return
     */
    @Override
    public int getLogisticsFee() {
        return super.getLogisticsFee() * 2;
    }
}
