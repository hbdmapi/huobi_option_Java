package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionTransferLimitResponse {
    /**
     * "status":"ok",
     * "ts":1596784747482
     * "data":[{"netTransferInMaxDaily":40000.000000000000000000,"netTransferOutMaxDaily":8000.000000000000000000,"symbol":"BTC","tradePartition":"USDT","transferInMaxDaily":80000.000000000000000000,"transferInMaxEach":8000.000000000000000000,"transferInMinEach":0.000100000000000000,"transferOutMaxDaily":16000.000000000000000000,"transferOutMaxEach":800.000000000000000000,"transferOutMinEach":0.000800000000000000}]
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "netTransferInMaxDaily":40000,
         * "netTransferOutMaxDaily":8000,
         * "symbol":"BTC",
         * "tradePartition":"USDT",
         * "transferInMaxDaily":80000,
         * "transferInMaxEach":8000,
         * "transferInMinEach":0.0001,
         * "transferOutMaxDaily":16000,
         * "transferOutMaxEach":800,
         * "transferOutMinEach":0.0008
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("transfer_in_max_each")
        private BigDecimal transferInMaxEach;
        @SerializedName("transfer_in_min_each")
        private BigDecimal transferInMinEach;
        @SerializedName("transfer_out_max_each")
        private BigDecimal transferOutMaxEach;
        @SerializedName("transfer_out_min_each")
        private BigDecimal transferOutMinEach;
        @SerializedName("transfer_in_max_daily")
        private BigDecimal transferInMaxDaily;
        @SerializedName("transfer_out_max_daily")
        private BigDecimal transferOutMaxDaily;
        @SerializedName("net_transfer_in_max_daily")
        private BigDecimal netTransferInMaxDaily;
        @SerializedName("net_transfer_out_max_daily")
        private BigDecimal netTransferOutMaxDaily;

    }
}
