package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OptionBatchorderResponse {

    /**
     * "status":"ok",
     * "ts":1596792468207
     * "data":{"errors":[],"success":[{"index":1,"orderId":741346873276641280,"orderIdStr":"741346873276641280"},{"index":2,"orderId":741346873473773568,"orderIdStr":"741346873473773568"}]}
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "errors":[]
         * "success":[{"index":1,"orderId":741346873276641280,"orderIdStr":"741346873276641280"},{"index":2,"orderId":741346873473773568,"orderIdStr":"741346873473773568"}]
         */

        private List<ErrorsBean> errors;
        private List<SuccessBean> success;

        @Data
        @AllArgsConstructor
        public static class ErrorsBean {
            /**
             * "index":1,
             * "orderId":741346873276641280,
             * "orderIdStr":"741346873276641280"
             */

            private Integer index;
            @SerializedName("err_code")
            private Integer errCode;
            @SerializedName("err_msg")
            private String errMsg;

        }

        @Data
        @AllArgsConstructor
        public static class SuccessBean {
            /**
             * index : 1
             * order_id : 161256
             * client_order_id : 1344567
             */

            private Integer index;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("client_order_id")
            private Long clientOrderId;

        }
    }
}
