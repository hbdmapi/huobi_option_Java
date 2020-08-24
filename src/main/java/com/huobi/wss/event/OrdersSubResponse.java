package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OrdersSubResponse {


    /**
     * "op":"notify",
     * "topic":"orders.btc-usdt",
     * "uid":"2373908",
     * "ts":1597116845093,
     * "symbol":"BTC",
     * "contract_type":"this_week",
     * "contract_code":"BTC-USDT-200814-C-8500",
     * "volume":100,
     * "price":4600,
     * "order_price_type":"limit",
     * "direction":"sell",
     * "offset":"open",
     * "status":4,
     * "order_id":742392604074815488,
     * "order_id_str":"742392604074815488",
     * "client_order_id":null,
     * "order_source":"web",
     * "order_type":1,
     * "created_at":1597041789793,
     * "canceled_at":0,
     * "trade_volume":25,
     * "trade_turnover":115.596,
     * "fee":-0.089,
     * "trade_avg_price":4623.84,
     * "margin_frozen":0.075,
     * "profit":0,
     * "trade_partition":"USDT",
     * "delivery_date":"20200814",
     * "option_right_type":"C",
     * "exercise_price":8500,
     * "quote_asset":"USDT",
     * "premium_frozen":0,
     * "fee_frozen":0,
     * "fee_asset":"USDT",
     * "margin_asset":"BTC",
     * "trade":[{"id":"637128385-742392604074815488-1","trade_id":637128385,"trade_volume":2,"trade_price":4600,"trade_fee":-0.004,"fee_asset":"USDT","trade_turnover":9.2,"created_at":1597116843866,"role":"maker"}]
     */

    private String op;
    private String topic;
    private long ts;
    private String uid;
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
    private int status;
    @SerializedName("order_id")
    private long orderId;
    @SerializedName("order_id_str")
    private String orderIdStr;
    @SerializedName("client_order_id")
    private long clientOrderId;
    @SerializedName("order_source")
    private String orderSource;
    @SerializedName("order_type")
    private int orderType;
    @SerializedName("created_at")
    private long createdAt;
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
    @SerializedName("canceled_at")
    private Long canceledAt;
    @SerializedName("fee_asset")
    private String feeAsset;
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
    private List<TradeBean> trade;


    @Data
    @AllArgsConstructor
    public static class TradeBean {
        /**
         * "id":"637128385-742392604074815488-1",
         * "trade_id":637128385,
         * "trade_volume":2,
         * "trade_price":4600,
         * "trade_fee":-0.004,
         * "fee_asset":"USDT",
         * "trade_turnover":9.2,
         * "created_at":1597116843866,
         * "role":"maker"
         */

        private String id;
        @SerializedName("trade_id")
        private long tradeId;
        @SerializedName("trade_volume")
        private BigDecimal tradeVolume;
        @SerializedName("trade_price")
        private BigDecimal tradePrice;
        @SerializedName("trade_fee")
        private BigDecimal tradeFee;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        @SerializedName("created_at")
        private long createdAt;
        @SerializedName("fee_asset")
        private String feeAsset;
        private String role;

    }
}
