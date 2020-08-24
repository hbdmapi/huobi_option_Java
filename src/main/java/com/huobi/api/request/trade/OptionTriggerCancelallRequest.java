package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
*计划委托全部撤单
* */

@Data
@AllArgsConstructor
@Builder
public class OptionTriggerCancelallRequest {
    private String symbol;//"BTC","ETH"...
    private String tradePartition;//"USDT"，不填默认”USDT“
    private String contractCode;//"BTC-USDT-200508-C-8800"
    private String contractType;//当周:"this_week", 次周:"next_week", 季度:"quarter"

}
