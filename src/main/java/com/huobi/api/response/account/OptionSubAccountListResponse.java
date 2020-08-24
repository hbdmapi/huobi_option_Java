package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionSubAccountListResponse {

    /**
     * "status":"ok",
     * "ts":1596783796989
     * "data":[{"list":[{"marginBalance":98,"symbol":"BTC","tradePartition":"USDT"}],"subUid":2373983}]
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "subUid":2373983
         * "marginBalance":98,"symbol":"BTC","tradePartition":"USDT"
         */

        @SerializedName("sub_uid")
        private Long subUid;
        private List<ListBean> list;

        @Data
        @AllArgsConstructor
        public static class ListBean {
            /**
             * "marginBalance":98,
             * "symbol":"BTC",
             * "tradePartition":"USDT"
             */

            private String symbol;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("margin_balance")
            private BigDecimal marginBalance;

        }
    }
}
