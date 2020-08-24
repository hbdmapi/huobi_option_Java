# **Installation**

  1.Install library into your Maven's local repository by running mvn install
  
  2.Add the following Maven dependency to your project's pom.xml:
  
    <dependency>
         <groupId>com.huobi.contract.api</groupId>
         <artifactId>huobi-contract-api</artifactId>
         <version>1.0.0</version>
    </dependency>
    
  3.Install Lombok Plugin  
    
    
    

# **Examples**  

  接口分为三大类：
  
     1.合约市场行情接口   --测试类放在包com.huobi.future.api.MarketAPITest 下
     2.合约资产接口      --测试类放在包com.huobi.future.api.AccountAPITest 下
     3.合约交易接口      --测试类放在包com.huobi.future.api.TradeAPITest 下
     
     
     
  调用举例：
  
  1.获取合约信息  
    
    测试类是com.huobi.future.api.MarketAPITest类的getContractContractInfo()方法
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("", "");
    @Test
    public void getContractContractInfo() {
        OptionContractInfoResponse result =
                huobiAPIService.getOptionContractInfo("btc", "usdt","", "");
        logger.debug("1.获取合约信息：{}", JSON.toJSONString(result));
    }
    
    
    
  2.获取用户账户信息   
    
    测试类是com.huobi.future.api.AccountAPITest类的getContractAccountInfo()方法 
    //填写申请的API-KEY 和 SECRET
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("API-KEY", "SECRET");
    @Test
    public void getOptionAccountInfo() {
        OptionAccountInfoResponse response = huobiAPIService.getOptionAccountInfo("btc","usdt");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
        response = huobiAPIService.getOptionAccountInfo("","");
        logger.debug("1.获取用户账户信息：{}", JSON.toJSONString(response));
    } 
    
  3.期权下单
    
    测试类是com.huobi.future.api.TradeAPITest类的getContractAccountInfo()方法
    //填写申请的API-KEY 和 SECRET   
    HuobiAPIServiceImpl huobiAPIService = new HuobiAPIServiceImpl("API-KEY", "SECRET");
    @Test
    public void contractOrderRequest() {

        OptionOrderRequest request = OptionOrderRequest.builder()
                .contractCode("BTC-USDT-200821-C-12250")
                .volume(2l)
                .price(BigDecimal.valueOf(100))
                .direction(DirectionEnum.BUY)
                .offset(OffsetEnum.OPEN)
                .orderPriceType("opponent")
                .build();
        OptionOrderResponse response =
                huobiAPIService.optionOrderRequest(request);
        logger.debug("1合约下单：{}", JSON.toJSONString(response));
    }
     
     
     
      

  
  
    