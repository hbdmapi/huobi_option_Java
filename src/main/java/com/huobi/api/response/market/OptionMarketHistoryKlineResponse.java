package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionMarketHistoryKlineResponse {

    /**
     * "status":"ok",
     * "ts":1596789005985
     * "ch":"market.BTC-USDT-200724-C-9500.kline.60min",
     * "data":[{"amount":0,"close":35.88,"count":0,"high":35.88,"id":1595250000,"low":35.88,"open":35.88,"vol":0},{"amount":8.1,"close":43.45,"count":812,"high":43.45,"id":1595253600,"low":33.57,"open":33.57,"vol":8100}]
     */

    private String ch;
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "amount":49.53,
         * "close":1000,
         * "count":13816,
         * "high":1000,
         * "id":1595260800,
         * "low":152,
         * "open":152,
         * "tradeTurnover":39087.728,
         * "vol":49530
         */

        private BigDecimal amount;
        private BigDecimal close;
        private BigDecimal count;
        private BigDecimal high;
        private Long id;
        private BigDecimal low;
        private BigDecimal open;
        private BigDecimal vol;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;

    }
}
