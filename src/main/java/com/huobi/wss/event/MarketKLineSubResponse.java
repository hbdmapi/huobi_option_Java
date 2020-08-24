package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
public class MarketKLineSubResponse {

    /**
     * "ch":"market.BTC-USDT-200814-C-9500.kline.1min",
     * "ts":1597111903479,
     * "tick":{"id":1597111860,"mrid":633564289,"open":102,"close":102,"high":102,"low":102,"amount":1.232,"vol":1232,"trade_turnover":125.664,"count":318}
     */

    private String ch;
    private Long ts;
    private TickBean tick;

    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         * "id":1597111860,
         * "mrid":633564289,
         * "open":102,
         * "close":102,
         * "high":102,
         * "low":102,
         * "amount":1.232,
         * "vol":1232,
         * "trade_turnover":125.664,
         * "count":318
         */

        private Long id;
        private BigDecimal mrid;
        private BigDecimal vol;
        private BigDecimal count;
        private BigDecimal open;
        private BigDecimal close;
        private BigDecimal low;
        private BigDecimal high;
        private BigDecimal amount;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;

    }
}
