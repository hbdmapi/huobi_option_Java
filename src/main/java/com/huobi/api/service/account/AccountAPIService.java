package com.huobi.api.service.account;


import com.huobi.api.request.account.OptionFinancialRecordRequest;
import com.huobi.api.request.account.OptionMasterSubTransferRecordRequest;
import com.huobi.api.response.account.*;

public interface AccountAPIService {


    //2获取合约资产接口开始
    OptionAccountInfoResponse getOptionAccountInfo(String symbol,String tradePartition);//获取用户账户信息

    OptionPositionInfoResponse getOptionPositionInfo(String symbol,String tradePartition,String contractCode);//获取用户持仓信息

    OptionSubAccountListResponse getOptionSubAccountList(String symbol,String tradePartition);//查询母账户下所有子账户资产信息

    OptionSubAccountInfoResponse getOptionSubAccountInfo(String symbol,String tradePartition ,Long subUid);//查询单个子账户资产信息

    OptionSubPositionInfoResponse getOptionSubPositionInfo(String symbol ,String tradePartition ,String contractCode ,Long subUid);//查询单个子账户持仓信息

    OptionFinancialRecordResponse getOptionFinancialRecord(OptionFinancialRecordRequest request);//查询用户财务记录

    OptionOrderLimitResponse getOptionOrderLimitResponse(String symbol, String orderPriceType,String tradePartition);//查询用户当前的下单量限制

    OptionFeeResponse getOptionFeeResponse(String symbol,String tradePartition);//查询用户当前的手续费费率

    OptionTransferLimitResponse getOptionTransferLimitResponse(String symbol,String tradePartition);//查询用户当前的划转限制

    OptionPositionLimitResponse getOptionPositionLimitResponse(String symbol,String tradePartition);//用户持仓量限制的查询

    OptionAccountPositionInfoResponse getOptionAccountPositionInfoResponse(String symbol,String tradePartition);//获取用户资产和持仓信息

    OptionMasterSubTransferResponse getOptionMasterSubTransferResponse(Long subUid,String symbol,String tradePartition,String amount,String type);//母子账户划转

    OptionMasterSubTransferRecordResponse getOptionMasterSubTransferRecordResponse(OptionMasterSubTransferRecordRequest request);//获取母账户下的所有母子账户划转记录

    OptionApiTradingStatusResponse getOptionApiTradingStatusResponse();//获取用户API指标禁用信息

    OptionBalanceValuationResponse getOptionBalanceValuation(String ValuationAsset);

}
