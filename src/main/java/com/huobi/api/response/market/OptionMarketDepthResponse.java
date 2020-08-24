package com.huobi.api.response.market;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OptionMarketDepthResponse {

    /**
     * "ch":"market.BTC-USDT-200807-C-9500.depth.step0",
     * "status":"ok",
     * "ts":1596786632886
     * "tick":{"asks":[[2288.35,159],[2517.18,107],[2768.9,132],[3045.79,152],[3350.36,184]],"bids":[[102,518],[101,1],[100,12],[69.33,2],[3.66,1],[3,12],[2,2]],"ch":"market.BTC-USDT-200807-C-9500.depth.step0","id":1596786631,"mrid":492958886,"ts":1596786631999,"version":1596786631}
     */

    private String ch;
    private String status;
    private TickBean tick;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         * "ch":"market.BTC-USDT-200807-C-9500.depth.step0",
         * "id":1596786631,
         * "mrid":492958886,
         * "ts":1596786631999,
         * "version":1596786631
         * "asks":[[2288.35,159],[2517.18,107],[2768.9,132],[3045.79,152],[3350.36,184]]
         * "bids":[[102,518],[101,1],[100,12],[69.33,2],[3.66,1],[3,12],[2,2]]
         */

        private String ch;
        private Integer id;
        private Long mrid;
        private Long ts;
        private Integer version;
        private List<List<BigDecimal>> asks;
        private List<List<BigDecimal>> bids;

    }
}
