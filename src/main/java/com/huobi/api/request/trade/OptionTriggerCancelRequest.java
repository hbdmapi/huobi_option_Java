package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
 * 计划委托撤单
 * */

@Data
@AllArgsConstructor
@Builder
public class OptionTriggerCancelRequest {
    private String symbol;//"BTC","ETH" ...
    private String tradePartition;//	"USDT"
    private String orderId;//用户订单ID（多个订单ID中间以","分隔,一次最多允许撤消20个订单 ）
}
