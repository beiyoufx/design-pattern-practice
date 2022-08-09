/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author TGG 7/25/22
 */
public class LogisticsServiceImplTest {
    private static LogisticsService logisticsService = new LogisticsServiceImpl();

    @Test
    public void createOrder() {
        String trackingNo = logisticsService.createOrder("手机");
        System.out.println(trackingNo);
    }

    @Test
    public void createFreshOrder() {
        String trackingNo = logisticsService.createFreshOrder("帝王蟹");
        System.out.println(trackingNo);
    }
}