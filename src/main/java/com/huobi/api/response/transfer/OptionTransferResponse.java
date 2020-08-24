package com.huobi.api.response.transfer;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OptionTransferResponse {

    /**
     * 参数名称	是否必须	类型	    描述	    取值范围
     * code	    true	long	响应码
     * success	true	boolean	状态	    true/false
     * message	true	string	响应消息
     * data	    true	string	错误码	划转流水ID
     */

    private String code;
    private Boolean success;
    private String message;
    private String data;

}
