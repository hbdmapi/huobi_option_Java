package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 获取用户的当前未成交委托
 */

@Data
@AllArgsConstructor
@Builder
public class OptionOpenordersRequest {
    private String symbol;//"BTC","ETH"，如果缺省，默认返回所有品种
    private String tradePartition;//"USDT"
    private String contractCode;//"BTC-USDT-200508-C-8800" ...
    private Integer pageIndex;//第几页,不填第一页
    private Integer pageSize;//不填默认20，不得多于50
}
