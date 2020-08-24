package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import sun.rmi.runtime.Log;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionApiTradingStatusResponse {

    /*
     * "status":"ok",
     * "ts":1596766461605
     * "data":[{"cor":[{"cancelRatio":0,"cancelRatioThreshold":0.100000000000000000,"invalidCancelOrders":0,"isActive":1,"isTrigger":0,"orders":0,"ordersThreshold":10}],"disableInterval":0,"disableReason":"","isDisable":0,"orderPriceTypes":"","recoveryTime":0,"tdn":[{"disables":0,"disablesThreshold":2,"isActive":1,"isTrigger":0}]}]
     *
     * */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {
        /**
         * "disableInterval":0,
         * "disableReason":"",
         * "isDisable":0,
         * "orderPriceTypes":"",
         * "recoveryTime":0,
         * "cor":[{"cancelRatio":0,"cancelRatioThreshold":0.100000000000000000,"invalidCancelOrders":0,"isActive":1,"isTrigger":0,"orders":0,"ordersThreshold":10}]
         * "tdn":[{"disables":0,"disablesThreshold":2,"isActive":1,"isTrigger":0}]
         */

        @SerializedName("is_disable")
        private Integer isDisable;
        @SerializedName("order_price_types")
        private String orderPriceTypes;
        @SerializedName("disable_reason")
        private String DisableReason;
        @SerializedName("disable_interval")
        private Long disableInterval;
        @SerializedName("recovery_time")
        private Long recoveryTime;
        @SerializedName("COR")
        private List<CORBean> cor;
        @SerializedName("TDN")
        private List<TDNBean> tdn;

        @Data
        @AllArgsConstructor
        @Builder
        public static class CORBean {

            /**
             * "cancelRatio":0,
             * "cancelRatioThreshold":0.1,
             * "invalidCancelOrders":0,
             * "isActive":1,
             * "isTrigger":0,
             * "orders":0,
             * "ordersThreshold":10
             */

            @SerializedName("orders_threshold")
            private Long ordersThreshold;
            private Long orders;
            @SerializedName("invalid_cancel_orders")
            private Long invalidCancelOrders;
            @SerializedName("cancel_ratio_threshold")
            private BigDecimal cancelRatioThreshold;
            @SerializedName("cancel_ratio")
            private BigDecimal cancelRatio;
            @SerializedName("is_trigger")
            private Integer isTrigger;
            @SerializedName("is_active")
            private Integer isActive;
        }

        @Data
        @AllArgsConstructor
        @Builder
        public static class TDNBean {

            /**
             * "disables":0,
             * "disablesThreshold":2,
             * "isActive":1,
             * "isTrigger":0
             */

            @SerializedName("disables_threshold")
            private Long disablesThreshold;
            private Long disables;
            @SerializedName("is_trigger")
            private Integer isTrigger;
            @SerializedName("is_active")
            private Integer isActive;
        }
    }
}
