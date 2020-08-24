package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionContractInfoResponse {


    /**
     * "status":"ok",
     * "ts":1596785223631
     * "data":[{"contractCode":"BTC-USDT-200807-C-7000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"BTC","deliveryDate":"20200807","exercisePrice":7000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-P-7000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"USDT","deliveryDate":"20200807","exercisePrice":7000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-C-8000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"BTC","deliveryDate":"20200807","exercisePrice":8000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-P-8000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"USDT","deliveryDate":"20200807","exercisePrice":8000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-C-9000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"BTC","deliveryDate":"20200807","exercisePrice":9000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-P-9000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"USDT","deliveryDate":"20200807","exercisePrice":9000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-C-9500","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"BTC","deliveryDate":"20200807","exercisePrice":9500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-P-9500","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"USDT","deliveryDate":"20200807","exercisePrice":9500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-C-10000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"BTC","deliveryDate":"20200807","exercisePrice":10000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-P-10000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"USDT","deliveryDate":"20200807","exercisePrice":10000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-C-11000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"BTC","deliveryDate":"20200807","exercisePrice":11000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-P-11000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"USDT","deliveryDate":"20200807","exercisePrice":11000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-C-12000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"BTC","deliveryDate":"20200807","exercisePrice":12000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200807-P-12000","contractSize":0,"contractStatus":1,"contractType":"this_week","createDate":"20200717","deliveryAsset":"USDT","deliveryDate":"20200807","exercisePrice":12000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-C-8500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"BTC","deliveryDate":"20200814","exercisePrice":8500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-P-8500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"USDT","deliveryDate":"20200814","exercisePrice":8500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-C-9500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"BTC","deliveryDate":"20200814","exercisePrice":9500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-P-9500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"USDT","deliveryDate":"20200814","exercisePrice":9500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-C-10000","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"BTC","deliveryDate":"20200814","exercisePrice":10000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-P-10000","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"USDT","deliveryDate":"20200814","exercisePrice":10000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-C-10500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"BTC","deliveryDate":"20200814","exercisePrice":10500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-P-10500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"USDT","deliveryDate":"20200814","exercisePrice":10500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-C-11500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"BTC","deliveryDate":"20200814","exercisePrice":11500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200814-P-11500","contractSize":0,"contractStatus":1,"contractType":"next_week","createDate":"20200724","deliveryAsset":"USDT","deliveryDate":"20200814","exercisePrice":11500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-C-4500","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"BTC","deliveryDate":"20200925","exercisePrice":4500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-P-4500","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"USDT","deliveryDate":"20200925","exercisePrice":4500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-C-7000","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"BTC","deliveryDate":"20200925","exercisePrice":7000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-P-7000","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"USDT","deliveryDate":"20200925","exercisePrice":7000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-C-9000","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"BTC","deliveryDate":"20200925","exercisePrice":9000.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-P-9000","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"USDT","deliveryDate":"20200925","exercisePrice":9000.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-C-11500","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"BTC","deliveryDate":"20200925","exercisePrice":11500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-P-11500","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"USDT","deliveryDate":"20200925","exercisePrice":11500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-C-13500","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"BTC","deliveryDate":"20200925","exercisePrice":13500.000000000000000000,"optionRightType":"C","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"},{"contractCode":"BTC-USDT-200925-P-13500","contractSize":0,"contractStatus":1,"contractType":"quarter","createDate":"20200626","deliveryAsset":"USDT","deliveryDate":"20200925","exercisePrice":13500.000000000000000000,"optionRightType":"P","priceTick":0.010000000000000000,"quoteAsset":"USDT","symbol":"BTC","tradePartition":"USDT"}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "contractCode":"BTC-USDT-200807-C-7000",
         * "contractSize":0,
         * "contractStatus":1,
         * "contractType":"this_week",
         * "createDate":"20200717",
         * "deliveryAsset":"BTC",
         * "deliveryDate":"20200807",
         * "exercisePrice":7000,
         * "optionRightType":"C",
         * "priceTick":0.01,
         * "quoteAsset":"USDT",
         * "symbol":"BTC",
         * "tradePartition":"USDT"
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("contract_size")
        private Integer contractSize;
        @SerializedName("price_tick")
        private BigDecimal priceTick;
        @SerializedName("delivery_date")
        private String deliveryDate;
        @SerializedName("create_date")
        private String createDate;
        @SerializedName("contract_status")
        private Integer contractStatus;
        @SerializedName("option_right_type")
        private String optionRightType;
        @SerializedName("exercise_price")
        private BigDecimal exercisePrice;
        @SerializedName("delivery_asset")
        private String deliveryAsset;
        @SerializedName("quote_asset")
        private String quoteAsset;

    }
}
