package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionOrderInfoResponse {
    /**
     * "status":"ok",
     * "ts":1597039062641
     * "data":[{"contractCode":"BTC-USDT-200814-C-8500","contractType":"this_week","createdAt":1597027295671,"deliveryDate":"20200814","direction":"sell","exercisePrice":8500.000000000000000000,"fee":-0.005000000000000000,"feeAsset":"USDT","feeFrozen":0,"marginAsset":"BTC","marginFrozen":0,"offset":"close","optionRightType":"C","orderId":742331811614437376,"orderIdStr":"742331811614437376","orderPriceType":"lightning","orderSource":"api","orderType":"1","premiumFrozen":0,"price":3289.41,"profit":-0.013850000000000000000000000000000000,"quoteAsset":"USDT","status":6,"symbol":"BTC","tradeAvgPrice":3294.740000000000000000,"tradePartition":"USDT","tradeTurnover":3.294740000000000000,"tradeVolume":1,"volume":1}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "contractCode":"BTC-USDT-200814-C-8500",
         * "contractType":"this_week",
         * "createdAt":1597027295671,
         * "deliveryDate":"20200814",
         * "direction":"sell",
         * "exercisePrice":8500,
         * "fee":-0.005,
         * "feeAsset":"USDT",
         * "feeFrozen":0,
         * "marginAsset":"BTC",
         * "marginFrozen":0,
         * "offset":"close",
         * "optionRightType":"C",
         * "orderId":742331811614437376,
         * "orderIdStr":"742331811614437376",
         * "orderPriceType":"lightning",
         * "orderSource":"api",
         * "orderType":"1",
         * "premiumFrozen":0,
         * "price":3289.41,
         * "profit":-0.01385,
         * "quoteAsset":"USDT",
         * "status":6,
         * "symbol":"BTC",
         * "tradeAvgPrice":3294.74,
         * "tradePartition":"USDT",
         * "tradeTurnover":3.29474,
         * "tradeVolume":1,
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
        private String direction;
        private String offset;
        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
        @SerializedName("client_order_id")
        private Long clientOrderId;
        @SerializedName("order_source")
        private String orderSource;
        @SerializedName("order_type")
        private String orderType;
        @SerializedName("created_at")
        private Long createdAt;
        @SerializedName("trade_volume")
        private BigDecimal tradeVolume;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        private BigDecimal fee;
        @SerializedName("fee_asset")
        private String feeAsset;
        @SerializedName("trade_avg_price")
        private BigDecimal tradeAvgPrice;
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        @SerializedName("margin_asset")
        private String marginAsset;
        private BigDecimal profit;
        private Integer status;
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


    }
}
