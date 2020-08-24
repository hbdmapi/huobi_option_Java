package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionAccountPositionInfoResponse {

    /**
     * "status":"ok",
     * "ts":1596765568149
     * "data":[{"delta":-0.08862725933314804094329937906883513000000000000000,"feeAsset":"USDT","feeFrozen":0,"gamma":-0.00000420156000000000000000,"marginAsset":"BTC","marginAvailable":10000999.297314411752732642000000000000000000,"marginBalance":10000999.797314411752732642,"marginFrozen":0.301000000000000000000000000000000000,"marginPosition":0.199000000000000000000000000000000000,"marginStatic":10000999.797314411752732642,"optionValue":-393.98733000000000000000,"positions":[{"available":100,"contractCode":"BTC-USDT-200828-C-8000","contractType":"this_week","costHold":4081.550000000000000000,"costOpen":4081.550000000000000000,"deliveryDate":"20200828","direction":"buy","exercisePrice":8000.000000000000000000,"frozen":0,"lastPrice":3979.67,"marginAsset":"BTC","marginPosition":0,"optionRightType":"C","positionValue":397.96700000000000000000,"profit":-0.500000000000000000,"profitRate":-0.024961105462385613,"profitUnreal":-10.188000000000000000000000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT","volume":100},{"available":199,"contractCode":"BTC-USDT-200828-C-8000","contractType":"this_week","costHold":3979.670000000000000000,"costOpen":3979.670000000000000000,"deliveryDate":"20200828","direction":"sell","exercisePrice":8000.000000000000000000,"frozen":0,"lastPrice":3979.67,"marginAsset":"BTC","marginPosition":0.199000000000000000000000000000000000,"optionRightType":"C","positionValue":-791.95433000000000000000,"profit":-0.995000000000000000,"profitRate":0E-18,"profitUnreal":0E-36,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT","volume":199}],"premiumFrozen":0,"premiumIN":0E-18,"premiumOut":0E-18,"profitReal":0E-18,"profitUnreal":0,"symbol":"BTC","theta":1.37269786599000000000000000,"tradePartition":"USDT","vega":-0.49122149076000000000000000,"withdrawAvailable":10000999.297314411752732642000000000000000000}]
     */
    private String Status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {

        /**
         * "delta":-0.08862725933314804094329937906883513,
         * "feeAsset":"USDT",
         * "feeFrozen":0,
         * "gamma":-0.00000420156,
         * "marginAsset":"BTC",
         * "marginAvailable":10000999.297314411752732642,
         * "marginBalance":10000999.797314411752732642,
         * "marginFrozen":0.301,
         * "marginPosition":0.199,
         * "marginStatic":10000999.797314411752732642,
         * "optionValue":-393.98733,
         * "premiumFrozen":0,
         * "premiumIN":0,
         * "premiumOut":0,
         * "profitReal":0,
         * "profitUnreal":0,
         * "symbol":"BTC",
         * "theta":1.37269786599,
         * "tradePartition":"USDT",
         * "vega":-0.49122149076,
         * "withdrawAvailable":10000999.297314411752732642
         * "positions":[{"available":100,"contractCode":"BTC-USDT-200828-C-8000","contractType":"this_week","costHold":4081.550000000000000000,"costOpen":4081.550000000000000000,"deliveryDate":"20200828","direction":"buy","exercisePrice":8000.000000000000000000,"frozen":0,"lastPrice":3979.67,"marginAsset":"BTC","marginPosition":0,"optionRightType":"C","positionValue":397.96700000000000000000,"profit":-0.500000000000000000,"profitRate":-0.024961105462385613,"profitUnreal":-10.188000000000000000000000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT","volume":100},{"available":199,"contractCode":"BTC-USDT-200828-C-8000","contractType":"this_week","costHold":3979.670000000000000000,"costOpen":3979.670000000000000000,"deliveryDate":"20200828","direction":"sell","exercisePrice":8000.000000000000000000,"frozen":0,"lastPrice":3979.67,"marginAsset":"BTC","marginPosition":0.199000000000000000000000000000000000,"optionRightType":"C","positionValue":-791.95433000000000000000,"profit":-0.995000000000000000,"profitRate":0E-18,"profitUnreal":0E-36,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT","volume":199}]
         */


        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("margin_balance")
        private BigDecimal marginBalance;
        @SerializedName("margin_position")
        private BigDecimal marginPosition;
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        @SerializedName("margin_available")
        private BigDecimal marginAvailable;
        @SerializedName("profit_real")
        private BigDecimal profitReal;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("withdraw_available")
        private BigDecimal withdrawAvailable;
        @SerializedName("margin_static")
        private BigDecimal marginStatic;
        @SerializedName("premium_frozen")
        private BigDecimal premiumFrozen;
        @SerializedName("fee_frozen")
        private BigDecimal feeFrozen;
        @SerializedName("fee_asset")
        private String feeAsset;
        @SerializedName("premium_in")
        private BigDecimal premiumIN;
        @SerializedName("premium_out")
        private BigDecimal premiumOut;
        private BigDecimal delta;
        private BigDecimal gamma;
        private BigDecimal theta;
        private BigDecimal vega;
        @SerializedName("option_value")
        private BigDecimal optionValue;
        @SerializedName("margin_asset")
        private String marginAsset;
        private List<PositionsBean> positions;

        @Data
        @AllArgsConstructor
        @Builder
        public static class PositionsBean {

            /**
             * "available":100,
             * "contractCode":"BTC-USDT-200828-C-8000",
             * "contractType":"this_week",
             * "costHold":4081.55,
             * "costOpen":4081.55,
             * "deliveryDate":"20200828",
             * "direction":"buy",
             * "exercisePrice":8000,
             * "frozen":0,
             * "lastPrice":3979.67,
             * "marginAsset":"BTC",
             * "marginPosition":0,
             * "optionRightType":"C",
             * "positionValue":397.967,
             * "profit":-0.5,
             * "profitRate":-0.024961105462385613,
             * "profitUnreal":-10.188,
             * "quoteAsset":"USDT",
             * "symbol":"BTC",
             * "tradePartition":"USDT",
             * "volume":100
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
}
