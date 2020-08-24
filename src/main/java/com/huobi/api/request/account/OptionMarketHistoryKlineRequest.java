package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class OptionMarketHistoryKlineRequest {
    private String contractCode;
    private String period;
    private Integer size;
    private Integer from;
    private Integer to;
}
