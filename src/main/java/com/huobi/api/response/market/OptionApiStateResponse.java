package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OptionApiStateResponse {

    /**
     * "status":"ok",
     * "ts":1596785106858
     * "data":[{"cancel":1,"close":1,"masterTransferSub":1,"open":1,"subTransferMaster":1,"symbol":"BTC","tradePartition":"USDT","transferIn":1,"transferOut":1},{"cancel":1,"close":1,"masterTransferSub":1,"open":1,"subTransferMaster":1,"symbol":"ETH","tradePartition":"USDT","transferIn":1,"transferOut":1},{"cancel":0,"close":0,"masterTransferSub":1,"open":0,"subTransferMaster":1,"symbol":"USDT","tradePartition":"USDT","transferIn":0,"transferOut":0}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "cancel":1,
         * "close":1,
         * "masterTransferSub":1,
         * "open":1,
         * "subTransferMaster":1,
         * "symbol":"BTC",
         * "tradePartition":"USDT",
         * "transferIn":1,
         * "transferOut":1
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        private Integer open;
        private Integer close;
        private Integer cancel;
        @SerializedName("transfer_in")
        private Integer transferIn;
        @SerializedName("transfer_out")
        private Integer transferOut;
        @SerializedName("master_transfer_sub")
        private Integer masterTransferSub;
        @SerializedName("sub_transfer_master")
        private Integer subTransferMaster;


    }
}
