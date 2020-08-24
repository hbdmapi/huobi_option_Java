package com.huobi.wss.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class MarketDepthSubResponse {

    /**
     * "ch":"market.BTC-USDT-200814-C-9500.depth.step0",
     * "ts":1597110509994,
     * "tick":{"mrid":632476550,"id":1597110509,"bids":[[102,69]],"asks":[[143,1],[1392.66,1],[1403.94,1],[4122.21,106],[4244.54,112],[4372.98,152],[4507.72,160],[4648.89,122]],"ts":1597110509988,"version":1597110509,"ch":"market.BTC-USDT-200814-C-9500.depth.step0"}
     */

    private String ch;
    private Long ts;
    private TickBean tick;

    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         * "ts":1597110509988,
         * "version":1597110509,
         * "ch":"market.BTC-USDT-200814-C-9500.depth.step0"
         * "mrid":632476550,
         * "id":1597110509,
         * "bids":[[102,69]]
         * "asks":[[143,1],[1392.66,1],[1403.94,1],[4122.21,106],[4244.54,112],[4372.98,152],[4507.72,160],[4648.89,122]]
         */

        private Long mrid;
        private Long id;
        private Long ts;
        private Long version;
        private String ch;
        private List<List<BigDecimal>> bids;
        private List<List<BigDecimal>> asks;

    }
}
