package com.github.kaguya1210.revideos_server.base.exception;


import com.github.kaguya1210.revideos_server.base.response.StatusCode;
import lombok.Getter;

/* 自定义的业务层异常类 */
public class ServiceException extends RuntimeException{
    @Getter
    private StatusCode statusCode;

    //Alt+Insert 一直回车 生成该类的构造函数
    public ServiceException(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
