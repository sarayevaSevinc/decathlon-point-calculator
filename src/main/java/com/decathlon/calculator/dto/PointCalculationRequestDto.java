package com.decathlon.calculator.dto;

import com.decathlon.calculator.constant.Sport;
import com.decathlon.calculator.validation.ValidSport;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PointCalculationRequestDto {

  @ValidSport(enumClass = Sport.class)
  private String sport;

  @NotNull
  @DecimalMin(value = "0.0")
  private Double result;

}
