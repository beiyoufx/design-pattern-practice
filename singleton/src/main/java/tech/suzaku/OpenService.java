/*
 * Copyright (c) 2022.
 * 公众号：Java实践笔记
 * 转载前请联系作者授权，请勿用于商业用途。
 *
 */

package tech.suzaku;

/**
 * @author TGG 2022-07-18
 */
public class OpenService {
    private static final String API_URL = "http://open.suzaku.tech/rest";
    private static final String APP_KEY = "java_note";
    private static final String APP_SECRET = "123456";
    private static OpenClient openClient;

    static {
        OpenConfig config = new OpenConfig();
        config.setApiUrl(API_URL);
        config.setAppKey(APP_KEY);
        config.setSecret(APP_SECRET);

        openClient = new OpenClient(config);
    }

    private OpenClient getOpenClient() {
        return openClient;
    }

    public String hello(String world) {
        OpenRequest request = new OpenRequest();
        request.setMethod("hello");
        request.setParams(world);

        return getOpenClient().execute(request);
    }
}
