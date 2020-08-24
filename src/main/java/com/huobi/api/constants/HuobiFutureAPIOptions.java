package com.huobi.api.constants;

public class HuobiFutureAPIOptions {

    //合约市场行情接口
    public static final String OPTION_CONTRACT_INFO = "/option-api/v1/option_contract_info"; // 1.获取合约信息
    public static final String OPTION_INDEX = "/option-api/v1/option_index"; // 2.获取合约指数信息
    public static final String OPTION_PRICE_LIMIT = "/option-api/v1/option_price_limit"; // 3.获取合约最高限价和最低限价
    public static final String OPTION_MARKET_INDEX = "/option-api/v1/option_market_index";//4.查询合约市场指标
    public static final String OPTION_OPEN_INTEREST = "/option-api/v1/option_open_interest";// 5.获取当前可用合约总持仓量
    public static final String OPTION_DELIVERY_PRICE = "/option-api/v1/option_delivery_price"; // 6.获取预估交割价

    public static final String OPTION_HIS_OPEN_INTEREST = "/option-api/v1/option_his_open_interest"; // 7.平台持仓量的查询
    public static final String OPTION_API_STATE = "/option-api/v1/option_api_state"; // 8.查询系统状态
    public static final String OPTION_MARKET_DEPTH = "/option-ex/market/depth";// 9.获取行情深度数据
    public static final String OPTION_MARKET_HISTORY_KLINE = "/option-ex/market/history/kline";// 10.获取K线数据
    public static final String OPTION_MARKET_DETAIL_MERGED = "/option-ex/market/detail/merged"; // 11.获取聚合行情

    public static final String OPTION_MARKET_TRADE = "/option-ex/market/trade";// 12.获取市场最近成交记录
    public static final String OPTION_MARKET_HISTORY_TRADE = "/option-ex/market/history/trade";  // 13.批量获取最近的交易记录


    //合约资产接口
    public static final String OPTION_ACCOUNT_INFO = "/option-api/v1/option_account_info"; // 1.获取用户账户信息
    public static final String OPTION_POSITION_INFO = "/option-api/v1/option_position_info"; // 2.获取用户持仓信息
    public static final String OPTION_SUB_ACCOUNT_LIST = "/option-api/v1/option_sub_account_list"; // 3.查询母账户下所有子账户资产信息
    public static final String OPTION_SUB_ACCOUNT_INFO = "/option-api/v1/option_sub_account_info"; // 4.查询单个子账户资产信息
    public static final String OPTION_SUB_POSITION_INFO = "/option-api/v1/option_sub_position_info"; // 5.查询单个子账户持仓信息

    public static final String OPTION_FINANCIAL_RECORD = "/option-api/v1/option_financial_record"; // 6.查询用户财务记录
    public static final String OPTION_ORDER_LIMIT = "/option-api/v1/option_order_limit"; // 7.查询用户当前的下单量限制
    public static final String OPTION_FEE = "/option-api/v1/option_fee"; // 8.查询用户当前的手续费费率
    public static final String OPTION_TRANSFER_LIMIT = "/option-api/v1/option_transfer_limit"; // 9.查询用户当前的划转限制
    public static final String OPTION_POSITION_LIMIT = "/option-api/v1/option_position_limit"; // 10.用户持仓量限制的查询

    public static final String OPTION_ACCOUNT_POSITION_INFO="/option-api/v1/option_account_position_info";//11.获取用户资产和持仓信息
    public static final String OPTION_MASTER_SUB_TRANSFER="/option-api/v1/option_master_sub_transfer";//母子账户划转
    public static final String OPTION_MASTER_SUB_TRANSFER_RECORD="/option-api/v1/option_master_sub_transfer_record";//获取母账户下的所有母子账户划转记录
    public static final String OPTION_API_TRADING_STATUS="/option-api/v1/option_api_trading_status";//获取用户API指标禁用信息

    //合约交易接口
    public static final String OPTION_ORDER = "/option-api/v1/option_order"; // 1.合约下单
    public static final String OPTION_BATCHORDER = "/option-api/v1/option_batchorder"; // 2.合约批量下单
    public static final String OPTION_CANCEL = "/option-api/v1/option_cancel"; // 3.撤销订单
    public static final String OPTION_CANCELALL = "/option-api/v1/option_cancelall"; // 4.全部撤单
    public static final String OPTION_ORDER_INFO = "/option-api/v1/option_order_info"; // 5.获取合约订单信息

    public static final String OPTION_ORDER_DETAIL = "/option-api/v1/option_order_detail"; // 6.获取订单明细信息
    public static final String OPTION_OPENORDERS = "/option-api/v1/option_openorders"; // 7.获取合约当前未成交委托
    public static final String OPTION_HISORDERS = "/option-api/v1/option_hisorders"; // 8.获取合约历史委托
    public static final String OPTION_MATCHRESULTS = "/option-api/v1/option_matchresults"; // 9.获取历史成交记录
    public static final String OPTION_LIGHTNING_CLOSE_POSITION = "/option-api/v1/option_lightning_close_position"; // 10.闪电平仓下单

    public static final String OPTION_TRIGGER_ORDER="/option-api/v1/option_trigger_order"; //计划委托下单
    public static final String OPTION_TRIGGER_CANCEL="/option-api/v1/option_trigger_cancel";//计划委托撤单
    public static final String OPTION_TRIGGER_CANCELALL="/option-api/v1/option_trigger_cancelall";//计划委托全部撤单
    public static final String OPTION_TRIGGER_OPENORDERS="/option-api/v1/option_trigger_openorders";////获取计划委托当前委托
    public static final String OPTION_TRIGGER_HISORDERS="/option-api/v1/option_trigger_hisorders";////获取计划委托历史委托

    //合约划转接口
    public static final String OPTION_TRANSFER = "/v2/account/transfer"; // 1.现货-期权账户间进行资金的划转


}
