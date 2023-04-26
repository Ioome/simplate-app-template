package com.farm.exception;


import lombok.Data;

/**
 * @ClassName JxueException
 * @Description 统一异常
 * @Author liutaifa
 * @Date 2022/11/29 21:51
 * @Version 1.0
 */
@Data
public class FarmException extends Exception{
    private final Integer code;
    private final String message;

    public FarmException (Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public FarmException (FarmExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(),exceptionEnum.getMes());
    }
}
