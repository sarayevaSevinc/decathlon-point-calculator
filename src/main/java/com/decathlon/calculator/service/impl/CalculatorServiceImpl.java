package com.decathlon.calculator.service.impl;

import com.decathlon.calculator.config.SportProperties;
import com.decathlon.calculator.config.SportProperties.Parameter;
import com.decathlon.calculator.constant.Sport;
import com.decathlon.calculator.dto.PointCalculationRequestDto;
import com.decathlon.calculator.dto.PointCalculationResponseDto;
import com.decathlon.calculator.service.CalculatorService;
import com.decathlon.calculator.util.PointCalculationUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CalculatorServiceImpl implements CalculatorService {

  private final SportProperties sportProperties;

  @Override
  public PointCalculationResponseDto calculate(PointCalculationRequestDto request) {
    log.info("point calculation request: {}", request);

    Parameter parameter = sportProperties.getParameters().
        get(Sport.valueOf(request.getSport()));

    Integer point = PointCalculationUtil.calculatePoint(parameter, request.getResult());

    PointCalculationResponseDto response = PointCalculationResponseDto.builder()
        .result(point)
        .build();

    log.info("point calculation response: {}", response);
    return response;
  }

}
