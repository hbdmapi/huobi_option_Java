package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionPositionLimitResponse {

    /**
     * "status":"ok",
     * "ts":1596782998165
     * "data":[{"list":[{"buyLimit":9000000000.000000000000000000,"contract_type":"this_week","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"this_week","optionRightType":"P","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"next_week","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"next_week","optionRightType":"P","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"quarter","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"quarter","optionRightType":"P","sellLimit":900000000000000.000000000000000000},{"buyLimit":9999999.000000000000000000,"contract_type":"all","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"all","optionRightType":"P","sellLimit":900000000000000.000000000000000000}],"symbol":"BTC","tradePartition":"USDT"}]
     */

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "symbol":"BTC",
         * "tradePartition":"USDT"
         * "list":[{"buyLimit":9000000000.000000000000000000,"contract_type":"this_week","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"this_week","optionRightType":"P","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"next_week","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"next_week","optionRightType":"P","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"quarter","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"quarter","optionRightType":"P","sellLimit":900000000000000.000000000000000000},{"buyLimit":9999999.000000000000000000,"contract_type":"all","optionRightType":"C","sellLimit":900000000000000.000000000000000000},{"buyLimit":900000000000000.000000000000000000,"contract_type":"all","optionRightType":"P","sellLimit":900000000000000.000000000000000000}]
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        private List<ListBean> list;

        @Data
        @AllArgsConstructor
        public static class ListBean {

            /**
             * "buyLimit":900000000000000,
             * "contract_type":"next_week",
             * "optionRightType":"P",
             * "sellLimit":900000000000000
             */
            @SerializedName("option_right_type")
            private String optionRightType;
            private String contract_type;
            @SerializedName("buy_limit")
            private BigDecimal buyLimit;
            @SerializedName("sell_limit")
            private BigDecimal sellLimit;

        }
    }
}
