package com.huobi.future.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.enums.TimePeriodTypeEnum;
import com.huobi.api.request.account.OptionMarketHistoryKlineRequest;
import com.huobi.api.response.market.*;
import com.huobi.api.service.market.MarketAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class MarketAPITest implements BaseTest {

    MarketAPIServiceImpl huobiAPIService = new MarketAPIServiceImpl();


    @Test
    public void getContractContractInfo() {
        OptionContractInfoResponse result =
                huobiAPIService.getOptionContractInfo("btc", "usdt","", "");
        logger.debug("1.获取合约信息：{}", JSON.toJSONString(result));
    }


    @Test
    public void getContractIndex() {
        OptionIndexResponse result =
                huobiAPIService.getOptionIndex("btc-usdt");
        logger.debug("2.获取合约指数信息：{}", JSON.toJSONString(result));
    }

    @Test
    public void getContractPriceLimit() {
        OptionPriceLimitResponse result =
                huobiAPIService.getOptionPriceLimit("BTC-USDT-200807-C-9500");
        logger.debug("3.获取合约最高限价和最低限价：{}", JSON.toJSONString(result));
    }

    @Test
    public void getOptionMarketIndex(){
        OptionMarketIndexResponse result=
                huobiAPIService.getOptionMarketIndex("btc","usdt","this_week","c","BTC-USDT-200807-C-9500");
        logger.debug("4.查询合约市场指标:{}",JSON.toJSONString(result));
    }

    @Test
    public void getOptionOpenInterest() {
        OptionOpenInterestResponse result =
                huobiAPIService.getOptionOpenInterest("btc", "usdt","this_week", "");
        logger.debug("5.获取当前可用合约总持仓量：{}", JSON.toJSONString(result));
        result = huobiAPIService.getOptionOpenInterest("", "","", "");
        logger.debug("5.获取当前可用合约总持仓量：{}", JSON.toJSONString(result));
    }

    @Test
    public void getOptionDeliveryPrice() {
        OptionDeliveryPriceResponse result =
                huobiAPIService.getOptionDeliveryPrice("btc","usdt");
        logger.debug("6.获取预估交割价：{}", JSON.toJSONString(result));
    }

    @Test
    public void getOptionHisOpenInterestResponse() {
        OptionHisOpenInterestResponse result =
                huobiAPIService.getOptionHisOpenInterest("btc","usdt" ,"this_week", TimePeriodTypeEnum.ONE_DAY, 10, 1,"c");
        logger.debug("7.平台持仓量的查询：{}", JSON.toJSONString(result));
    }

    @Test
    public void getOptionApiState() {
        OptionApiStateResponse result =
                huobiAPIService.getOptionApiState("","");
        logger.debug("8.查询系统状态：{}", JSON.toJSONString(result));
    }


    @Test
    public void getOptionMarketDepth() {
        OptionMarketDepthResponse result =
                huobiAPIService.getOptionMarketDepth("BTC-USDT-200807-C-9500", "step0");
        logger.debug("9.获取行情深度数据：{}", JSON.toJSONString(result));
    }


    @Test
    public void getOptionMarketHistoryKline() {
        OptionMarketHistoryKlineRequest request=OptionMarketHistoryKlineRequest.builder()
                .contractCode("BTC-USDT-200821-C-11905")
                .period("1min")
                .size(100)
                //.from(1594864800)
                //.to(1594864800)
                .build();
        OptionMarketHistoryKlineResponse result =
                huobiAPIService.getOptionMarketHistoryKline(request);
        logger.debug("10.获取K线数据：{}", JSON.toJSONString(result));
    }

    @Test
    public void getOptionMarketDetailMerged() {
        OptionMarketDetailMergedResponse result =
                huobiAPIService.getOptionMarketDetailMerged("BTC-USDT-200821-C-11905");
        logger.debug("11.获取聚合行情：{}", JSON.toJSONString(result));
    }

    @Test
    public void getOptionMarketTrade() {
        OptionMarketTradeResponse result =
                huobiAPIService.getOptionMarketTrade("BTC-USDT-200807-C-9500");
        logger.debug("12.获取市场最近成交记录：{}", JSON.toJSONString(result));
    }

    @Test
    public void getOptionMarketHistoryTrade() {
        OptionMarketHistoryTradeResponse result =
                huobiAPIService.getOptionMarketHistoryTrade("BTC-USDT-200807-C-9500", 10);
        logger.debug("13.批量获取最近的交易记录：{}", JSON.toJSONString(result));
    }

}
