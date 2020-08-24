package com.huobi.api.response.trade;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionTriggerCancelallResponse {
    /**
     * "status":"ok",
     * "ts":1597039896876
     * "data":[{"errors":[],"successes":"742382948589776896"}]
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @AllArgsConstructor
    @Data
    public static class DataBean {
        /**
         * "successes":"742382948589776896"
         * "errors":[]
         */
        private String successes;
        private List<ErrorsBean> errors;

        @Data
        @AllArgsConstructor
        @Builder
        public static class ErrorsBean {
            @SerializedName("order_id")
            private String orderId;
            @SerializedName("err-code")
            private Long errCode;
            @SerializedName("err-msg")
            private String errMsg;
        }
    }

}
