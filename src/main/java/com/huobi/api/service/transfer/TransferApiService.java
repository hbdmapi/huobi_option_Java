package com.huobi.api.service.transfer;

import com.huobi.api.request.transfer.OptionTransferRequest;
import com.huobi.api.response.transfer.OptionTransferResponse;

import java.math.BigDecimal;

public interface TransferApiService {

    OptionTransferResponse transfer(OptionTransferRequest request);
}
