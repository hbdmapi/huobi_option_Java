package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionOrderLimitResponse {

    /**
     * "status":"ok",
     * "ts":1596782285303
     * "data":{"list":[{"symbol":"BTC","types":[{"closeLimit":900000000000000.000000000000000000,"contractType":"this_week","openLimit":900000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"this_week","openLimit":900000000000000.000000000000000000,"optionRightType":"P"},{"closeLimit":900000000000000.000000000000000000,"contractType":"next_week","openLimit":900000000000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"next_week","openLimit":900000000000000.000000000000000000,"optionRightType":"P"},{"closeLimit":900000000000000.000000000000000000,"contractType":"quarter","openLimit":900000000000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"quarter","openLimit":900000000000000.000000000000000000,"optionRightType":"P"}]}],"orderPriceType":"limit"}
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "orderPriceType":"limit"
         * "list":[{"symbol":"BTC","types":[{"closeLimit":900000000000000.000000000000000000,"contractType":"this_week","openLimit":900000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"this_week","openLimit":900000000000000.000000000000000000,"optionRightType":"P"},{"closeLimit":900000000000000.000000000000000000,"contractType":"next_week","openLimit":900000000000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"next_week","openLimit":900000000000000.000000000000000000,"optionRightType":"P"},{"closeLimit":900000000000000.000000000000000000,"contractType":"quarter","openLimit":900000000000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"quarter","openLimit":900000000000000.000000000000000000,"optionRightType":"P"}]}]
         */

        @SerializedName("order_price_type")
        private String orderPriceType;
        private List<ListBean> list;

        @Data
        @AllArgsConstructor
        public static class ListBean {

            /**
             * "symbol":"BTC",
             * "types":[{"closeLimit":900000000000000.000000000000000000,"contractType":"this_week","openLimit":900000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"this_week","openLimit":900000000000000.000000000000000000,"optionRightType":"P"},{"closeLimit":900000000000000.000000000000000000,"contractType":"next_week","openLimit":900000000000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"next_week","openLimit":900000000000000.000000000000000000,"optionRightType":"P"},{"closeLimit":900000000000000.000000000000000000,"contractType":"quarter","openLimit":900000000000000.000000000000000000,"optionRightType":"C"},{"closeLimit":900000000000000.000000000000000000,"contractType":"quarter","openLimit":900000000000000.000000000000000000,"optionRightType":"P"}]
             */

            private String symbol;
            private List<TypesBean> types;

            @Data
            @AllArgsConstructor
            public static class TypesBean {

                /**
                 * "closeLimit":900000000000000,
                 * "contractType":"this_week",
                 * "openLimit":900000000,
                 * "optionRightType":"C"
                 */

                @SerializedName("contract_type")
                private String contractType;
                @SerializedName("option_right_type")
                private String optionRightType;
                @SerializedName("open_limit")
                private BigDecimal openLimit;
                @SerializedName("close_limit")
                private BigDecimal closeLimit;

            }
        }
    }
}
