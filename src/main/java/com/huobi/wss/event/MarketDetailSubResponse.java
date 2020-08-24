package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MarketDetailSubResponse {
    /**
     * "ch":"market.BTC-USDT-200814-C-9500.detail",
     * "ts":1597110796482,
     * "tick":{"id":1597110780,"mrid":632730006,"open":102,"close":102,"high":143,"low":102,"amount":1772.864,"vol":1772864,"trade_turnover":181105.6546,"count":392137}
     */

    private String ch;
    private Long ts;
    private TickBean tick;


    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         * "id":1597110780,
         * "mrid":632730006,
         * "open":102,
         * "close":102,
         * "high":143,
         * "low":102,
         * "amount":1772.864,
         * "vol":1772864,
         * "trade_turnover":181105.6546,
         * "count":392137
         */

        private Long id;
        private Long mrid;
        private BigDecimal open;
        private BigDecimal close;
        private BigDecimal high;
        private BigDecimal low;
        private BigDecimal amount;
        private BigDecimal vol;
        private BigDecimal count;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;

    }
}
