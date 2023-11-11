package com.decathlon.calculator.validation;

import com.decathlon.calculator.exception.IncorrectSportException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SportValidator implements ConstraintValidator<ValidSport, String> {

  private List<String> acceptedValues;

  @Override
  public void initialize(ValidSport constraintAnnotation) {
    acceptedValues = Stream.of(constraintAnnotation.enumClass().getEnumConstants())
        .map(Enum::name)
        .collect(Collectors.toList());
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (!acceptedValues.contains(value)) {
      throw new IncorrectSportException();
    }

    return true;
  }

}
