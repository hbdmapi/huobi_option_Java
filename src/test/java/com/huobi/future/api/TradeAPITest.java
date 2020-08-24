package com.huobi.future.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.constants.HuobiFutureAPIOptions;
import com.huobi.api.enums.DirectionEnum;
import com.huobi.api.enums.OffsetEnum;
import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;
import com.huobi.api.service.trade.TradeAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.JVM)
public class TradeAPITest implements BaseTest {

    TradeAPIServiceImpl huobiAPIService = new TradeAPIServiceImpl("", "");

    @Test
    public void contractOrderRequest() {

        OptionOrderRequest request = OptionOrderRequest.builder()
                .contractCode("BTC-USDT-200821-C-12250")
                .volume(2l)
                .price(BigDecimal.valueOf(100))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .orderPriceType("opponent")
                .build();
        OptionOrderResponse response =
                huobiAPIService.optionOrderRequest(request);
        logger.debug("1合约下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void contractBatchorderRequest() {
        List<OptionOrderRequest> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            OptionOrderRequest request = OptionOrderRequest.builder()
                    .contractCode("BTC-USDT-200807-C-9500")
                    .volume(1000l)
                    .price(BigDecimal.valueOf(100))
                    .direction(DirectionEnum.SELL)
                    .offset(OffsetEnum.OPEN)
                    .orderPriceType("limit")
                    .build();
            list.add(request);
        }
        OptionBatchorderRequest request = OptionBatchorderRequest.builder()
                .list(list)
                .build();
        OptionBatchorderResponse response =
                huobiAPIService.optionBatchorderRequest(request);
        logger.debug("2.合约批量下单：{}", JSON.toJSONString(response));
    }


    @Test
    public void contractCancelRequest() {
        OptionCancelRequest request = OptionCancelRequest.builder()
                .tradePartition("usdt")
                .orderId("741350788378406912,741350788508430336")
                //.clientOrderId("")
                .build();
        OptionCancelResponse response =
                huobiAPIService.optionCancelRequest(request);
        logger.debug("3.撤销订单：{}", JSON.toJSONString(response));
    }


    @Test
    public void contractCancelallRequest() {
        OptionCancelallRequest request = OptionCancelallRequest.builder()
                .symbol("btc")
                .tradePartition("usdt")
                .contractType("")
                .contractCode("")
                .build();
        OptionCancelallResponse response =
                huobiAPIService.optionCancelallRequest(request);
        logger.debug("4全部撤单：{}", JSON.toJSONString(response));
    }


    @Test
    public void contractOrderInfoRequest() {
        OptionOrderInfoRequest request = OptionOrderInfoRequest.builder()
                .symbol("BTC")
                //.tradePartition("USDT")
                //.clientOrderId("")
                .orderId("742331811614437376")
                .build();
        OptionOrderInfoResponse response =
                huobiAPIService.optionOrderInfoRequest(request);
        logger.debug("5获取合约订单信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void contractOrderDetailRequest() {
        OptionOrderDetailRequest request = OptionOrderDetailRequest.builder()
                .symbol("BTC")
                .tradePartition("usdt")
                .orderId(742331811614437376l)
                //.createdAt(System.currentTimeMillis())
                .orderType(1)
                .build();
        OptionOrderDetailResponse response =
                huobiAPIService.optionOrderDetailRequest(request);
        logger.debug("6.获取订单明细信息：{}", JSON.toJSONString(response));
    }


    @Test
    public void contractOpenordersRequest() {
        OptionOpenordersRequest request = OptionOpenordersRequest.builder()
                .symbol("btc")
                .build();
        OptionOpenordersResponse response =
                huobiAPIService.optionOpenordersRequest(request);
        logger.debug("7.获取合约当前未成交委托：{}", JSON.toJSONString(response));
    }


    @Test
    public void optionHisordersRequest() {
        OptionHisordersRequest request = OptionHisordersRequest.builder()
                .symbol("BTC")
                .tradePartition("USDT")
                //.contractCode("BTC-USDT-200807-C-9500")
                .tradeType(0)
                .type(1)
                .status(0)
                .createDate(10)
                .pageIndex(1)
                .pageSize(5)
                .build();
        OptionHisordersResponse response =
                huobiAPIService.optionHisordersRequest(request);
        logger.debug("8.获取合约历史委托：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionMatchresultsRequest() {
        OptionMatchresultsRequest request = OptionMatchresultsRequest.builder()
                .symbol("btc")
                .tradeType(0)
                .createDate(90)
                .pageIndex(1)
                .pageSize(5)
                .build();
        OptionMatchresultsResponse response =
                huobiAPIService.optionMatchresultsRequest(request);
        logger.debug("9.获取历史成交记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionLightningClosePositionRequest() {
        OptionLightningClosePositionRequest request = OptionLightningClosePositionRequest.builder()
                .contractCode("BTC-USDT-200814-C-8500")
                .direction("sell")
                .volume(1)
                .build();
        OptionLightningClosePositionResponse response =
                huobiAPIService.optionLightningClosePositionRequest(request);
        logger.debug("10.闪电平仓下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionTriggerOrderRequest() {
        OptionTriggerOrderRequest request = OptionTriggerOrderRequest.builder()
                .contractCode("BTC-USDT-200814-P-8500")
                .triggerType("ge")
                .triggerPrice(BigDecimal.valueOf(4600))
                .orderPrice(BigDecimal.valueOf(4600))
                .orderPriceType("limit")
                .volume(BigDecimal.valueOf(1))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .build();
        OptionTriggerOrderResponse response = huobiAPIService.optionTriggerOrderResponse(request);
        logger.debug("11.计划委托下单：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionTriggerCancelRequest() {
        OptionTriggerCancelRequest request = OptionTriggerCancelRequest.builder()
                .orderId("742383732068986880")
                .symbol("btc")
                .tradePartition("usdt")
                .build();
        OptionTriggerCancelResponse response = huobiAPIService.optionTriggerCancelResponse(request);
        logger.debug("12.计划委托撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionTriggerCancelallRequest() {
        OptionTriggerCancelallRequest request = OptionTriggerCancelallRequest.builder()
                .symbol("btc")
                // .contractCode("")
                // .contractType("")
                // .tradePartition("")
                .build();
        OptionTriggerCancelallResponse response = huobiAPIService.optionTriggerCancelallResponse(request);
        logger.debug("13.计划委托全部撤单：{}", JSON.toJSONString(response));
    }

    @Test
    public void optionTriggerOpenordersRequest() {
        OptionTriggerOpenordersRequest request = OptionTriggerOpenordersRequest.builder()
                .symbol("btc")
                // .tradePartition("")
                // .contractCode("")
                // .pageIndex(1)
                // .pageSize(1)
                .build();
        OptionTriggerOpenordersResponse response = huobiAPIService.optionTriggerOpenordersResponse(request);
        logger.debug("14.获取计划委托当前委托：{}", JSON.toJSONString(response));

    }

    @Test
    public void optionTriggerHisordersRequest() {
        OptionTriggerHisordersRequest request = OptionTriggerHisordersRequest.builder()
                .symbol("btc")
                .tradeType(0)
                .status("0")
                .createDate(10l)
                .tradePartition("usdt")
                //.contractCode("")
                //.pageIndex(1)
                //.pageSize(1)
                .build();
        OptionTriggerHisordersResponse response = huobiAPIService.optionTriggerHisordersResponse(request);
        logger.debug("15.获取计划委托历史委托：{}", JSON.toJSONString(response));
    }
}
