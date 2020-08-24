package com.huobi.api.service.account;

import com.alibaba.fastjson.JSON;
import com.huobi.api.constants.HuobiFutureAPIOptions;
import com.huobi.api.exception.ApiException;
import com.huobi.api.request.account.OptionFinancialRecordRequest;
import com.huobi.api.request.account.OptionMasterSubTransferRecordRequest;
import com.huobi.api.response.account.*;
import com.huobi.api.util.HbdmHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.system.ApplicationPid;

import java.util.HashMap;
import java.util.Map;

public class AccountAPIServiceImpl implements AccountAPIService {

    String api_key = ""; // huobi申请的apiKey
    String secret_key = ""; // huobi申请的secretKey
    String url_prex = "https://api.hbdm.com";


    public AccountAPIServiceImpl(String api_key, String secret_key) {
        this.api_key = api_key;
        this.secret_key = secret_key;
    }


    @Override
    public OptionAccountInfoResponse getOptionAccountInfo(String symbol,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_ACCOUNT_INFO, params);
            OptionAccountInfoResponse response = JSON.parseObject(body, OptionAccountInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionPositionInfoResponse getOptionPositionInfo(String symbol,String tradePartition,String contractCode) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            if(StringUtils.isNotEmpty(contractCode)){
                params.put("contract_code",contractCode);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_POSITION_INFO, params);
            OptionPositionInfoResponse response = JSON.parseObject(body, OptionPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionSubAccountListResponse getOptionSubAccountList(String symbol,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_SUB_ACCOUNT_LIST, params);
            OptionSubAccountListResponse response = JSON.parseObject(body, OptionSubAccountListResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionSubAccountInfoResponse getOptionSubAccountInfo(String symbol,String tradePartition ,Long subUid) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            params.put("sub_uid", subUid);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_SUB_ACCOUNT_INFO, params);
            OptionSubAccountInfoResponse response = JSON.parseObject(body, OptionSubAccountInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionSubPositionInfoResponse getOptionSubPositionInfo(String symbol,String tradePartition ,String contractCode , Long subUid) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            if(StringUtils.isNotEmpty(contractCode)){
                params.put("contract_code",contractCode);
            }
            params.put("sub_uid", subUid);
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_SUB_POSITION_INFO, params);
            OptionSubPositionInfoResponse response = JSON.parseObject(body, OptionSubPositionInfoResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionFinancialRecordResponse getOptionFinancialRecord(OptionFinancialRecordRequest request) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("symbol", request.getSymbol().toUpperCase());
            if (StringUtils.isNotEmpty(request.getType())) {
                params.put("type", request.getType());
            }
            if(StringUtils.isNotEmpty(request.getTradePartition())){
                params.put("trade_partition",request.getTradePartition().toUpperCase());
            }
            if (request.getCreateDate() != null) {
                params.put("create_date", request.getCreateDate());
            }
            if (request.getPageIndex() != null) {
                params.put("page_index", request.getPageIndex());
            }
            if (request.getPageSize() != null) {
                params.put("page_size", request.getPageSize());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_FINANCIAL_RECORD, params);
            OptionFinancialRecordResponse response = JSON.parseObject(body, OptionFinancialRecordResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionOrderLimitResponse getOptionOrderLimitResponse(String symbol, String orderPriceType,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            params.put("order_price_type", orderPriceType);
            if (StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_ORDER_LIMIT, params);
            OptionOrderLimitResponse response = JSON.parseObject(body, OptionOrderLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionFeeResponse getOptionFeeResponse(String symbol,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_FEE, params);
            OptionFeeResponse response = JSON.parseObject(body, OptionFeeResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionTransferLimitResponse getOptionTransferLimitResponse(String symbol,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition.toUpperCase());
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_TRANSFER_LIMIT, params);
            OptionTransferLimitResponse response = JSON.parseObject(body, OptionTransferLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionPositionLimitResponse getOptionPositionLimitResponse(String symbol,String tradePartition) {
        String body;
        try {
            Map<String, Object> params = new HashMap<>();
            if (StringUtils.isNotEmpty(symbol)) {
                params.put("symbol", symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_POSITION_LIMIT, params);
            OptionPositionLimitResponse response = JSON.parseObject(body, OptionPositionLimitResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }

        } catch (Exception e) {
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionAccountPositionInfoResponse getOptionAccountPositionInfoResponse(String symbol, String tradePartition) {
        String body;
        try{
            Map<String,Object> params=new HashMap<>();
            if(StringUtils.isNotEmpty(symbol)){
                params.put("symbol",symbol.toUpperCase());
            }
            if(StringUtils.isNotEmpty(tradePartition)){
                params.put("trade_partition",tradePartition);
            }
            body=HbdmHttpClient.getInstance().doPost( api_key,secret_key,url_prex+HuobiFutureAPIOptions.OPTION_ACCOUNT_POSITION_INFO,params);
            OptionAccountPositionInfoResponse response=JSON.parseObject(body,OptionAccountPositionInfoResponse.class);
            if("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        }catch(Exception e){
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionMasterSubTransferResponse getOptionMasterSubTransferResponse(Long subUid, String symbol, String tradePartition, String amount, String type) {
        String body;
        try{
            Map<String,Object> params=new HashMap<>();
            params.put("sub_uid",subUid);
            params.put("symbol",symbol.toUpperCase());
            params.put("trade_partition",tradePartition.toUpperCase());
            params.put("amount",amount);
            params.put("type",type);
            body=HbdmHttpClient.getInstance().doPost(api_key,secret_key,url_prex+HuobiFutureAPIOptions.OPTION_MASTER_SUB_TRANSFER,params);
            OptionMasterSubTransferResponse response=JSON.parseObject(body,OptionMasterSubTransferResponse.class);
            if("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        }catch(Exception e){
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionMasterSubTransferRecordResponse getOptionMasterSubTransferRecordResponse(OptionMasterSubTransferRecordRequest request) {
        String body;
        try{
            Map<String,Object> params=new HashMap<>();
            params.put("symbol",request.getSymbol().toUpperCase());
            if(StringUtils.isNotEmpty(request.getTradePartition())){
                params.put("trade_partition",request.getTradePartition().toUpperCase());
            }
            if(StringUtils.isNotEmpty(request.getTransferType())){
                params.put("transfer_type",request.getTransferType());
            }
            params.put("create_date",request.getCreateDate());
            if(request.getPageIndex()!=null){
                params.put("page_index",request.getPageIndex());
            }
            if(request.getPageSize()!=null){
                params.put("page_size",request.getPageSize());
            }
            body=HbdmHttpClient.getInstance().doPost(api_key,secret_key,url_prex+HuobiFutureAPIOptions.OPTION_MASTER_SUB_TRANSFER_RECORD,params);
            OptionMasterSubTransferRecordResponse response=JSON.parseObject(body,OptionMasterSubTransferRecordResponse.class);
            if("ok".equalsIgnoreCase(response.getStatus())){
                return response;
            }
        }catch(Exception e){
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }

    @Override
    public OptionApiTradingStatusResponse getOptionApiTradingStatusResponse() {
        String body;
        Map<String,Object> params=new HashMap<>();
        try {
            body = HbdmHttpClient.getInstance().doGetKey(api_key,secret_key,url_prex + HuobiFutureAPIOptions.OPTION_API_TRADING_STATUS, params );
            OptionApiTradingStatusResponse response = JSON.parseObject(body, OptionApiTradingStatusResponse.class);
            if ("ok".equalsIgnoreCase(response.getStatus())) {
                return response;
            }
        }catch (Exception e){
            throw new ApiException(e);
        }
        throw new ApiException(body);
    }


}
