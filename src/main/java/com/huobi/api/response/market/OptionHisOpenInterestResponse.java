package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionHisOpenInterestResponse {
    /**
     * "status":"ok",
     * "ts":1596785669384
     * "data":{"contractType":"this_week","optionRightType":"C","symbol":"BTC","tick":[{"amountType":1,"ts":1596729600000,"volume":10078889.0000000000000000},{"amountType":1,"ts":1596643200000,"volume":9041149.0000000000000000},{"amountType":1,"ts":1596556800000,"volume":4431370.0000000000000000},{"amountType":1,"ts":1596470400000,"volume":3719681.0000000000000000},{"amountType":1,"ts":1596384000000,"volume":2656087.0000000000000000},{"amountType":1,"ts":1596297600000,"volume":2655718.0000000000000000},{"amountType":1,"ts":1596211200000,"volume":2655718.0000000000000000},{"amountType":1,"ts":1596124800000,"volume":2504786.0000000000000000},{"amountType":1,"ts":1596038400000,"volume":2496888.0000000000000000},{"amountType":1,"ts":1595952000000,"volume":10249340.0000000000000000}],"tradePartition":"USDT"}
     */

    private String status;
    private DataBean data;
    private Long ts;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "contractType":"this_week",
         * "optionRightType":"C",
         * "symbol":"BTC",
         * "tick":[{"amountType":1,"ts":1596729600000,"volume":10078889.0000000000000000},{"amountType":1,"ts":1596643200000,"volume":9041149.0000000000000000},{"amountType":1,"ts":1596556800000,"volume":4431370.0000000000000000},{"amountType":1,"ts":1596470400000,"volume":3719681.0000000000000000},{"amountType":1,"ts":1596384000000,"volume":2656087.0000000000000000},{"amountType":1,"ts":1596297600000,"volume":2655718.0000000000000000},{"amountType":1,"ts":1596211200000,"volume":2655718.0000000000000000},{"amountType":1,"ts":1596124800000,"volume":2504786.0000000000000000},{"amountType":1,"ts":1596038400000,"volume":2496888.0000000000000000},{"amountType":1,"ts":1595952000000,"volume":10249340.0000000000000000}]
         */

        private String symbol;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("option_right_type")
        private String optionRightType;
        private List<TickBean> tick;

        @Data
        @AllArgsConstructor
        public static class TickBean {
            /**
             * "amountType":1,
             * "ts":1596729600000,
             * "volume":10078889
             */

            private BigDecimal volume;
            @SerializedName("amount_type")
            private Integer amountType;
            private Long ts;

        }
    }
}
