package com.huobi.api.service.market;

import com.huobi.api.enums.TimePeriodTypeEnum;
import com.huobi.api.request.account.OptionMarketHistoryKlineRequest;
import com.huobi.api.response.market.*;

public interface MarketAPIService {
    OptionContractInfoResponse getOptionContractInfo(String symbol, String tradePartition , String contractType, String contractCode);

    OptionIndexResponse getOptionIndex(String symbol);

    OptionPriceLimitResponse getOptionPriceLimit(String contractCode);

    OptionMarketIndexResponse getOptionMarketIndex(String symbol,String tradePartition,String contractType,String optionRightType,String contractCode);

    OptionOpenInterestResponse getOptionOpenInterest(String symbol,String tradePartition ,String contractType, String contractCode);

    OptionDeliveryPriceResponse getOptionDeliveryPrice(String symbol,String tradePartition);

    OptionHisOpenInterestResponse getOptionHisOpenInterest(String symbol,String tradePartition ,String contractType, TimePeriodTypeEnum period, Integer size, Integer amountType,String optionRightType);

    OptionApiStateResponse getOptionApiState(String symbol,String tradePartition);//查询系统状态

    OptionMarketDepthResponse getOptionMarketDepth(String contractCode, String type);

    OptionMarketHistoryKlineResponse getOptionMarketHistoryKline(OptionMarketHistoryKlineRequest request);

    OptionMarketDetailMergedResponse getOptionMarketDetailMerged(String contractCode);

    OptionMarketTradeResponse getOptionMarketTrade(String contractCode);

    OptionMarketHistoryTradeResponse getOptionMarketHistoryTrade(String contractCode, Integer size);

/*
    ContractRiskInfoResponse getContractRiskInfo(String symbol);

    ContractInsuranceFundResponse getContractInsuranceFund(String symbol);

    ContractAdjustfactorResponse getContractAdjustfactor(String symbol);

    ContractEliteAccountRatioResponse getContractEliteAccountRatio(String symbol, String period);


    ContractElitePositionRatioResponse getContractElitePositionRatio(String symbol, String period);

    ContractLiquidationOrdersResponse getContractLiquidationOrders(String symbol, Integer tradeType, Integer createDate, Integer pageIndex, Integer pageSize);
*/
}
