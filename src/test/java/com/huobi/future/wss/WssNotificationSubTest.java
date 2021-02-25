package com.huobi.future.wss;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.huobi.wss.handle.WssNotificationHandle;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.util.List;


/**
 * 注意：
 * 当更换域名时，需要去：WssNotificationHandle 类里面将 addAuth() 方法里的域名一起更换掉。
 * as.createSignature(accessKey, secretKey, "GET", "api.hbdm.com", "/option-notification", map);
 */
public class WssNotificationSubTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private String host = "api.hbdm.vn";
    private String url = "/option-notification";//注意前面一定要带上"/"
    WssNotificationHandle wssNotificationHandle = new WssNotificationHandle(host, url, "", "");


    @Test
    public void test1() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        channels.add("orders.btc-usdt");
        channels.add("positions.BTC-USDT");
        channels.add("accounts.BTC-USDT");
        wssNotificationHandle.sub(channels, response -> {
            logger.info("用户收到的数据===============:{}", JSON.toJSON(response));
        });
        Thread.sleep(Integer.MAX_VALUE);
    }


}
