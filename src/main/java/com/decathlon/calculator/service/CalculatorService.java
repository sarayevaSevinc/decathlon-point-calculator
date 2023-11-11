package com.decathlon.calculator.service;

import com.decathlon.calculator.dto.PointCalculationRequestDto;
import com.decathlon.calculator.dto.PointCalculationResponseDto;

public interface CalculatorService {
    PointCalculationResponseDto calculate(PointCalculationRequestDto request);
}
