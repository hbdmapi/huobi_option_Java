package com.huobi.api.request.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/*
* 现货-期权合约账户间进行资金的划转
* */

@Data
@AllArgsConstructor
@Builder
public class OptionTransferRequest {
    private String from;//来源业务线账户，取值：spot(币币)、option(期权)
    private String to;//目标业务线账户，取值：spot(币币)、option(期权)
    private String tradePartition;//交易区（目前只有USDT区）
    private String currency;//币种,支持大小写
    private BigDecimal amount;//划转金额
}
