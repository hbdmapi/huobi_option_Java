package com.huobi.future.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.request.account.OptionFinancialRecordRequest;
import com.huobi.api.request.account.OptionMasterSubTransferRecordRequest;
import com.huobi.api.response.account.*;
import com.huobi.api.service.account.AccountAPIServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.JVM)
public class AccountAPITest implements BaseTest {


    AccountAPIServiceImpl huobiAPIService = new AccountAPIServiceImpl("", "");

    @Test
    public void getOptionAccountInfo() {
        OptionAccountInfoResponse response = huobiAPIService.getOptionAccountInfo("btc","usdt");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
        response = huobiAPIService.getOptionAccountInfo("","");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionPositionInfo() {
        OptionPositionInfoResponse response = huobiAPIService.getOptionPositionInfo("btc","usdt","");
        logger.debug("2.获取用户持仓信息：{}", JSON.toJSONString(response));

        response = huobiAPIService.getOptionPositionInfo("","","");
        logger.debug("2.获取用户持仓信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionSubAccountList() {
        OptionSubAccountListResponse response = huobiAPIService.getOptionSubAccountList("btc","usdt");
        logger.debug("3.查询母账户下所有子账户资产信息：{}", JSON.toJSONString(response));

        response = huobiAPIService.getOptionSubAccountList("","");
        logger.debug("3.查询母账户下所有子账户资产信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionSubAccountInfo() {
        OptionSubAccountInfoResponse response = huobiAPIService.getOptionSubAccountInfo("", "",	1l);
        logger.debug("4.查询单个子账户资产信息：{}", JSON.toJSONString(response));
        logger.debug(response.getStatus());
    }

    @Test
    public void getOptionSubPositionInfo() {
        OptionSubPositionInfoResponse response = huobiAPIService.getOptionSubPositionInfo("btc", "usdt","" ,1l);
        logger.debug("5.查询单个子账户持仓信息：{}", JSON.toJSONString(response));
        logger.debug(response.getStatus());
    }


    @Test
    public void getOptionFinancialRecord() {
        OptionFinancialRecordRequest request = OptionFinancialRecordRequest.builder()
                .symbol("BTC")
                .tradePartition("USDT")
                //.type("2")
                .build();
        OptionFinancialRecordResponse response = huobiAPIService.getOptionFinancialRecord(request);
        logger.debug("6.查询用户财务记录：{}", JSON.toJSONString(response));
    }


    @Test
    public void getOptionOrderLimitResponse() {
        OptionOrderLimitResponse response = huobiAPIService.getOptionOrderLimitResponse("btc", "limit","usdt");
        logger.debug("7.查询用户当前的下单量限制：{}", JSON.toJSONString(response));
        response = huobiAPIService.getOptionOrderLimitResponse("", "limit","");
        logger.debug("7.查询用户当前的下单量限制：{}", JSON.toJSONString(response));
    }


    @Test
    public void getOptionFeeResponse() {
        OptionFeeResponse response = huobiAPIService.getOptionFeeResponse("ETH","USDT");
        logger.debug("8.查询用户当前的手续费费率：{}", JSON.toJSONString(response));
        response = huobiAPIService.getOptionFeeResponse("","");
        logger.debug("8.查询用户当前的手续费费率：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionTransferLimitResponse() {
        OptionTransferLimitResponse response = huobiAPIService.getOptionTransferLimitResponse("btc","usdt");
        logger.debug("9.查询用户当前的划转限制：{}", JSON.toJSONString(response));
        response = huobiAPIService.getOptionTransferLimitResponse("","");
        logger.debug("9.查询用户当前的划转限制：{}", JSON.toJSONString(response));
    }


    @Test
    public void getOptionPositionLimitResponse() {
        OptionPositionLimitResponse response = huobiAPIService.getOptionPositionLimitResponse("btc","usdt");
        logger.debug("10.用户持仓量限制的查询：{}", JSON.toJSONString(response));

        response = huobiAPIService.getOptionPositionLimitResponse("","");
        logger.debug("10.用户持仓量限制的查询：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionAccountPositionInfoResponse(){
        OptionAccountPositionInfoResponse response=huobiAPIService.getOptionAccountPositionInfoResponse("btc","usdt");
        logger.debug("11.获取用户资产和持仓信息：{}", JSON.toJSONString(response));

        response = huobiAPIService.getOptionAccountPositionInfoResponse("btc","");
        logger.debug("11.获取用户资产和持仓信息：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionMasterSubTransferResponse(){
        OptionMasterSubTransferResponse response=
                huobiAPIService.getOptionMasterSubTransferResponse(1l,"btc","usdt","1","sub_to_master");
        logger.debug("12.母子账户划转：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionMasterSubTransferRecordResponse(){
        OptionMasterSubTransferRecordRequest request = OptionMasterSubTransferRecordRequest.builder()
                .symbol("BTC")
                .tradePartition("usdt")
                //.transferType("")
                .createDate(10)
                .pageIndex(1)
                .pageSize(20)
                .build();
        OptionMasterSubTransferRecordResponse response=huobiAPIService.getOptionMasterSubTransferRecordResponse(request);
        logger.debug("13.获取母账户下的所有母子账户划转记录：{}", JSON.toJSONString(response));
    }

    @Test
    public void getOptionApiTradingStatusResponse(){
        OptionApiTradingStatusResponse response=huobiAPIService.getOptionApiTradingStatusResponse();
        logger.debug("14.获取用户API指标禁用信息：{}", JSON.toJSONString(response));
    }

}
