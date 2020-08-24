package com.huobi.wss.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class MarketTradeDetailSubResponse {

    /**
     * "ch":"market.BTC-USDT-200814-C-9500.trade.detail",
     * "ts":1597115858612,
     * "tick":{"id":637127804,"ts":1597115858541,"data":[{"amount":10,"ts":1597115858541,"id":6371278040000,"price":102,"direction":"sell"}]}
     */

    private String ch;
    private Long ts;
    private TickBean tick;


    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         * "id":637127804,
         * "ts":1597115858541,
         * "data":[{"amount":10,"ts":1597115858541,"id":6371278040000,"price":102,"direction":"sell"}]
         */

        private Long id;
        private Long ts;
        private List<DataBean> data;


        @Data
        @AllArgsConstructor
        public static class DataBean {
            /**
             * "amount":10,
             * "ts":1597115858541,
             * "id":6371278040000,
             * "price":102,
             * "direction":"sell"
             */

            private BigDecimal amount;
            private Long ts;
            private Long id;
            private BigDecimal price;
            private String direction;

        }
    }
}
