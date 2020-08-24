package com.huobi.wss.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class MarketTradeDetailReqResponse {

    /**
     * "id":"",
     * "rep":"market.BTC-USDT-200814-C-9500.trade.detail",
     * "status":"ok",
     * "ts":1597116205538
     * "data":[{"amount":"10","ts":1597115842123,"id":6371131620000,"price":"102","direction":"sell"},{"amount":"10","ts":1597115842171,"id":6371132080000,"price":"102","direction":"sell"},{"amount":"10","ts":1597115843044,"id":6371139950000,"price":"102","direction":"sell"},{"amount":"10","ts":1597115843118,"id":6371140570000,"price":"102","direction":"sell"},{"amount":"10","ts":1597115843167,"id":6371141220000,"price":"102","direction":"sell"}]
     */

    private Long id;
    private String rep;
    private String status;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "amount":"10",
         * "ts":1597115842123,
         * "id":6371131620000,
         * "price":"102",
         * "direction":"sell"
         */

        private BigDecimal amount;
        private Long ts;
        private Long id;
        private BigDecimal price;
        private String direction;

    }
}
