package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class OptionTriggerOrderResponse {

    /**
     * "status":"ok",
     * "ts":1597039487763
     * "data":[{"orderId":742382948589776896,"orderIdStr":"742382948589776896"}]
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    public static class DataBean {
        /**
         * "orderId":742382948589776896,
         * "orderIdStr":"742382948589776896"
         */

        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
    }
}
