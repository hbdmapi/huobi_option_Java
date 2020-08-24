package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OptionDeliveryPriceResponse {


    /**
     * "status":"ok",
     * "ts":1596785492136
     * "data":{"deliveryPrice":11781.5504444444444444444444,"symbol":"BTC","tradePartition":"USDT"}
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "deliveryPrice":11781.5504444444444444444444,
         * "symbol":"BTC",
         * "tradePartition":"USDT"
         */

        @SerializedName("delivery_price")
        private BigDecimal deliveryPrice;
        private String symbol;
        @SerializedName("trade_partition")
        private String tradePartition;

    }
}
