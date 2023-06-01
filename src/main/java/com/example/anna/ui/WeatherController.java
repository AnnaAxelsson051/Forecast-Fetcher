package com.example.anna.ui;

import com.example.anna.business.WeatherService;
import com.example.anna.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/optimalweather")
    public String getOptimalWeather(Model model){
        Weather weather = weatherService.getOptimalWeather();
        String timeStamp = weather.getTimeStamp();
        String newTimeStamp = timeStamp.substring(11, 16);
        weather.setTimeStamp(newTimeStamp);
        model.addAttribute("weather", weather);
        return "display_weather";
    }
}
