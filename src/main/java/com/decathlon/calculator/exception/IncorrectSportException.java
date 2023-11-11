package com.decathlon.calculator.exception;

import static com.decathlon.calculator.constant.Constants.VALIDATION_EXCEPTION_MESSAGE;

public class IncorrectSportException extends RuntimeException {

    public IncorrectSportException() {
        super(VALIDATION_EXCEPTION_MESSAGE);
    }

}
