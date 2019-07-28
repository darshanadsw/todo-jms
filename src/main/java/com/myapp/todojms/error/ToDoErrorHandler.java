package com.myapp.todojms.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ErrorHandler;

@Slf4j
public class ToDoErrorHandler implements ErrorHandler {
    @Override
    public void handleError(Throwable throwable) {
        log.warn("ToDo error...");
        log.error(throwable.getCause().getMessage());
    }
}
