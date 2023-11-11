package com.decathlon.calculator.controller;

import com.decathlon.calculator.dto.PointCalculationRequestDto;
import com.decathlon.calculator.service.CalculatorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/point-calculations")
@RequiredArgsConstructor
public class CalculatorController {

  private final CalculatorService service;

  @PostMapping
  public ModelAndView calculate(ModelAndView model,
      @Valid PointCalculationRequestDto request) {
    model.setViewName("result-page");
    model.addObject("result", service.calculate(request));
    return model;
  }
}
