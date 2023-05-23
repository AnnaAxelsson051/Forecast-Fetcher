package com.example.weatherwebservice.ui;

import com.example.weatherwebservice.bussiness.Weather;
import com.example.weatherwebservice.bussiness.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/rest/optimalweather/{time}")
    public Weather getOptimalWeather(@PathVariable int time){
        return weatherService.getOptimalWeather(time);
    }
}
