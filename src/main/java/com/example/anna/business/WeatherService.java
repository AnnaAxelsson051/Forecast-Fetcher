package com.example.anna.business;

import com.example.anna.data.MetWeather;
import com.example.anna.data.SmhiWeather;
import com.example.anna.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    SmhiWeather smhiWeather;
    @Autowired
    MetWeather metWeather;

    public Weather getOptimalWeather() {
        Weather smhi = smhiWeather.getWeather();
        //Weather met = metWeather.getWeather();
        return smhi;
    }
}
