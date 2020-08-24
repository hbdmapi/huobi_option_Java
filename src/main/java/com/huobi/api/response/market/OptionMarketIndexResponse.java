package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionMarketIndexResponse {

    /**
     * "status":"ok",
     * "ts":1596790599417
     * "data":[{"askOne":2288.35,"bidOne":102,"contractCode":"BTC-USDT-200807-C-9500","contractType":"this_week","delta":1.00,"gamma":0E-8,"ivAskOne":5.000000000000000000,"ivBidOne":0E-18,"ivLastPrice":0E-18,"ivMarkPrice":0E-18,"lastPrice":102,"markPrice":2280.9670217399760000000000000000000000,"optionRightType":"C","symbol":"BTC","theta":-0.00208219,"tradePartition":"USDT","vega":0E-8}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "askOne":2288.35,
         * "bidOne":102,
         * "contractCode":"BTC-USDT-200807-C-9500",
         * "contractType":"this_week",
         * "delta":1,
         * "gamma":0,
         * "ivAskOne":5,
         * "ivBidOne":0,
         * "ivLastPrice":0,
         * "ivMarkPrice":0,
         * "lastPrice":102,
         * "markPrice":2280.967021739976,
         * "optionRightType":"C",
         * "symbol":"BTC",
         * "theta":-0.00208219,
         * "tradePartition":"USDT",
         * "vega":0
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("option_right_type")
        private String optionRightType;
        @SerializedName("iv_last_price")
        private BigDecimal ivLastPrice;
        @SerializedName("iv_ask_one")
        private BigDecimal ivAskOne;
        @SerializedName("iv_bid_one")
        private BigDecimal ivBidOne;
        @SerializedName("iv_mark_price")
        private BigDecimal ivMarkPrice;
        private BigDecimal delta;
        private BigDecimal gamma;
        private BigDecimal theta;
        private BigDecimal vega;
        @SerializedName("adk_one")
        private BigDecimal askOne;
        @SerializedName("bid_one")
        private BigDecimal bidOne;
        @SerializedName("last_price")
        private BigDecimal lastPrice;
        @SerializedName("mark_price")
        private BigDecimal markPrice;

    }
}
