package com.decathlon.calculator.controller;

import com.decathlon.calculator.constant.Sport;
import com.decathlon.calculator.dto.PointCalculationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/ui")
@RequiredArgsConstructor
public class UiController {

  @GetMapping("/index")
  public ModelAndView getMainPage() {
    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("types", Sport.values());
    modelAndView.addObject("pointCalculationRequest", new PointCalculationRequestDto());
    return modelAndView;
  }
}
