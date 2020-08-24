package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OptionCancelResponse {

    /**
     * "status":"ok",
     * "ts":1596793454826
     * "data":{"errors":[],"successes":"741350788378406912,741350788508430336"}
     */

    private String status;
    private DataBean data;
    private Long ts;


    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "successes":"741350788378406912,741350788508430336"
         * "errors":[]
         */

        private List<ErrorsBean> errors;
        private String successes;


        @Data
        @AllArgsConstructor
        public static class ErrorsBean {
            /**
             * "errCode":1071,
             * "errMsg":"Repeated withdraw.",
             * "orderId":"741350788508430336"
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
