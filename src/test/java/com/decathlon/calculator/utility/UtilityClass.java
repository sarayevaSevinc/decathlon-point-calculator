package com.decathlon.calculator.utility;

import com.decathlon.calculator.config.SportProperties.Parameter;
import com.decathlon.calculator.constant.Sport;
import com.decathlon.calculator.constant.SportType;
import com.decathlon.calculator.dto.PointCalculationRequestDto;
import java.util.HashMap;

public final class UtilityClass {

  public static PointCalculationRequestDto getDecathlonPointRequestDto() {
    PointCalculationRequestDto requestDto = new PointCalculationRequestDto();
    requestDto.setSport("LONG_JUMP");
    requestDto.setResult(776d);
    return requestDto;
  }

  public static HashMap<Sport, Parameter> getParameter() {
    var parameter = new Parameter();
    parameter.setA(0.14354);
    parameter.setB(220d);
    parameter.setC(1.4);
    parameter.setType(SportType.FIELD);
    return new HashMap<>() {{
      put(Sport.LONG_JUMP, parameter);
    }};
  }

}
