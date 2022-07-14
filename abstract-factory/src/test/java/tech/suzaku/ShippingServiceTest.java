/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import org.junit.Test;
import tech.suzaku.logistics.JingdongLogisticsAdapter;
import tech.suzaku.logistics.ShunfengLogisticsAdapter;

/**
 * @author TGG 2022-07-06
 */
public class ShippingServiceTest {

    @Test
    public void shipNormal() {
        ShunfengLogisticsAdapter shunfengLogisticsAdapter = new ShunfengLogisticsAdapter();
        JingdongLogisticsAdapter jingdongLogisticsAdapter = new JingdongLogisticsAdapter();
        ShippingService shippingService = new ShippingServiceImpl(shunfengLogisticsAdapter, jingdongLogisticsAdapter);

        shippingService.shipNormal("高端智能空调", "shunfeng");
        shippingService.shipNormal("低端不智能只制冷空调", "jingdong");
    }

    @Test
    public void shipFresh() {
        ShunfengLogisticsAdapter shunfengLogisticsAdapter = new ShunfengLogisticsAdapter();
        JingdongLogisticsAdapter jingdongLogisticsAdapter = new JingdongLogisticsAdapter();
        ShippingService shippingService = new ShippingServiceImpl(shunfengLogisticsAdapter, jingdongLogisticsAdapter);

        shippingService.shipFresh("新鲜海底捞出来大螃蟹", "shunfeng");
        shippingService.shipFresh("新鲜獐子岛逃跑扇贝", "jingdong");
    }
}