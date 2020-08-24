package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionHisordersResponse {
    /**
     * "status":"ok",
     * "ts":1597025712469
     * "data":{"currentPage":1,"orders":[{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createDate":1597024700347,"deliveryDate":"20200814","direction":"buy","exercisePrice":9500.000000000000000000,"fee":-0.01,"feeAsset":"USDT","marginAsset":"BTC","marginFrozen":0,"offset":"open","optionRightType":"C","orderId":742320926011437056,"orderIdStr":"742320926011437056","orderPriceType":"opponent","orderSource":"api","orderType":1,"price":143,"profit":0,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":143.000000000000000000000,"tradePartition":"USDT","tradeTurnover":0.286,"tradeVolume":2,"volume":2},{"contractCode":"BTC-USDT-200807-C-9500","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"buy","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","marginAsset":"","offset":"close","optionRightType":"C","orderId":1291733532215672833,"orderIdStr":"1291733532215672833","orderPriceType":"system","orderSource":"settlement","orderType":4,"price":11782.28,"profit":-0.09568999548474488,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":11782.28,"tradePartition":"USDT","tradeTurnover":0.494,"tradeVolume":494,"volume":494},{"contractCode":"BTC-USDT-200807-P-9500","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"sell","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","marginAsset":"","offset":"close","optionRightType":"P","orderId":1291733532215672834,"orderIdStr":"1291733532215672834","orderPriceType":"system","orderSource":"settlement","orderType":4,"price":11782.28,"profit":0,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":11782.28,"tradePartition":"USDT","tradeTurnover":0.002,"tradeVolume":2,"volume":2},{"contractCode":"BTC-USDT-200807-C-8000","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"sell","exercisePrice":8000.000000000000000000,"fee":-3.39492865557E-7,"feeAsset":"USDT","marginAsset":"","offset":"close","optionRightType":"C","orderId":1291733532219867137,"orderIdStr":"1291733532219867137","orderPriceType":"system","orderSource":"settlement","orderType":4,"price":11782.28,"profit":0.000642028537770279,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":11782.28,"tradePartition":"USDT","tradeTurnover":0.002,"tradeVolume":2,"volume":2},{"contractCode":"BTC-USDT-200807-C-9500","contractType":"this_week","createDate":1596796095131,"deliveryDate":"20200807","direction":"buy","exercisePrice":9500.000000000000000000,"fee":-0.015,"feeAsset":"USDT","marginAsset":"BTC","marginFrozen":0,"offset":"close","optionRightType":"C","orderId":741362086373863424,"orderIdStr":"741362086373863424","orderPriceType":"opponent","orderSource":"web","orderType":1,"price":143,"profit":-0.12315090543259558,"quoteAsset":"USDT","status":5,"symbol":"BTC","tradeAvgPrice":143.000000000000000000000,"tradePartition":"USDT","tradeTurnover":0.429,"tradeVolume":3,"volume":125}],"totalPage":3,"totalSize":12}
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "totalPage":3,
         * "totalSize":12
         * "currentPage":1,
         * "orders":[{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createDate":1597024700347,"deliveryDate":"20200814","direction":"buy","exercisePrice":9500.000000000000000000,"fee":-0.01,"feeAsset":"USDT","marginAsset":"BTC","marginFrozen":0,"offset":"open","optionRightType":"C","orderId":742320926011437056,"orderIdStr":"742320926011437056","orderPriceType":"opponent","orderSource":"api","orderType":1,"price":143,"profit":0,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":143.000000000000000000000,"tradePartition":"USDT","tradeTurnover":0.286,"tradeVolume":2,"volume":2},{"contractCode":"BTC-USDT-200807-C-9500","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"buy","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","marginAsset":"","offset":"close","optionRightType":"C","orderId":1291733532215672833,"orderIdStr":"1291733532215672833","orderPriceType":"system","orderSource":"settlement","orderType":4,"price":11782.28,"profit":-0.09568999548474488,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":11782.28,"tradePartition":"USDT","tradeTurnover":0.494,"tradeVolume":494,"volume":494},{"contractCode":"BTC-USDT-200807-P-9500","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"sell","exercisePrice":9500.000000000000000000,"fee":0,"feeAsset":"USDT","marginAsset":"","offset":"close","optionRightType":"P","orderId":1291733532215672834,"orderIdStr":"1291733532215672834","orderPriceType":"system","orderSource":"settlement","orderType":4,"price":11782.28,"profit":0,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":11782.28,"tradePartition":"USDT","tradeTurnover":0.002,"tradeVolume":2,"volume":2},{"contractCode":"BTC-USDT-200807-C-8000","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"sell","exercisePrice":8000.000000000000000000,"fee":-3.39492865557E-7,"feeAsset":"USDT","marginAsset":"","offset":"close","optionRightType":"C","orderId":1291733532219867137,"orderIdStr":"1291733532219867137","orderPriceType":"system","orderSource":"settlement","orderType":4,"price":11782.28,"profit":0.000642028537770279,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":11782.28,"tradePartition":"USDT","tradeTurnover":0.002,"tradeVolume":2,"volume":2},{"contractCode":"BTC-USDT-200807-C-9500","contractType":"this_week","createDate":1596796095131,"deliveryDate":"20200807","direction":"buy","exercisePrice":9500.000000000000000000,"fee":-0.015,"feeAsset":"USDT","marginAsset":"BTC","marginFrozen":0,"offset":"close","optionRightType":"C","orderId":741362086373863424,"orderIdStr":"741362086373863424","orderPriceType":"opponent","orderSource":"web","orderType":1,"price":143,"profit":-0.12315090543259558,"quoteAsset":"USDT","status":5,"symbol":"BTC","tradeAvgPrice":143.000000000000000000000,"tradePartition":"USDT","tradeTurnover":0.429,"tradeVolume":3,"volume":125}]
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
             * "createDate":1597024700347,
             * "deliveryDate":"20200814",
             * "direction":"buy",
             * "exercisePrice":9500,
             * "fee":-0.01,
             * "feeAsset":"USDT",
             * "marginAsset":"BTC",
             * "marginFrozen":0,
             * "offset":"open",
             * "optionRightType":"C",
             * "orderId":742320926011437056,
             * "orderIdStr":"742320926011437056",
             * "orderPriceType":"opponent",
             * "orderSource":"api",
             * "orderType":1,
             * "price":143,
             * "profit":0,
             * "quoteAsset":"USDT",
             * "status":6,
             * "symbol":"BTC",
             * "tradeAvgPrice":143,
             * "tradePartition":"USDT",
             * "tradeTurnover":0.286,
             * "tradeVolume":2,
             * "volume":2
             */
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            private String symbol;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("contract_type")
            private String contractType;
            @SerializedName("contract_code")
            private String contractCode;
            private String direction;
            private String offset;
            private BigDecimal volume;
            private BigDecimal price;
            @SerializedName("create_date")
            private Long createDate;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("order_price_type")
            private String orderPriceType;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            @SerializedName("margin_asset")
            private String marginAsset;
            private BigDecimal profit;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            private BigDecimal fee;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("trade_avg_price")
            private BigDecimal tradeAvgPrice;
            private Integer status;
            @SerializedName("order_type")
            private Integer orderType;
            @SerializedName("delivery_date")
            private String deliveryDate;
            @SerializedName("option_right_type")
            private String optionRightType;
            @SerializedName("exercise_price")
            private BigDecimal exercisePrice;
            @SerializedName("quote_asset")
            private String quoteAsset;

        }
    }
}
