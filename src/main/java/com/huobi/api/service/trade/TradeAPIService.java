package com.huobi.api.service.trade;

import com.huobi.api.request.trade.*;
import com.huobi.api.response.trade.*;

public interface TradeAPIService {
    OptionOrderResponse optionOrderRequest(OptionOrderRequest request);//合约下单

    OptionBatchorderResponse optionBatchorderRequest(OptionBatchorderRequest request);//合约批量下单

    OptionCancelResponse optionCancelRequest(OptionCancelRequest request);//撤销订单

    OptionCancelallResponse optionCancelallRequest(OptionCancelallRequest request);//全部撤单

    OptionOrderInfoResponse optionOrderInfoRequest(OptionOrderInfoRequest request);//获取合约订单信息


    OptionOrderDetailResponse optionOrderDetailRequest(OptionOrderDetailRequest request);//获取订单明细信息

    OptionOpenordersResponse optionOpenordersRequest(OptionOpenordersRequest request);//获取合约当前未成交委托

    OptionHisordersResponse optionHisordersRequest(OptionHisordersRequest request);//获取合约历史委托

    OptionMatchresultsResponse optionMatchresultsRequest(OptionMatchresultsRequest request);//获取历史成交记录

    OptionLightningClosePositionResponse optionLightningClosePositionRequest(OptionLightningClosePositionRequest request);//闪电平仓下单

    OptionTriggerOrderResponse optionTriggerOrderResponse(OptionTriggerOrderRequest request);//计划委托下单

    OptionTriggerCancelResponse optionTriggerCancelResponse(OptionTriggerCancelRequest request);//计划委托撤单

    OptionTriggerCancelallResponse optionTriggerCancelallResponse(OptionTriggerCancelallRequest request);//计划委托合部撤单

    OptionTriggerOpenordersResponse optionTriggerOpenordersResponse(OptionTriggerOpenordersRequest request);//获取计划委托当前委托

    OptionTriggerHisordersResponse optionTriggerHisordersResponse(OptionTriggerHisordersRequest request);//获取计划委托历史委托

}
