package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionOpenInterestResponse {


    /**
     * "status":"ok",
     * "ts":1596790928089
     * "data":[{"amount":11.640000000000000000000000000000000000,"contractCode":"BTC-USDT-200807-C-7000","contractType":"this_week","symbol":"BTC","tradePartition":"USDT","volume":11640.000000000000000000},{"amount":0.690000000000000000000000000000000000,"contractCode":"BTC-USDT-200807-P-7000","contractType":"this_week","symbol":"BTC","tradePartition":"USDT","volume":690.000000000000000000}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "amount":11.64,
         * "contractCode":"BTC-USDT-200807-C-7000",
         * "contractType":"this_week",
         * "symbol":"BTC",
         * "tradePartition":"USDT",
         * "volume":11640
         */

        private BigDecimal volume;
        private BigDecimal amount;
        private String symbol;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("trade_partition")
        private String tradePartition;

    }
}
