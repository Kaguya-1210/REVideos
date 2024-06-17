package com.github.kaguya1210.revideos_server.base.exception;

import com.github.kaguya1210.revideos_server.base.response.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public JsonResult doHandleServiceException(ServiceException ex) {
        log.error("RuntimeException: " + ex.getStatusCode().getMsg());
        return new JsonResult(ex.getStatusCode());
    }

}
