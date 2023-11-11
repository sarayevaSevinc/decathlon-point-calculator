package com.decathlon.calculator.exception;

import com.decathlon.calculator.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = IncorrectSportException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    protected ErrorResponseDto handleIncorrectSportTypeException(
            IncorrectSportException ex) {
        return ErrorResponseDto.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();
    }

}
