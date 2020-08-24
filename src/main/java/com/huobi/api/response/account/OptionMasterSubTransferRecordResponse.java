package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import sun.rmi.runtime.Log;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionMasterSubTransferRecordResponse {

    /**
     * "status":"ok",
     * "ts":1596780358421
     * "data":[{"currentPage":1,"totalPage":1,"totalSize":5,"transferRecord":[{"amount":1,"id":531562454,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":35,"ts":1596782109613},{"amount":1,"id":531538469,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":35,"ts":1596781837151},{"amount":1,"id":531192989,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":35,"ts":1596781095157},{"amount":-1,"id":531149867,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":34,"ts":1596780863651},{"amount":-100,"id":530971249,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":34,"ts":1596779848825}]}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {

        /**
         * "currentPage":1,
         * "transferRecord":[{"amount":1,"id":531562454,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":35,"ts":1596782109613},{"amount":1,"id":531538469,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":35,"ts":1596781837151},{"amount":1,"id":531192989,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":35,"ts":1596781095157},{"amount":-1,"id":531149867,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":34,"ts":1596780863651},{"amount":-100,"id":530971249,"subAccountName":"1234","subUid":"2373983","symbol":"BTC","tradePartition":"USDT","transferType":34,"ts":1596779848825}]
         * "totalPage":1,
         * "totalSize":4
         */

        @SerializedName("transfer_record")
        private List<TransferRecord> transferRecord;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;

        @Data
        @AllArgsConstructor
        @Builder
        public static class TransferRecord {

            /**
             * "amount":1,
             * "id":531562454,
             * "subAccountName":"1234",
             * "subUid":"2373983",
             * "symbol":"BTC",
             * "tradePartition":"USDT",
             * "transferType":35,
             * "ts":1596782109613
             */

            private Long id;
            private Long ts;
            private String symbol;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("sub_uid")
            private String subUid;
            @SerializedName("sub_account_name")
            private String subAccountName;
            @SerializedName("transfer_type")
            private Integer transferType;
            private BigDecimal amount;
        }
    }
}
