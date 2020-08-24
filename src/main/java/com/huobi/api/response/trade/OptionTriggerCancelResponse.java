package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OptionTriggerCancelResponse {
    /**
     * "status":"ok",
     * "ts":1597039712043
     * "data":[{"errors":[],"successes":"742383732068986880"}]
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @AllArgsConstructor
    @Data
    public static class DataBean {

        /**
         * "successes":"742383732068986880"
         * "errors":[]
         */
        private String successes;
        private List<ErrorsBean> errors;

        @Builder
        @AllArgsConstructor
        @Data
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
