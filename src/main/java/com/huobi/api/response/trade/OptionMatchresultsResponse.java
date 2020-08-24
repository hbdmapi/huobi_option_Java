package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionMatchresultsResponse {
    /**
     * "status":"ok",
     * "ts":1597027565199
     * "data":{"currentPage":1,"totalPage":35,"totalSize":171,"trades":[{"contractCode":"BTC-USDT-200814-C-8500","contractType":"this_week","createDate":1597027295760,"deliveryDate":"20200814","direction":"sell","exercisePrice":8500.000000000000000000,"feeAsset":"USDT","id":"578191640-742331811614437376-1","matchId":578191640,"offset":"close","offsetProfitloss":-0.01385,"optionRightType":"C","orderId":742331811614437376,"orderIdStr":742331811614437376,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.005,"tradePartition":"USDT","tradePrice":3294.74,"tradeTurnover":3.29474,"tradeVolume":1},{"contractCode":"BTC-USDT-200814-C-8500","contractType":"this_week","createDate":1597027187597,"deliveryDate":"20200814","direction":"buy","exercisePrice":8500.000000000000000000,"feeAsset":"USDT","id":"578191639-742331355848781824-1","matchId":578191639,"offset":"open","offsetProfitloss":0,"optionRightType":"C","orderId":742331355848781824,"orderIdStr":742331355848781824,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.01,"tradePartition":"USDT","tradePrice":3308.59,"tradeTurnover":6.61718,"tradeVolume":2},{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createDate":1597024700432,"deliveryDate":"20200814","direction":"buy","exercisePrice":9500.000000000000000000,"feeAsset":"USDT","id":"578191114-742320926011437056-1","matchId":578191114,"offset":"open","offsetProfitloss":0,"optionRightType":"C","orderId":742320926011437056,"orderIdStr":742320926011437056,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.005,"tradePartition":"USDT","tradePrice":143,"tradeTurnover":0.143,"tradeVolume":1},{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createDate":1597024700432,"deliveryDate":"20200814","direction":"buy","exercisePrice":9500.000000000000000000,"feeAsset":"USDT","id":"578191114-742320926011437056-2","matchId":578191114,"offset":"open","offsetProfitloss":0,"optionRightType":"C","orderId":742320926011437056,"orderIdStr":742320926011437056,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.005,"tradePartition":"USDT","tradePrice":143,"tradeTurnover":0.143,"tradeVolume":1},{"contractCode":"BTC-USDT-200807-C-8000","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"sell","exercisePrice":8000.000000000000000000,"feeAsset":"USDT","id":"12917335322198671370","matchId":0,"offset":"close","offsetProfitloss":0.000642028537770279,"optionRightType":"C","orderId":1291733532219867137,"orderIdStr":1291733532219867137,"orderSource":"settlement","quoteAsset":"USDT","role":"Itm delivery records","symbol":"BTC","tradeFee":-3.39492865557E-7,"tradePartition":"USDT","tradePrice":11782.28,"tradeTurnover":23.56456,"tradeVolume":2}]}
     */

    private DataBean data;
    private String status;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "currentPage":1,
         * "totalPage":35,
         * "totalSize":171,
         * "trades":[{"contractCode":"BTC-USDT-200814-C-8500","contractType":"this_week","createDate":1597027295760,"deliveryDate":"20200814","direction":"sell","exercisePrice":8500.000000000000000000,"feeAsset":"USDT","id":"578191640-742331811614437376-1","matchId":578191640,"offset":"close","offsetProfitloss":-0.01385,"optionRightType":"C","orderId":742331811614437376,"orderIdStr":742331811614437376,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.005,"tradePartition":"USDT","tradePrice":3294.74,"tradeTurnover":3.29474,"tradeVolume":1},{"contractCode":"BTC-USDT-200814-C-8500","contractType":"this_week","createDate":1597027187597,"deliveryDate":"20200814","direction":"buy","exercisePrice":8500.000000000000000000,"feeAsset":"USDT","id":"578191639-742331355848781824-1","matchId":578191639,"offset":"open","offsetProfitloss":0,"optionRightType":"C","orderId":742331355848781824,"orderIdStr":742331355848781824,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.01,"tradePartition":"USDT","tradePrice":3308.59,"tradeTurnover":6.61718,"tradeVolume":2},{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createDate":1597024700432,"deliveryDate":"20200814","direction":"buy","exercisePrice":9500.000000000000000000,"feeAsset":"USDT","id":"578191114-742320926011437056-1","matchId":578191114,"offset":"open","offsetProfitloss":0,"optionRightType":"C","orderId":742320926011437056,"orderIdStr":742320926011437056,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.005,"tradePartition":"USDT","tradePrice":143,"tradeTurnover":0.143,"tradeVolume":1},{"contractCode":"BTC-USDT-200814-C-9500","contractType":"this_week","createDate":1597024700432,"deliveryDate":"20200814","direction":"buy","exercisePrice":9500.000000000000000000,"feeAsset":"USDT","id":"578191114-742320926011437056-2","matchId":578191114,"offset":"open","offsetProfitloss":0,"optionRightType":"C","orderId":742320926011437056,"orderIdStr":742320926011437056,"orderSource":"api","quoteAsset":"USDT","role":"Taker","symbol":"BTC","tradeFee":-0.005,"tradePartition":"USDT","tradePrice":143,"tradeTurnover":0.143,"tradeVolume":1},{"contractCode":"BTC-USDT-200807-C-8000","contractType":"this_week","createDate":1596808248989,"deliveryDate":"20200807","direction":"sell","exercisePrice":8000.000000000000000000,"feeAsset":"USDT","id":"12917335322198671370","matchId":0,"offset":"close","offsetProfitloss":0.000642028537770279,"optionRightType":"C","orderId":1291733532219867137,"orderIdStr":1291733532219867137,"orderSource":"settlement","quoteAsset":"USDT","role":"Itm delivery records","symbol":"BTC","tradeFee":-3.39492865557E-7,"tradePartition":"USDT","tradePrice":11782.28,"tradeTurnover":23.56456,"tradeVolume":2}]
         */

        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<TradesBean> trades;

        @Data
        @AllArgsConstructor
        public static class TradesBean {
            /**
             * "contractCode":"BTC-USDT-200814-C-8500",
             * "contractType":"this_week",
             * "createDate":1597027295760,
             * "deliveryDate":"20200814",
             * "direction":"sell",
             * "exercisePrice":8500,
             * "feeAsset":"USDT",
             * "id":"578191640-742331811614437376-1",
             * "matchId":578191640,
             * "offset":"close",
             * "offsetProfitloss":-0.01385,
             * "optionRightType":"C",
             * "orderId":742331811614437376,
             * "orderIdStr":742331811614437376,
             * "orderSource":"api",
             * "quoteAsset":"USDT",
             * "role":"Taker",
             * "symbol":"BTC",
             * "tradeFee":-0.005,
             * "tradePartition":"USDT",
             * "tradePrice":3294.74,
             * "tradeTurnover":3.29474,
             * "tradeVolume":1
             */

            @SerializedName("match_id")
            private Long matchId;
            private String id;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private Long orderIdStr;
            private String symbol;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("contract_type")
            private String contractType;
            @SerializedName("contract_code")
            private String contractCode;
            private String direction;
            private String offset;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_price")
            private BigDecimal tradePrice;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            @SerializedName("create_date")
            private Long createDate;
            @SerializedName("offset_profitloss")
            private BigDecimal offsetProfitloss;
            @SerializedName("trade_fee")
            private double tradeFee;
            @SerializedName("fee_asset")
            private String feeAsset;
            private String role;
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


        }
    }
}
