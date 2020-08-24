package com.huobi.future.wss;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.huobi.wss.handle.WssNotificationHandle;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.util.List;

public class WssNotificationSubTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private String URL = "wss://api.hbdm.com/option-notification";//订单推送访问地址
    WssNotificationHandle wssNotificationHandle = new WssNotificationHandle(URL, "", "");


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
