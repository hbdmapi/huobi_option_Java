package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class OptionFinancialRecordRequest {
    private String symbol;//品种代码	"BTC","ETH"...
    private String tradePartition; // 交易分区，不填默认”USDT“
    private String type;//不填查询全部类型,【查询多类型中间用，隔开】    开多：1，开空：2，平多：3，平空：4，开仓手续费-吃单：5，开仓手续费-挂单：6，平仓手续费-吃单：7，平仓手续费-挂单：8，交割平多：9，交割平空：10，交割手续费：11，从币币转入：14，转出至币币：15，系统：26，活动奖励：28，返利：29 ，转出到子账号合约账号：34，从子账号合约账号转入: 35, 转出到母账号合约账号: 36，从母账号合约账号转入：37
    private Integer createDate;//可随意输入正整数，如果参数超过90则默认查询90天的数据
    private Integer pageIndex;//第几页,不填默认第一页
    private Integer pageSize;//不填默认20，不得多于50
}
