package com.huobi.api.request.trade;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
* 获取计划委托当前委托
* */

@Data
@AllArgsConstructor
@Builder
public class OptionTriggerOpenordersRequest {
    private  String symbol;//"BTC","ETH"...
    private  String tradePartition;//"USDT"
    private  String contractCode;//"BTC-USDT-200508-C-8800"
    private Integer pageIndex;//第几页，不填默认第一页
    private Integer pageSize;//不填默认20，不得多于50

}
