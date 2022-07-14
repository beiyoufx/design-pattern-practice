/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku.refine;

import org.junit.Test;
import tech.suzaku.refine.logistics.JingdongLogisticsAdapter;
import tech.suzaku.refine.logistics.LogisticsService;
import tech.suzaku.refine.logistics.ShunfengLogisticsAdapter;

import static org.junit.Assert.*;

/**
 * @author TGG 2022-07-06
 */
public class ShippingServiceImplTest {

    @Test
    public void shipNormal() {
        LogisticsService logisticsService = new ShunfengLogisticsAdapter();
        ShippingService shippingService = new ShippingServiceImpl(logisticsService);
        shippingService.shipNormal("高端智能空调");


        logisticsService = new JingdongLogisticsAdapter();
        shippingService = new ShippingServiceImpl(logisticsService);
        shippingService.shipNormal("低端不智能只制冷空调");
    }

    @Test
    public void shipFresh() {
        LogisticsService logisticsService = new ShunfengLogisticsAdapter();
        ShippingService shippingService = new ShippingServiceImpl(logisticsService);
        shippingService.shipFresh("新鲜海底捞出来大螃蟹");

        logisticsService = new ShunfengLogisticsAdapter();
        shippingService = new ShippingServiceImpl(logisticsService);
        shippingService.shipFresh("新鲜獐子岛逃跑扇贝");
    }
}