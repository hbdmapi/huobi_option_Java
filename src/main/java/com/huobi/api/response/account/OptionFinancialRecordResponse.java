package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionFinancialRecordResponse {

    /**
     * "status":"ok",
     * "ts":1597389892256
     * "data":{"currentPage":1,"financialRecord":[{"amount":0,"contractCode":"BTC-USDT-200814-C-10573","id":1952706593,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":11},{"amount":-0.042875,"contractCode":"BTC-USDT-200814-C-10573","id":1952706592,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":10},{"amount":-0.000026666666666667,"contractCode":"BTC-USDT-200814-C-10573","id":1952706591,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":11},{"amount":0.04666666666666667,"contractCode":"BTC-USDT-200814-C-10573","id":1952706590,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":9},{"amount":-3.39492865557E-7,"contractCode":"","id":532238317,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":11},{"amount":0.000642028537770279,"contractCode":"","id":532238316,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":9},{"amount":0,"contractCode":"","id":532238315,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":11},{"amount":-0.09568999548474488,"contractCode":"","id":532238314,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":10},{"amount":1,"contractCode":"","id":531562452,"symbol":"BTC","tradePartition":"USDT","ts":1596782109655,"type":35},{"amount":1,"contractCode":"","id":531538453,"symbol":"BTC","tradePartition":"USDT","ts":1596781837151,"type":35},{"amount":1,"contractCode":"","id":531192988,"symbol":"BTC","tradePartition":"USDT","ts":1596781095158,"type":35},{"amount":-1,"contractCode":"","id":531149860,"symbol":"BTC","tradePartition":"USDT","ts":1596780863650,"type":34},{"amount":-100,"contractCode":"","id":530971262,"symbol":"BTC","tradePartition":"USDT","ts":1596779848825,"type":34},{"amount":1000,"contractCode":"","id":528145752,"symbol":"BTC","tradePartition":"USDT","ts":1596771208800,"type":26}],"totalPage":1,"totalSize":14}
     */

    private String status;
    private DataBean data;
    private long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "totalPage":1,
         * "totalSize":14,
         * "currentPage":1,
         * "financialRecord":[{"amount":0,"contractCode":"BTC-USDT-200814-C-10573","id":1952706593,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":11},{"amount":-0.042875,"contractCode":"BTC-USDT-200814-C-10573","id":1952706592,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":10},{"amount":-0.000026666666666667,"contractCode":"BTC-USDT-200814-C-10573","id":1952706591,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":11},{"amount":0.04666666666666667,"contractCode":"BTC-USDT-200814-C-10573","id":1952706590,"symbol":"BTC","tradePartition":"USDT","ts":1597244002296,"type":9},{"amount":-3.39492865557E-7,"contractCode":"","id":532238317,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":11},{"amount":0.000642028537770279,"contractCode":"","id":532238316,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":9},{"amount":0,"contractCode":"","id":532238315,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":11},{"amount":-0.09568999548474488,"contractCode":"","id":532238314,"symbol":"BTC","tradePartition":"USDT","ts":1596808249185,"type":10},{"amount":1,"contractCode":"","id":531562452,"symbol":"BTC","tradePartition":"USDT","ts":1596782109655,"type":35},{"amount":1,"contractCode":"","id":531538453,"symbol":"BTC","tradePartition":"USDT","ts":1596781837151,"type":35},{"amount":1,"contractCode":"","id":531192988,"symbol":"BTC","tradePartition":"USDT","ts":1596781095158,"type":35},{"amount":-1,"contractCode":"","id":531149860,"symbol":"BTC","tradePartition":"USDT","ts":1596780863650,"type":34},{"amount":-100,"contractCode":"","id":530971262,"symbol":"BTC","tradePartition":"USDT","ts":1596779848825,"type":34},{"amount":1000,"contractCode":"","id":528145752,"symbol":"BTC","tradePartition":"USDT","ts":1596771208800,"type":26}]
         */
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        @SerializedName("financial_record")
        private List<FinancialRecordBean> financialRecord;

        @Data
        @AllArgsConstructor
        public static class FinancialRecordBean {

            /**
             * "amount":0,
             * "contractCode":"BTC-USDT-200814-C-10573",
             * "id":1952706593,
             * "symbol":"BTC",
             * "tradePartition":"USDT",
             * "ts":1597244002296,
             * "type":11
             */
            private Long id;
            private Long ts;
            private String symbol;
            private Integer type;
            private BigDecimal amount;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("contract_code")
            private String contractCode;

        }
    }
}
