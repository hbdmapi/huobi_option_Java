package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OptionLightningClosePositionResponse {
    /**
     * "orderId":742331811614437376,"orderIdStr":"742331811614437376"}
     * "status":"ok",
     * "ts":1597027295752
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "orderId":742331811614437376,
         * "orderIdStr":"742331811614437376"
         */

        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
        @SerializedName("client_order_id")
        private Long clientOrderId;

    }
}
