package com.decathlon.calculator.config;

import com.decathlon.calculator.constant.Sport;
import com.decathlon.calculator.constant.SportType;
import java.util.HashMap;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sport")
@Data
public class SportProperties {

    private HashMap<Sport, Parameter> parameters = new HashMap<>();

    @Data
    public static class Parameter {
        private Double a;
        private Double b;
        private Double c;
        private SportType type;
    }

}
