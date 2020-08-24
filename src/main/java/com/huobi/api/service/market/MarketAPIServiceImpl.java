package com.huobi.api.service.market;

import com.alibaba.fastjson.JSON;
import com.huobi.api.constants.HuobiFutureAPIOptions;
import com.huobi.api.enums.TimePeriodTypeEnum;
import com.huobi.api.exception.ApiException;
import com.huobi.api.request.account.OptionMarketHistoryKlineRequest;
import com.huobi.api.response.market.*;
import com.huobi.api.util.HbdmHttpClient;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class MarketAPIServiceImpl implements MarketAPIService {

    String url_prex = "https://api.hbdm.com";


    @Override
    public OptionContractInfoResponse getOptionContractInfo(String symbol, String tradePartition , String contractType, String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol);
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            if (StringUtils.isNotEmpty(contractType)) {
                params.put("contract_type", contractType);
            }
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("contract_code", contractCode);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_CONTRACT_INFO, params);
            OptionContractInfoResponse response = JSON.parseObject(body, OptionContractInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);


    }

    @Override
    public OptionIndexResponse getOptionIndex(String symbol) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_INDEX, params);
            OptionIndexResponse response = JSON.parseObject(body, OptionIndexResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    @Override
    public OptionPriceLimitResponse getOptionPriceLimit(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_PRICE_LIMIT, params);
            OptionPriceLimitResponse response = JSON.parseObject(body, OptionPriceLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }


    public OptionMarketIndexResponse getOptionMarketIndex(String symbol,String tradePartition,String contractType,String optionRightType,String contractCode){
        String body;
        try{
            Map<String,Object> params= new HashMap<>();
            if(StringUtils.isNotEmpty(symbol)){
                params.put("symbol",symbol);
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            if(StringUtils.isNotEmpty(contractCode)){
                params.put("contract_code",contractCode);
            }
            if(StringUtils.isNotEmpty(contractType)){
                params.put("contract_type",contractType);
            }
            if(StringUtils.isNotEmpty(optionRightType)){
                params.put("option_right_type",optionRightType);
            }
            body=HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_MARKET_INDEX, params);
            OptionMarketIndexResponse response=JSON.parseObject(body,OptionMarketIndexResponse.class);
            if("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        }catch (Exception e){
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    /**
     * 获取当前可用合约总持仓量
     *
     */
    @Override
    public OptionOpenInterestResponse getOptionOpenInterest(String symbol,String tradePartition ,String contractType, String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if (StringUtils.isNotEmpty(contractType)) {
                params.put("contract_type", contractType);
            }
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_OPEN_INTEREST, params);
            OptionOpenInterestResponse response = JSON.parseObject(body, OptionOpenInterestResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    @Override
    public OptionDeliveryPriceResponse getOptionDeliveryPrice(String symbol,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_DELIVERY_PRICE, params);
            OptionDeliveryPriceResponse response = JSON.parseObject(body, OptionDeliveryPriceResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    @Override
    public OptionHisOpenInterestResponse getOptionHisOpenInterest(String symbol,String tradePartition ,String contractType, TimePeriodTypeEnum period, Integer size, Integer amountType,String optionRightType) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if (StringUtils.isNotEmpty(contractType)) {
                params.put("contract_type", contractType);
            }
            if (period != null) {
                params.put("period", period.getValue());
            }
            if (size != null) {
                params.put("size", size);
            }
            if (amountType != null) {
                params.put("amount_type", amountType);
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition.toUpperCase());
            }
            if (StringUtils.isNotEmpty(optionRightType)){
                params.put("option_right_type",optionRightType);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_HIS_OPEN_INTEREST, params);
            OptionHisOpenInterestResponse response = JSON.parseObject(body, OptionHisOpenInterestResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }


    /**
     * 查询系统状态
     *
     */
    @Override
    public OptionApiStateResponse getOptionApiState(String symbol ,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_API_STATE, params);
            OptionApiStateResponse response = JSON.parseObject(body, OptionApiStateResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }


    @Override
    public OptionMarketDepthResponse getOptionMarketDepth(String contractCode, String type) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            if (StringUtils.isNotEmpty(type)) {
                params.put("type", type);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_MARKET_DEPTH, params);
            OptionMarketDepthResponse response = JSON.parseObject(body, OptionMarketDepthResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    /**
     * 获取K线数据
     */
    @Override
    public OptionMarketHistoryKlineResponse getOptionMarketHistoryKline(OptionMarketHistoryKlineRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("contract_code", request.getContractCode().toUpperCase());
            params.put("period", request.getPeriod());
            if (request.getSize()!=null) {
                params.put("size", request.getSize());
            }
            if (request.getFrom() !=null && request.getTo() != null){
                params.put("from",request.getFrom());
                params.put("to",request.getTo());
            }

            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_MARKET_HISTORY_KLINE, params);
            OptionMarketHistoryKlineResponse response = JSON.parseObject(body, OptionMarketHistoryKlineResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    @Override
    public OptionMarketDetailMergedResponse getOptionMarketDetailMerged(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_MARKET_DETAIL_MERGED, params);
            OptionMarketDetailMergedResponse response = JSON.parseObject(body, OptionMarketDetailMergedResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    @Override
    public OptionMarketTradeResponse getOptionMarketTrade(String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_MARKET_TRADE, params);
            OptionMarketTradeResponse response = JSON.parseObject(body, OptionMarketTradeResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

    @Override
    public OptionMarketHistoryTradeResponse getOptionMarketHistoryTrade(String contractCode, Integer size) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(contractCode)) {
                params.put("contract_code", contractCode.toUpperCase());
            }
            if (size != null) {
                params.put("size", size);
            }
            body = HbdmHttpClient.getInstance().doGet(url_prex + HuobiFutureAPIOptions.OPTION_MARKET_HISTORY_TRADE, params);
            OptionMarketHistoryTradeResponse response = JSON.parseObject(body, OptionMarketHistoryTradeResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        } catch (Exception e) {
            body = e.getMessage();
        }
        throw new ApiException(body);
    }

}