package com.huobi.api.service.transfer;

import com.alibaba.fastjson.JSON;
import com.huobi.api.constants.HuobiFutureAPIOptions;
import com.huobi.api.exception.ApiException;
import com.huobi.api.request.transfer.OptionTransferRequest;
import com.huobi.api.response.transfer.OptionTransferResponse;
import com.huobi.api.util.HbdmHttpClient;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TransferApiServiceImpl implements TransferApiService {

    String api_key = ""; // huobi申请的apiKey
    String secret_key = ""; // huobi申请的secretKey
    String url_prex = "https://api.huobi.de.pro";

    public TransferApiServiceImpl(String api_key, String secret_key) {
        this.api_key = api_key;
        this.secret_key = secret_key;
    }


    /**

     */
    @Override
    public OptionTransferResponse transfer(OptionTransferRequest request) {
        String body = "";
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("from", request.getFrom());
            params.put("to", request.getTo());
            params.put("tradePartition", request.getTradePartition());
            params.put("currency",request.getCurrency());
            params.put("amount",request.getAmount());
            body = HbdmHttpClient.getInstance().doPost(api_key, secret_key, url_prex + HuobiFutureAPIOptions.OPTION_TRANSFER, params);
            OptionTransferResponse response = JSON.parseObject(body, OptionTransferResponse.class);
            return response;

        } catch (Exception e) {
            throw new ApiException(e);
        }
    }
}
