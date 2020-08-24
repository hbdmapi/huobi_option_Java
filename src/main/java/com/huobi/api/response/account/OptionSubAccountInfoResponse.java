package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionSubAccountInfoResponse {

    /**
     * "status":"ok",
     * "ts":1596783247058
     * "data":[{"feeAsset":"USDT","feeFrozen":0,"marginAsset":"BTC","marginAvailable":98,"marginBalance":98,"marginFrozen":0,"marginPosition":0,"marginStatic":98,"optionValue":0,"premiumFrozen":0,"premiumIn":0,"premiumOut":0,"profitReal":0,"profitUnreal":0,"symbol":"BTC","tradePartition":"USDT","withdrawAvailable":98},{"feeAsset":"USDT","feeFrozen":0,"marginAsset":"ETH","marginAvailable":0,"marginBalance":0,"marginFrozen":0,"marginPosition":0,"marginStatic":0,"optionValue":0,"premiumFrozen":0,"premiumIn":0,"premiumOut":0,"profitReal":0,"profitUnreal":0,"symbol":"ETH","tradePartition":"USDT","withdrawAvailable":0},{"feeAsset":"USDT","feeFrozen":0,"marginAsset":"USDT","marginAvailable":1000,"marginBalance":1000,"marginFrozen":0,"marginPosition":0,"marginStatic":1000,"optionValue":0,"premiumFrozen":0,"premiumIn":0,"premiumOut":0,"profitReal":0,"profitUnreal":0,"symbol":"USDT","tradePartition":"USDT","withdrawAvailable":1000}]
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "feeAsset":"USDT",
         * "feeFrozen":0,
         * "marginAsset":"BTC",
         * "marginAvailable":98,
         * "marginBalance":98,
         * "marginFrozen":0,
         * "marginPosition":0,
         * "marginStatic":98,
         * "optionValue":0,
         * "premiumFrozen":0,
         * "premiumIn":0,
         * "premiumOut":0,
         * "profitReal":0,
         * "profitUnreal":0,
         * "symbol":"BTC",
         * "tradePartition":"USDT",
         * "withdrawAvailable":98
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
