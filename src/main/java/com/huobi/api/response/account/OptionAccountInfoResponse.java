package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionAccountInfoResponse {

    /**
     * "status":"ok",
     * "ts":1596764435891
     * "data":[{"feeAsset":"USDT","feeFrozen":0,"marginAsset":"BTC","marginAvailable":10000999.797314411752732642,"marginBalance":10000999.797314411752732642,"marginFrozen":0,"marginPosition":0,"marginStatic":10000999.797314411752732642,"optionValue":0,"premiumFrozen":0,"premiumIn":0E-18,"premiumOut":0E-18,"profitReal":0E-18,"profitUnreal":0,"symbol":"BTC","tradePartition":"USDT","withdrawAvailable":10000999.797314411752732642}
     *
     * */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "feeAsset":"USDT",
         * "feeFrozen":0,
         * "marginAsset":"BTC",
         * "marginAvailable":10000999.797314411752732642,
         * "marginBalance":10000999.797314411752732642,
         * "marginFrozen":0,
         * "marginPosition":0,
         * "marginStatic":10000999.797314411752732642,
         * "optionValue":0,
         * "premiumFrozen":0,
         * "premiumIn":0,
         * "premiumOut":0,
         * "delta":0,
         * "gamma":0,
         * "theta":0,
         * "vega":0,
         * "profitReal":0,
         * "profitUnreal":0,
         * "symbol":"BTC",
         * "tradePartition":"USDT",
         * "withdrawAvailable":10000999.797314411752732642
         *
         * */
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
        private BigDecimal premiumIn;
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


    }
}
