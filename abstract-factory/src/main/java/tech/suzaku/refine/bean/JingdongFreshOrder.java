/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine.bean;

/**
 * 京东生鲜订单
 *
 * @author 无羡 2022-07-06
 */
public class JingdongFreshOrder extends JingdongOrder {
    public JingdongFreshOrder(String orderNo) {
        super(orderNo);
    }

    /**
     * 京东生鲜配送费固定价15块
     */
    private int logisticsFee = 15;
}
