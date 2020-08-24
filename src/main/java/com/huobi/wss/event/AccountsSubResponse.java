package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class AccountsSubResponse {


    /**
     * "op":"notify",
     * "topic":"accounts",
     * "ts":1597110175692,
     * "uid":"2373908",
     * "event":"init",
     * "data":[{"symbol":"BTC","margin_balance":901.904951693560159834,"margin_static":901.904951693560159834,"margin_position":0.145,"margin_frozen":0.079,"margin_available":901.680951693560159834,"profit_real":0,"profit_unreal":0,"withdraw_available":901.680951693560159834,"option_value":0,"premium_frozen":0,"fee_frozen":0,"premium_in":0,"premium_out":0,"fee_asset":"USDT","delta":0.00490623685611881956335086055962655,"gamma":1.206E-8,"theta":0.19651421105,"vega":0.00018716964,"margin_asset":"BTC","trade_partition":"USDT"}]
     */

    private String op;
    private String topic;
    private long ts;
    private String event;
    private String uid;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "symbol":"BTC",
         * "margin_balance":901.904951693560159834,
         * "margin_static":901.904951693560159834,
         * "margin_position":0.145,
         * "margin_frozen":0.079,
         * "margin_available":901.680951693560159834,
         * "profit_real":0,
         * "profit_unreal":0,
         * "withdraw_available":901.680951693560159834,
         * "option_value":0,
         * "premium_frozen":0,
         * "fee_frozen":0,
         * "premium_in":0,
         * "premium_out":0,
         * "fee_asset":"USDT",
         * "delta":0.00490623685611881956335086055962655,
         * "gamma":0.00000001206,
         * "theta":0.19651421105,
         * "vega":0.00018716964,
         * "margin_asset":"BTC",
         * "trade_partition":"USDT"
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("margin_balance")
        private BigDecimal marginBalance;
        @SerializedName("margin_static")
        private BigDecimal marginStatic;
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
