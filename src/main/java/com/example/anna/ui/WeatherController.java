package com.example.anna.ui;

import com.example.anna.business.WeatherService;
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

    //Fetching what time user selected redirecting to display site
    @GetMapping("/optimalweather")
    public String getOptimalWeather(Model model){
        return "display_weather";
    }

    @PostMapping("/optimalweather")
    public String getOptimalWeather(@RequestParam int time, Model model){
        model.addAttribute("weather", weatherService.getOptimalWeather(time));
        return "display_weather";
    }
}
