package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 获取历史成交记录
 */
@Data
@AllArgsConstructor
@Builder
public class OptionMatchresultsRequest {
    private String symbol;//"BTC","ETH"，如果缺省，默认返回所有品种
    private String tradePartition;//"USDT"
    private Integer tradeType;//交易类型	0:全部,1:买入开多,2: 卖出开空,3: 买入平空,4: 卖出平多
    private Integer createDate;//可随意输入正整数，如果参数超过90则默认查询90天的数据
    private String contractCode;// BTC-USDT-200508-C-8800
    private Integer pageIndex;//页码，不填默认第1页	1
    private Integer pageSize;//每页条数，不填默认20	20	不得多于50
}
