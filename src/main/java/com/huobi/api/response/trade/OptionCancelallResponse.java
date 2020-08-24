package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OptionCancelallResponse {
    /**
     * "status":"ok",
     * "ts":1596792894418
     * "data":{"errors":[],"successes":"741348120465518592"}
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "successes":"741348120465518592"
         * "errors":[]
         */
        private List<ErrorsBean> errors;
        private String successes;

        @Data
        @AllArgsConstructor
        public static class ErrorsBean {
            /**
             * order_id : 161251
             * err_code : 200417
             * err_msg : invalid symbol
             */

            @SerializedName("order_id")
            private String orderId;
            @SerializedName("err_code")
            private Integer errCode;
            @SerializedName("err_msg")
            private String errMsg;

        }
    }
}
