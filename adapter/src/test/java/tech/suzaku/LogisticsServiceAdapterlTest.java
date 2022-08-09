/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import org.junit.Test;
import tech.suzaku.refine.acl.JingdongLogisticsAdapter;
import tech.suzaku.refine.acl.ShunfengLogisticsAdapter;

/**
 * @author TGG 7/25/22
 */
public class LogisticsServiceAdapterlTest {

    @Test
    public void createOrder() {
        LogisticsService logisticsService = new ShunfengLogisticsAdapter();
        String trackingNo = logisticsService.createOrder("手机");
        System.out.println(trackingNo);

        logisticsService = new JingdongLogisticsAdapter();
        trackingNo = logisticsService.createOrder("手机");
        System.out.println(trackingNo);
    }

    @Test
    public void createFreshOrder() {
        LogisticsService logisticsService = new ShunfengLogisticsAdapter();
        String trackingNo = logisticsService.createFreshOrder("帝王蟹");
        System.out.println(trackingNo);

        logisticsService = new JingdongLogisticsAdapter();
        trackingNo = logisticsService.createFreshOrder("帝王蟹");
        System.out.println(trackingNo);
    }
}