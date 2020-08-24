package com.huobi.api.request.trade;

import com.huobi.api.enums.DirectionEnum;
import com.huobi.api.enums.OffsetEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/*
* 计划委托下单
* */


@Data
@AllArgsConstructor
@Builder
public class OptionTriggerOrderRequest {
    private String contractCode;//BTC-USDT-200508-C-8800
    private String triggerType;//触发类型： ge大于等于(触发价比最新价大)；le小于(触发价比最新价小)
    private BigDecimal triggerPrice;//触发价，精度超过最小变动单位会报错
    private BigDecimal orderPrice;//委托价，精度超过最小变动单位会报错
    private String orderPriceType;//委托类型： 不填默认为limit;	限价：limit ，最优5档：optimal_5，最优10档：optimal_10，最优20档：optimal_20
    private BigDecimal volume;//委托数量(张)
    private DirectionEnum direction;//buy:买 sell:卖
    private OffsetEnum offset;//open:开 close:平
}
