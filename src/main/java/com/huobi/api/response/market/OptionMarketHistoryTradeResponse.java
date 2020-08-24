package com.huobi.api.response.market;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionMarketHistoryTradeResponse {
    /**
     * "ch":"market.BTC-USDT-200807-C-9500.trade.detail",
     * "status":"ok",
     * "ts":1596789456285
     * "data":[{"data":[{"amount":2,"direction":"sell","id":4929571880000,"price":102,"ts":1596781736363}],"id":492957188,"ts":1596781736363},{"data":[{"amount":4,"direction":"sell","id":4929572780000,"price":102,"ts":1596781736470},{"amount":6,"direction":"sell","id":4929572780001,"price":102,"ts":1596781736470}],"id":492957278,"ts":1596781736470},{"data":[{"amount":2,"direction":"sell","id":4929573390000,"price":102,"ts":1596781736530}],"id":492957339,"ts":1596781736530},{"data":[{"amount":2,"direction":"sell","id":4929581610000,"price":102,"ts":1596781737431},{"amount":2,"direction":"sell","id":4929581610001,"price":102,"ts":1596781737431},{"amount":2,"direction":"sell","id":4929581610002,"price":102,"ts":1596781737431},{"amount":2,"direction":"sell","id":4929581610003,"price":102,"ts":1596781737431},{"amount":2,"direction":"sell","id":4929581610004,"price":102,"ts":1596781737431}],"id":492958161,"ts":1596781737431},{"data":[{"amount":8,"direction":"sell","id":4929581620000,"price":102,"ts":1596781737431},{"amount":2,"direction":"sell","id":4929581620001,"price":102,"ts":1596781737431}],"id":492958162,"ts":1596781737431},{"data":[{"amount":2,"direction":"sell","id":4929582770000,"price":102,"ts":1596781737527},{"amount":8,"direction":"sell","id":4929582770001,"price":102,"ts":1596781737527}],"id":492958277,"ts":1596781737527},{"data":[{"amount":2,"direction":"sell","id":4929586210000,"price":102,"ts":1596781737869}],"id":492958621,"ts":1596781737869},{"data":[{"amount":2,"direction":"sell","id":4929586700000,"price":102,"ts":1596781737987}],"id":492958670,"ts":1596781737987},{"data":[{"amount":2,"direction":"sell","id":4929587160000,"price":102,"ts":1596781738022}],"id":492958716,"ts":1596781738022},{"data":[{"amount":2,"direction":"buy","id":4929592530000,"price":2288.35,"ts":1596789186777}],"id":492959253,"ts":1596789186777}]
     */

    private String ch;
    private String status;
    private Long ts;
    private List<DataBeanX> data;

    @Data
    @AllArgsConstructor
    public static class DataBeanX {
        /**
         * "id":492957188,
         * "ts":1596781736363
         * "data":[{"amount":2,"direction":"sell","id":4929571880000,"price":102,"ts":1596781736363}]
         */

        private Long id;
        private Long ts;
        private List<DataBean> data;

        @Data
        @AllArgsConstructor
        public static class DataBean {
            /**
             * "amount":2,
             * "direction":"sell",
             * "id":4929571880000,
             * "price":102,
             * "ts":1596781736363
             */

            private Integer amount;
            private String direction;
            private Long id;
            private BigDecimal price;
            private Long ts;

        }
    }
}
