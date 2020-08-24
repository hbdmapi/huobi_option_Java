package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionIndexResponse {


    /**
     * "status":"ok",
     * "ts":1596786172009
     * "data":[{"indexPrice":11786.319568800000000000,"indexTs":1596786171044,"symbol":"BTC-USDT"}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "indexPrice":11786.3195688,
         * "indexTs":1596786171044,
         * "symbol":"BTC-USDT"
         */

        private String symbol;
        @SerializedName("index_price")
        private BigDecimal indexPrice;
        @SerializedName("index_ts")
        private Long indexTs;

    }
}
