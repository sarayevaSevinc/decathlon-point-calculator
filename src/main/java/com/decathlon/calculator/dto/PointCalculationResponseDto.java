package com.decathlon.calculator.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PointCalculationResponseDto {
    private Integer result;
}
