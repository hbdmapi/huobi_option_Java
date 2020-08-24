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
public class OptionTriggerHisordersResponse {
    /**
     * "status":"ok",
     * "ts":1597040249698
     * "data":[{"currentPage":1,"orders":[{"canceledAt":1597039712333,"contractCode":"BTC-USDT-200814-P-9500","contractType":"this_week","createdAt":1597039674543,"direction":"buy","offset":"open","orderId":742383732068986880,"orderIdStr":"742383732068986880","orderPrice":10009.000000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"relationOrderId":"-1","status":6,"symbol":"BTC","tradePartition":"USDT","triggerPrice":10009.000000000000000000,"triggerType":"ge","volume":1.000000000000000000},{"canceledAt":1597039897151,"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createdAt":1597039487734,"direction":"buy","offset":"open","orderId":742382948589776896,"orderIdStr":"742382948589776896","orderPrice":10009.000000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"relationOrderId":"-1","status":6,"symbol":"BTC","tradePartition":"USDT","triggerPrice":10009.000000000000000000,"triggerType":"ge","volume":1.000000000000000000}],"totalPage":1,"totalSize":2}]
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
         * "orders":[{"canceledAt":1597039712333,"contractCode":"BTC-USDT-200814-P-9500","contractType":"this_week","createdAt":1597039674543,"direction":"buy","offset":"open","orderId":742383732068986880,"orderIdStr":"742383732068986880","orderPrice":10009.000000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"relationOrderId":"-1","status":6,"symbol":"BTC","tradePartition":"USDT","triggerPrice":10009.000000000000000000,"triggerType":"ge","volume":1.000000000000000000},{"canceledAt":1597039897151,"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createdAt":1597039487734,"direction":"buy","offset":"open","orderId":742382948589776896,"orderIdStr":"742382948589776896","orderPrice":10009.000000000000000000,"orderPriceType":"limit","orderSource":"api","orderType":1,"relationOrderId":"-1","status":6,"symbol":"BTC","tradePartition":"USDT","triggerPrice":10009.000000000000000000,"triggerType":"ge","volume":1.000000000000000000}]
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
             * "canceledAt":1597039712333,
             * "contractCode":"BTC-USDT-200814-P-9500",
             * "contractType":"this_week",
             * "createdAt":1597039674543,
             * "direction":"buy",
             * "offset":"open",
             * "orderId":742383732068986880,
             * "orderIdStr":"742383732068986880",
             * "orderPrice":10009,
             * "orderPriceType":"limit",
             * "orderSource":"api",
             * "orderType":1,
             * "relationOrderId":"-1",
             * "status":6,
             * "symbol":"BTC",
             * "tradePartition":"USDT",
             * "triggerPrice":10009,
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
            private BigDecimal orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("relation_order_id")
            private String relationOrderId;
            @SerializedName("order_price_type")
            private String orderPriceType;
            private Integer status;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("trigger_price")
            private BigDecimal triggerPrice;
            @SerializedName("triggered_price")
            private BigDecimal triggeredPrice;
            @SerializedName("order_price")
            private BigDecimal orderPrice;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("triggered_at")
            private Long triggeredAt;
            @SerializedName("order_insert_at")
            private Long orderInsetAt;
            @SerializedName("canceled_at")
            private Long canceledAt;
            @SerializedName("fail_code")
            private Integer failCode;
            @SerializedName("fail_reason")
            private String failReason;

        }
    }
}
