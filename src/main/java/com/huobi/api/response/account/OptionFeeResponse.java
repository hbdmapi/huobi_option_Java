package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OptionFeeResponse {

    /**
     * "status":"ok",
     * "ts":1596767455570
     * "data":[{"callDeliveryFee":"0.002","closeMakerFee":"0.002","closeTakerFee":"0.005","feeAsset":"USDT","feeRateType":2,"maxDeliveryFeeRate":"0.125","maxTradeInFeeRate":"0.125","maxTradeOutFeeRate":"0.08","openMakerFee":"0.002","openTakerFee":"0.005","putDeliveryFee":"0.002","symbol":"BTC","tradePartition":"USDT"},{"callDeliveryFee":"0.0005","closeMakerFee":"0.0005","closeTakerFee":"0.00125","feeAsset":"USDT","feeRateType":2,"maxDeliveryFeeRate":"0.125","maxTradeInFeeRate":"0.0000012347","maxTradeOutFeeRate":"0.08","openMakerFee":"0.0005","openTakerFee":"0.0005","putDeliveryFee":"0.0005","symbol":"ETH","tradePartition":"USDT"},{"callDeliveryFee":"0","closeMakerFee":"0","closeTakerFee":"0","feeAsset":"USDT","feeRateType":1,"openMakerFee":"0","openTakerFee":"0","putDeliveryFee":"0","symbol":"EOS","tradePartition":"USDT"}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "callDeliveryFee":"0.002",
         * "closeMakerFee":"0.002",
         * "closeTakerFee":"0.005",
         * "feeAsset":"USDT",
         * "feeRateType":2,
         * "maxDeliveryFeeRate":"0.125",
         * "maxTradeInFeeRate":"0.125",
         * "maxTradeOutFeeRate":"0.08",
         * "openMakerFee":"0.002",
         * "openTakerFee":"0.005",
         * "putDeliveryFee":"0.002",
         * "symbol":"BTC",
         * "tradePartition":"USDT"
         */
        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("fee_asset")
        private String feeAsset;
        @SerializedName("open_maker_fee")
        private String openMakerFee;
        @SerializedName("open_taker_fee")
        private String openTakerFee;
        @SerializedName("close_maker_fee")
        private String closeMakerFee;
        @SerializedName("close_taker_fee")
        private String closeTakerFee;
        @SerializedName("call_delivery_fee")
        private String callDeliveryFee;
        @SerializedName("put_delivery_fee")
        private String putDeliveryFee;
        @SerializedName("fee_rate_type")
        private Integer feeRateType;
        @SerializedName("max_trade_in_fee_rate")
        private String maxTradeInFeeRate;
        @SerializedName("max_trade_out_fee_rate")
        private String maxTradeOutFeeRate;
        @SerializedName("max_delivery_fee_rate")
        private String maxDeliveryFeeRate;

    }
}
