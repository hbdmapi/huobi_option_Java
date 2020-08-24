package com.huobi.api.response.market;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OptionMarketTradeResponse {
    /**
     * "ch":"market.BTC-USDT-200807-C-9500.trade.detail",
     * "status":"ok",
     * "ts":1596790755489
     * "tick":{"data":[{"amount":"2","direction":"sell","id":4929659170000,"price":"102","ts":1596789475748}],"id":1596790755489,"ts":1596790755489}
     */

    private String ch;
    private String status;
    private TickBean tick;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         * "id":1596790755489,
         * "ts":1596790755489
         * "data":[{"amount":"2","direction":"sell","id":4929659170000,"price":"102","ts":1596789475748}]
         */

        private Long id;
        private Long ts;
        private List<DataBean> data;

        @Data
        @AllArgsConstructor
        public static class DataBean {
            /**
             * "amount":"2",
             * "direction":"sell",
             * "id":4929659170000,
             * "price":"102",
             * "ts":1596789475748
             *
             */

            private String amount;
            private String direction;
            private Long id;
            private String price;
            private Long ts;

        }
    }
}
