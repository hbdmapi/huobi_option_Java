package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionMarketDetailMergedResponse {

    /**
     * "ch":"market.BTC-USDT-200807-C-9500.detail.merged",
     * "status":"ok",
     * "ts":1596788570774
     * "tick":{"amount":"391.514","ask":[2288.35,159],"bid":[102,518],"close":"102","count":28850,"high":"2372.81","id":1596788570,"low":"102","open":"2335.76","ts":1596788570774,"vol":"391514"},"ts":1596788570774}
     */

    private String ch;
    private String status;
    private TickBean tick;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         *
         * "amount":"391.514",
         * "close":"102",
         * "count":28850,
         * "high":"2372.81",
         * "id":1596788847,
         * "low":"102",
         * "open":"2335.76",
         * "tradeTurnover":585084.12176,
         * "ts":1596788847625,
         * "vol":"391514"
         * "ask":[2288.35,159]
         * "bid":[102,518]
         *
         */

        private String amount;
        private String close;
        private Integer count;
        private String high;
        private Integer id;
        private String low;
        private String open;
        private Long ts;
        private String vol;
        private List<BigDecimal> ask;
        private List<BigDecimal> bid;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
    }
}
