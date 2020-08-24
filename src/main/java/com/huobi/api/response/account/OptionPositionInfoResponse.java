package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionPositionInfoResponse {

    /**
     * "status":"ok",
     * "ts":1596782794955
     * "data":[{"available":2,"contractCode":"BTC-USDT-200807-C-8000","contractType":"this_week","costHold":3769.750000000000000000,"costOpen":3769.750000000000000000,"deliveryDate":"20200807","direction":"buy","exercisePrice":8000.000000000000000000,"frozen":0,"lastPrice":3769.75,"marginAsset":"BTC","marginPosition":0,"optionRightType":"C","positionValue":7.53950000000000000000,"profit":-0.010000000000000000,"profitRate":0E-18,"profitUnreal":0E-36,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT","volume":2}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "available":2,
         * "contractCode":"BTC-USDT-200807-C-8000",
         * "contractType":"this_week",
         * "costHold":3769.75,
         * "costOpen":3769.75,
         * "deliveryDate":"20200807",
         * "direction":"buy",
         * "exercisePrice":8000,
         * "frozen":0,
         * "lastPrice":3769.75,
         * "marginAsset":"BTC",
         * "marginPosition":0,
         * "optionRightType":"C",
         * "positionValue":7.5395,
         * "profit":-0.01,
         * "profitRate":0,
         * "profitUnreal":0,
         * "quoteAsset":"USDT",
         * "symbol":"BTC",
         * "tradePartition":"USDT",
         * "volume":2
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("contract_type")
        private String contractType;
        private BigDecimal volume;
        private BigDecimal available;
        private BigDecimal frozen;
        @SerializedName("cost_open")
        private BigDecimal costOpen;
        @SerializedName("cost_hold")
        private BigDecimal costHold;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("profit_rate")
        private BigDecimal profitRate;
        private BigDecimal profit;
        @SerializedName("margin_position")
        private BigDecimal marginPosition;
        @SerializedName("position_value")
        private BigDecimal positionValue;
        private String direction;
        @SerializedName("last_price")
        private BigDecimal lastPrice;
        @SerializedName("delivery_date")
        private String deliveryDate;
        @SerializedName("option_right_type")
        private String optionRightType;
        @SerializedName("exercise_price")
        private BigDecimal exercisePrice;
        @SerializedName("quote_asset")
        private String quoteAsset;
        @SerializedName("margin_asset")
        private String marginAsset;


    }
}
