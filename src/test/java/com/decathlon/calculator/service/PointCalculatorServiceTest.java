package com.decathlon.calculator.service;

import com.decathlon.calculator.config.SportProperties;
import com.decathlon.calculator.dto.PointCalculationRequestDto;
import com.decathlon.calculator.dto.PointCalculationResponseDto;
import com.decathlon.calculator.service.impl.CalculatorServiceImpl;
import com.decathlon.calculator.utility.UtilityClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PointCalculatorServiceTest {

  @Mock
  private SportProperties sportProperties;
  @InjectMocks
  private CalculatorServiceImpl calculatorService;

  @Test
  void whenCalculateDecathlonPoints_correctInput_correctCalculation() {
    // arrange
    PointCalculationRequestDto requestDto = UtilityClass.getDecathlonPointRequestDto();
    Mockito.when(sportProperties.getParameters()).thenReturn(UtilityClass.getParameter());

    // act
    PointCalculationResponseDto pointCalculationResponseDto =
        calculatorService.calculate(requestDto);

    // assert
    Assertions.assertNotNull(pointCalculationResponseDto);
    Assertions.assertEquals(1000, pointCalculationResponseDto.getResult());
  }

}
