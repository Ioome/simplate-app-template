package com.farm.exception;

import com.farm.enums.ResponseStatus;
import lombok.Data;

/**
 * 自定义全局异常
 */
@Data
public class BusinessException extends RuntimeException {
    private Integer code=0;
    private String msg;

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public BusinessException(ResponseStatus resultCodeEnum) {
        super(resultCodeEnum.getResponseCode());
        this.code = Integer.valueOf(resultCodeEnum.getResponseCode());
        this.msg = resultCodeEnum.getDescription();
    }

}
