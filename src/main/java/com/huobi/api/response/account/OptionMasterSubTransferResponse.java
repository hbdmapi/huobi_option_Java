package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionMasterSubTransferResponse {

    /**
     * "status":"ok",
     * "ts":1596781095175
     * "data":[{"orderId":741303426608017408}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "orderId":741303426608017408
         */

        @SerializedName("order_id")
        private Long orderId;
    }
}
