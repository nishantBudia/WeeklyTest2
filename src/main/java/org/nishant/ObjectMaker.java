package org.nishant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ObjectMaker {
    @Bean
    @Primary
    public Car createCar(Integer numCyl, Integer cc, String manufacturer, Boolean turbo, Integer safetyRating, String name){
        return new Car(numCyl, cc, manufacturer, turbo, safetyRating, name);
    }
}
