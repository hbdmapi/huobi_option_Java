package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
@AllArgsConstructor
public class MarketKLineReqResponse {


    /**
     * "wsid":2058981640,
     * "id":"",
     * "rep":"market.BTC-USDT-200814-C-9500.kline.60min",
     * "status":"ok"
     * "data":[{"amount":12,"high":740.14,"vol":12000,"low":737.45,"count":20,"id":1596096000,"close":737.47,"tradeTurnover":8865.54,"open":740.14},{"amount":9.6,"high":740.49,"vol":9600,"low":740.44,"count":16,"id":1596099600,"close":740.44,"tradeTurnover":7108.476,"open":740.49},{"amount":0.2,"high":722.7,"vol":200,"low":722.7,"count":1,"id":1596103200,"close":722.7,"tradeTurnover":144.54,"open":722.7},{"amount":10.944,"high":759.48,"vol":10944,"low":719.04,"count":19,"id":1596106800,"close":745.57,"tradeTurnover":8051.54688,"open":719.04},{"amount":0.576,"high":761.54,"vol":576,"low":761.54,"count":1,"id":1596110400,"close":761.54,"tradeTurnover":438.64704,"open":761.54}]
     */

    private String id;
    private String rep;
    private Long wsid;
    private String status;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "amount":0.2,
         * "high":722.7,
         * "vol":200,
         * "low":722.7,
         * "count":1,
         * "id":1596103200,
         * "close":722.7,
         * "tradeTurnover":144.54,
         * "open":722.7
         */

        private Long id;
        private BigDecimal open;
        private BigDecimal close;
        private BigDecimal low;
        private BigDecimal high;
        private BigDecimal amount;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        private BigDecimal vol;
        private BigDecimal count;

    }
}
