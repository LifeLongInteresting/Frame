package com.xforce.frame.is.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public void myExceptionHandler(){
        System.out.println("异常处理器");
    }
}
