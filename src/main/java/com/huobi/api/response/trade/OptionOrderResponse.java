package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class OptionOrderResponse {

    /**
     * "status":"ok",
     * "ts":1597039267821
     * "data":{"orderId":742382026111332352,"orderIdStr":"742382026111332352"}
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "orderId":742382026111332352,
         * "orderIdStr":"742382026111332352"
         */

        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
        @SerializedName("client_order_id")
        private Long clientOrderId;

    }
}
