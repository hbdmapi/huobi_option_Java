package com.huobi.future.api;

import com.alibaba.fastjson.JSON;
import com.huobi.api.request.transfer.OptionTransferRequest;
import com.huobi.api.response.transfer.OptionTransferResponse;
import com.huobi.api.service.transfer.TransferApiServiceImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;

/**
 * 现货-期权划转接口
 */
@FixMethodOrder(MethodSorters.JVM)
public class TransferAPITest implements BaseTest {


    TransferApiServiceImpl transferApiService = new TransferApiServiceImpl("", "");

    @Test
    public void transfer() {
        /**
         * 参数名称	        是否必须	类型	    描述	                                        取值范围
         * from	            true	string	来源业务线账户，取值：spot(币币)、option(期权)	e.g. spot
         * to	            true	string	目标业务线账户，取值：spot(币币)、option(期权)	e.g. option
         * tradePartition	true	string	交易区（目前只有USDT区）	                    e.g. usdt
         * currency	        true	string	币种,支持大小写	                            e.g. btc
         * amount	        true	Decimal	划转金额
         * */

        OptionTransferRequest request = OptionTransferRequest.builder()
                .from("spot")
                .to("option")
                .tradePartition("usdt")
                .currency("btc")
                .amount(BigDecimal.valueOf(0.100))
                .build();
        OptionTransferResponse response = transferApiService.transfer(request);
        logger.debug("1.现货-合约账户间进行资金的划转：{}", JSON.toJSONString(response));


    }


}
