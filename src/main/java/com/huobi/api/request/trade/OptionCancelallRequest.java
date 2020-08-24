package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 * 全部撤单
 * 备注
 * 只要有contract_code，则撤销该code的合约
 */
@Data
@AllArgsConstructor
@Builder
public class OptionCancelallRequest {
    private String symbol;//"BTC","ETH"...
    private String tradePartition;//"USDT"，不填默认”USDT“
    private String contractType;//合约类型 ("this_week":当周 "next_week":下周 "quarter":季度)
    private String contractCode;//BTC-USDT-200508-C-8800


}
