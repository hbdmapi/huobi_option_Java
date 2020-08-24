package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionTriggerOpenordersResponse {
    /**
     * "status":"ok",
     * "data":[{"currentPage":1,"orders":[{"contractCode":"BTC-USDT-200814-P-8500","contractType":"this_week","createdAt":1597041629980,"direction":"buy","offset":"open","orderId":742391933753634816,"orderIdStr":"742391933753634816","orderPrice":4600.000000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"status":2,"symbol":"BTC","tradePartition":"USDT","triggerPrice":4600.000000000000000000,"triggerType":"ge","volume":1.000000000000000000},{"contractCode":"BTC-USDT-200814-P-8500","contractType":"this_week","createdAt":1597040995168,"direction":"buy","offset":"open","orderId":742389271486279680,"orderIdStr":"742389271486279680","orderPrice":4687.500000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"status":2,"symbol":"BTC","tradePartition":"USDT","triggerPrice":4687.500000000000000000,"triggerType":"ge","volume":1.000000000000000000}],"totalPage":1,"totalSize":2}]
     * "ts":1597042571997
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {
        /**
         * "totalPage":1,
         * "totalSize":2
         * "currentPage":1,
         * "orders":[{"contractCode":"BTC-USDT-200814-P-8500","contractType":"this_week","createdAt":1597041629980,"direction":"buy","offset":"open","orderId":742391933753634816,"orderIdStr":"742391933753634816","orderPrice":4600.000000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"status":2,"symbol":"BTC","tradePartition":"USDT","triggerPrice":4600.000000000000000000,"triggerType":"ge","volume":1.000000000000000000},{"contractCode":"BTC-USDT-200814-P-8500","contractType":"this_week","createdAt":1597040995168,"direction":"buy","offset":"open","orderId":742389271486279680,"orderIdStr":"742389271486279680","orderPrice":4687.500000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"status":2,"symbol":"BTC","tradePartition":"USDT","triggerPrice":4687.500000000000000000,"triggerType":"ge","volume":1.000000000000000000}]
         */

        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        @SerializedName("current_page")
        private Integer currentPage;
        private List<OrdersBean> orders;

        @Data
        @AllArgsConstructor
        @Builder
        public static class OrdersBean {
            /**
             * "contractCode":"BTC-USDT-200814-P-8500",
             * "contractType":"this_week",
             * "createdAt":1597041629980,
             * "direction":"buy",
             * "offset":"open",
             * "orderId":742391933753634816,
             * "orderIdStr":"742391933753634816",
             * "orderPrice":4600,
             * "orderPriceType":"limit",
             * "orderSource":"api",
             * "orderType":1,
             * "status":2,
             * "symbol":"BTC",
             * "tradePartition":"USDT",
             * "triggerPrice":4600,
             * "triggerType":"ge",
             * "volume":1
             */

            private String symbol;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("contract_type")
            private String contractType;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("trigger_type")
            private String triggerType;
            private BigDecimal volume;
            @SerializedName("order_type")
            private Integer orderType;
            private String direction;
            private String offset;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("trigger_price")
            private BigDecimal triggerPrice;
            @SerializedName("order_price")
            private BigDecimal orderPrice;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("order_price_type")
            private String orderPriceType;
            private Integer status;

        }

    }
}
