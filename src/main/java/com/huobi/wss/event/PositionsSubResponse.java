package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class PositionsSubResponse {
    /**
     * "op":"notify",
     * "topic":"positions",
     * "ts":1597116673907,
     * "uid":"2373908",
     * "event":"init",
     * "data":[{"symbol":"BTC","contract_code":"BTC-USDT-200814-C-8500","contract_type":"this_week","volume":148,"available":148,"frozen":0E-18,"cost_open":4634.448581081081081077,"cost_hold":4634.448581081081081077,"profit_unreal":-5.098389999999999999396,"profit_rate":-0.007433156389243018,"profit":-5.098389999999999999396,"margin_position":0,"direction":"buy","last_price":4600,"trade_partition":"USDT","delivery_date":"20200814","option_right_type":"C","exercise_price":8.5E+3,"quote_asset":"USDT","margin_asset":"BTC","position_value":680.8},{"symbol":"BTC","contract_code":"BTC-USDT-200814-C-8500","contract_type":"this_week","volume":145,"available":145,"frozen":0E-18,"cost_open":4642.862068965517241377,"cost_hold":4642.862068965517241377,"profit_unreal":6.214999999999999999665,"profit_rate":0.009231820443691836,"profit":6.214999999999999999665,"margin_position":0.145,"direction":"sell","last_price":4600,"trade_partition":"USDT","delivery_date":"20200814","option_right_type":"C","exercise_price":8.5E+3,"quote_asset":"USDT","margin_asset":"BTC","position_value":-667}]
     */

    private String op;
    private String topic;
    private Long ts;
    private String event;
    private String uid;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "symbol":"BTC",
         * "contract_code":"BTC-USDT-200814-C-8500",
         * "contract_type":"this_week",
         * "volume":148,
         * "available":148,
         * "frozen":0,
         * "cost_open":4634.448581081081081077,
         * "cost_hold":4634.448581081081081077,
         * "profit_unreal":-5.098389999999999999396,
         * "profit_rate":-0.007433156389243018,
         * "profit":-5.098389999999999999396,
         * "margin_position":0,
         * "direction":"buy",
         * "last_price":4600,
         * "trade_partition":"USDT",
         * "delivery_date":"20200814",
         * "option_right_type":"C",
         * "exercise_price":8500,
         * "quote_asset":"USDT",
         * "margin_asset":"BTC",
         * "position_value":680.8
         */

        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("contract_type")
        private String contractType;
        private BigDecimal volume;
        private BigDecimal available;
        private BigDecimal frozen;
        @SerializedName("cost_open")
        private BigDecimal costOpen;
        @SerializedName("cost_hold")
        private BigDecimal costHold;
        @SerializedName("profit_unreal")
        private BigDecimal profitUnreal;
        @SerializedName("profit_rate")
        private BigDecimal profitRate;
        private BigDecimal profit;
        @SerializedName("margin_position")
        private BigDecimal marginPosition;
        @SerializedName("position_value")
        private Integer positionValue;
        private String direction;
        @SerializedName("last_price")
        private BigDecimal lastPrice;
        @SerializedName("delivery_date")
        private String deliveryDate;
        @SerializedName("option_right_type")
        private String optionRightType;
        @SerializedName("exercise_price")
        private BigDecimal exercisePrice;
        @SerializedName("quote_asset")
        private String quoteAsset;
        @SerializedName("margin_asset")
        private String marginAsset;

    }
}
