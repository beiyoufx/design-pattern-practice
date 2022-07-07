/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

/**
 * 发货服务
 *
 * @author 无羡 2022-07-06
 */
public interface ShippingService {

    /**
     * 普通快递发货
     *
     * @param goodsName 商品名称
     * @param logisticsChannel 物流渠道
     */
    void shipNormal(String goodsName, String logisticsChannel);

    /**
     * 冷链物流发货
     *
     * @param goodsName 商品名称
     * @param logisticsChannel 物流渠道
     */
    void shipFresh(String goodsName, String logisticsChannel);
}
