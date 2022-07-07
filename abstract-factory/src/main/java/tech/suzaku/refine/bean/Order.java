/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine.bean;

/**
 * 订单抽象
 *
 * @author 无羡 2022-07-06
 */
public interface Order {
    String getOrderNo();
    int getLogisticsFee();
}
