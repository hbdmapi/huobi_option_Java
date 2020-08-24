package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionPriceLimitResponse {

    /**
     * "status":"ok",
     * "ts":1596791099742
     * "data":[{"contractCode":"BTC-USDT-200807-C-9500","contractType":"this_week","highLimit":3462.890000000000000000,"lowLimit":1099.040000000000000000,"symbol":"BTC","tradePartition":"USDT"}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "contractCode":"BTC-USDT-200807-C-9500",
         * "contractType":"this_week",
         * "highLimit":3462.89,
         * "lowLimit":1099.04,
         * "symbol":"BTC",
         * "tradePartition":"USDT"
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("high_limit")
        private BigDecimal highLimit;
        @SerializedName("low_limit")
        private BigDecimal lowLimit;
        @SerializedName("trade_Partition")
        private String tradePartition;

    }
}
