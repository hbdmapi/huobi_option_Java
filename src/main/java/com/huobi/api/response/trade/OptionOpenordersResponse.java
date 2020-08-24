package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionOpenordersResponse {
    /**
     * "status":"ok",
     * "ts":1597027993592
     * "data":{"currentPage":1,"orders":[{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createdAt":1597026117776,"deliveryDate":"20200814","direction":"sell","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","feeFrozen":0,"marginAsset":"BTC","marginFrozen":0,"offset":"close","optionRightType":"C","orderId":742326870967595008,"orderIdStr":742326870967595008,"orderPriceType":"lightning","orderSource":"api","orderType":1,"premiumFrozen":0,"price":1392.66,"profit":0,"quoteAsset":"USDT","status":3,"symbol":"BTC","tradeAvgPrice":0,"tradePartition":"USDT","tradeTurnover":0,"tradeVolume":0,"volume":1},{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createdAt":1597025955882,"deliveryDate":"20200814","direction":"sell","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","feeFrozen":0,"marginAsset":"BTC","marginFrozen":0,"offset":"close","optionRightType":"C","orderId":742326191913971712,"orderIdStr":742326191913971712,"orderPriceType":"lightning","orderSource":"api","orderType":1,"premiumFrozen":0,"price":1403.94,"profit":0,"quoteAsset":"USDT","status":3,"symbol":"BTC","tradeAvgPrice":0,"tradePartition":"USDT","tradeTurnover":0,"tradeVolume":0,"volume":1}],"totalPage":1,"totalSize":2}
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "totalPage":1,
         * "totalSize":2
         * "currentPage":1,
         * "orders":[{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createdAt":1597026117776,"deliveryDate":"20200814","direction":"sell","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","feeFrozen":0,"marginAsset":"BTC","marginFrozen":0,"offset":"close","optionRightType":"C","orderId":742326870967595008,"orderIdStr":742326870967595008,"orderPriceType":"lightning","orderSource":"api","orderType":1,"premiumFrozen":0,"price":1392.66,"profit":0,"quoteAsset":"USDT","status":3,"symbol":"BTC","tradeAvgPrice":0,"tradePartition":"USDT","tradeTurnover":0,"tradeVolume":0,"volume":1},{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createdAt":1597025955882,"deliveryDate":"20200814","direction":"sell","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","feeFrozen":0,"marginAsset":"BTC","marginFrozen":0,"offset":"close","optionRightType":"C","orderId":742326191913971712,"orderIdStr":742326191913971712,"orderPriceType":"lightning","orderSource":"api","orderType":1,"premiumFrozen":0,"price":1403.94,"profit":0,"quoteAsset":"USDT","status":3,"symbol":"BTC","tradeAvgPrice":0,"tradePartition":"USDT","tradeTurnover":0,"tradeVolume":0,"volume":1}]
         */

        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<OrdersBean> orders;

        @Data
        @AllArgsConstructor
        public static class OrdersBean {
            /**
             * "contractCode":"BTC-USDT-200814-C-9500",
             * "contractType":"this_week",
             * "createdAt":1597026117776,
             * "deliveryDate":"20200814",
             * "direction":"sell",
             * "exercisePrice":9500,
             * "fee":0,
             * "feeAsset":"USDT",
             * "feeFrozen":0,
             * "marginAsset":"BTC",
             * "marginFrozen":0,
             * "offset":"close",
             * "optionRightType":"C",
             * "orderId":742326870967595008,
             * "orderIdStr":742326870967595008,
             * "orderPriceType":"lightning",
             * "orderSource":"api",
             * "orderType":1,
             * "premiumFrozen":0,
             * "price":1392.66,
             * "profit":0,
             * "quoteAsset":"USDT",
             * "status":3,
             * "symbol":"BTC",
             * "tradeAvgPrice":0,
             * "tradePartition":"USDT",
             * "tradeTurnover":0,
             * "tradeVolume":0,
             * "volume":1
             */

            private String symbol;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("contract_type")
            private String contractType;
            @SerializedName("contract_code")
            private String contractCode;
            private BigDecimal volume;
            private BigDecimal price;
            @SerializedName("order_price_type")
            private String orderPriceType;
            @SerializedName("order_type")
            private Integer orderType;
            private String direction;
            private String offset;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private Long orderIdStr;
            @SerializedName("client_order_id")
            private Long clientOrderId;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            private BigDecimal fee;
            @SerializedName("trade_avg_price")
            private BigDecimal tradeAvgPrice;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            @SerializedName("margin_asset")
            private String marginAsset;
            private BigDecimal profit;
            private Integer status;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("delivery_date")
            private String deliveryDate;
            @SerializedName("option_right_type")
            private String optionRightType;
            @SerializedName("exercise_price")
            private BigDecimal exercisePrice;
            @SerializedName("quote_asset")
            private String quoteAsset;
            @SerializedName("premium_frozen")
            private BigDecimal premiumFrozen;
            @SerializedName("fee_frozen")
            private BigDecimal feeFrozen;
            @SerializedName("fee_asset")
            private String feeAsset;


        }
    }
}
