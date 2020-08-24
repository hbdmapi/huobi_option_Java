package com.huobi.future.wss;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.huobi.wss.event.MarketDepthSubResponse;
import com.huobi.wss.event.MarketDetailSubResponse;
import com.huobi.wss.event.MarketKLineSubResponse;
import com.huobi.wss.handle.WssMarketHandle;
import com.huobi.wss.event.MarketTradeDetailSubResponse;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.util.List;

public class WssMarketSubTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private String URL = "wss://api.hbdm.com/option-ws";//合约站行情请求以及订阅地址
    WssMarketHandle wssMarketHandle = new WssMarketHandle(URL);


    /**
     * 订阅 KLine 数据
     * market.$contract_code.kline.$period
     * $contract_code "BTC-USDT-200508-C-8800" ...
     * $period 如 1min, 5min, 15min, 30min, 1hour,4hour,1day, 1mon
     * <p>
     * 注：一个webSocket 可以一次订阅多个
     *
     * @throws URISyntaxException
     * @throws InterruptedException
     */
    @Test
    public void test1() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        channels.add("market.BTC-USDT-200814-C-9500.kline.1min");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.5min");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.15min");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.30min");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.60min");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.4hour");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.1day");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.1week");
       // channels.add("market.BTC-USDT-200814-C-9500.kline.1mon");



        wssMarketHandle.sub(channels, response -> {
            logger.info("kLineEvent用户收到的数据===============:{}", JSON.toJSON(response));
            Long currentTimeMillis = System.currentTimeMillis();
            MarketKLineSubResponse event = JSON.parseObject(response, MarketKLineSubResponse.class);
            logger.info("kLineEvent的ts为：{},当前的时间戳为：{},时间间隔为：{}毫秒", event.getTs(), currentTimeMillis, currentTimeMillis - event.getTs());
        });
        Thread.sleep(Integer.MAX_VALUE);


    }


    /**
     * 订阅 Market Depth 数据
     * market.$contract_code.depth.$type
     * $contract_code 如 "BTC-USDT-200508-C-8800".
     * $type  获得150档深度数据，使用step0, step1, step2, step3, step4, step5，step14，step15（step1至step5以及step14、step15是进行了深度合并后的深度），使用step0时，不合并深度获取150档数据;获得20档深度数据，使用 step6, step7, step8, step9, step10, step11, step12, step13（step7至step13是进行了深度合并后的深度），使用step6时，不合并深度获取20档数据
     * <p>
     * 注：一个webSocket 可以一次订阅多个
     *
     * @throws URISyntaxException
     * @throws InterruptedException
     */
    @Test
    public void test2() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        //channels.add("market.ETH-USDT-200814-C-9500.depth.step0");
        channels.add("market.BTC-USDT-200814-C-9500.depth.step0");
        wssMarketHandle.sub(channels, response -> {
            logger.info("depthEvent用户收到的数据===============:{}", JSON.toJSON(response));
            Long currentTimeMillis = System.currentTimeMillis();
            MarketDepthSubResponse event = JSON.parseObject(response, MarketDepthSubResponse.class);
            logger.info("depthEvent的ts为：{},当前的时间戳为：{},时间间隔为：{}毫秒", event.getTs(), currentTimeMillis, currentTimeMillis - event.getTs());
            logger.info("数据大小为:{}", event.getTick().getAsks().size());
        });
        Thread.sleep(Integer.MAX_VALUE);

    }


    /**
     * 订阅 Market detail 数据
     * market.$contract_code.detail
     * contract_code 如"BTC-USDT-200508-C-8800"，填* 时代表订阅所有合约
     * <p>
     * 注：一个webSocket 可以一次订阅多个
     *
     * @throws URISyntaxException
     * @throws InterruptedException
     */
    @Test
    public void test3() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        channels.add("market.BTC-USDT-200814-C-9500.detail");
        //channels.add("market.ETH-USDT-200814-C-9500.detail");
        wssMarketHandle.sub(channels, response -> {
            logger.info("detailEvent用户收到的数据===============:{}", JSON.toJSON(response));
            Long currentTimeMillis = System.currentTimeMillis();
            MarketDetailSubResponse event = JSON.parseObject(response, MarketDetailSubResponse.class);
            logger.info("detailEvent的ts为：{},当前的时间戳为：{},时间间隔为：{}毫秒", event.getTs(), currentTimeMillis, currentTimeMillis - event.getTs());
        });
        Thread.sleep(Integer.MAX_VALUE);
    }


    /**
     * 订阅 Trade Detail 数据
     * market.$contract_code.trade.detail
     * contract_code 如"BTC-USDT-200508-C-8800"，填* 时代表订阅所有合约
     *
     * @throws URISyntaxException
     * @throws InterruptedException
     */
    @Test
    public void test4() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        channels.add("market.BTC-USDT-200814-C-9500.trade.detail");
       // channels.add("market.ETH-USDT-200814-C-9500.trade.detail");
        wssMarketHandle.sub(channels, response -> {
            logger.info("订阅TradeDetail数据用户收到的数据===============:{}", JSON.toJSON(response));
            Long currentTimeMillis = System.currentTimeMillis();
            MarketTradeDetailSubResponse event = JSON.parseObject(response, MarketTradeDetailSubResponse.class);
            logger.info("tradeDetailEvent的ts为：{},当前的时间戳为：{},时间间隔为：{}毫秒", event.getTs(), currentTimeMillis, currentTimeMillis - event.getTs());
                  });
        Thread.sleep(Integer.MAX_VALUE);
    }


}
