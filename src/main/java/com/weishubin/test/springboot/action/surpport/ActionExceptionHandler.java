package com.weishubin.test.springboot.action.surpport;

import com.weishubin.test.common.dto.folder.ErrMsg;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 自定义异常处理器
 */
@ControllerAdvice
public class ActionExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrMsg> handle(Exception ee) {
        System.out.println("=============");
        ee.printStackTrace();

        ErrMsg e = new ErrMsg();
        e.setCode(-204);
        e.setDesc("unknown exception");
        e.setProvider("folder");

        return new ResponseEntity<ErrMsg>(e, null, HttpStatus.valueOf(400));

    }

}
