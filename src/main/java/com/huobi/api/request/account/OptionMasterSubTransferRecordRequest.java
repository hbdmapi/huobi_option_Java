package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class OptionMasterSubTransferRecordRequest {
    private String symbol;// 资产品种	"BTC","ETH"...
    private String tradePartition;// 交易分区，不填默认”USDT“
    private String transferType;// 34:转出到子账号合约账户 35:从子账号合约账户转入
    private Integer createDate;// 可随意输入正整数，如果参数超过90则默认查询90天的数据
    private Integer pageIndex;// 页码，不填默认第1页
    private Integer pageSize;// 不填默认20，不得多于50
}
