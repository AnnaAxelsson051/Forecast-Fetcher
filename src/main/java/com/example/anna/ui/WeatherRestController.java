package com.example.anna.ui;

import com.example.anna.model.Weather;
import com.example.anna.business.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/rest/optimalweather")
    public Weather getOptimalWeather(){
        return weatherService.getOptimalWeather();
    }
}
