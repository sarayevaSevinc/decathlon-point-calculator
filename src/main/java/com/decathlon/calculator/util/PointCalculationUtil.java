package com.decathlon.calculator.util;

import com.decathlon.calculator.config.SportProperties.Parameter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PointCalculationUtil {

    public static Integer calculatePoint(Parameter parameter,
                                         double result) {
        return switch (parameter.getType()) {
            case FIELD -> (int) Math.floor(
                    parameter.getA() * Math.pow(result - parameter.getB(), parameter.getC()));
            case TRACK -> (int) Math.floor(
                    parameter.getA() * Math.pow(parameter.getB() - result, parameter.getC()));
        };
    }

}
