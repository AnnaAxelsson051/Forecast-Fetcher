package com.example.weatherwebservice.bussiness;

import com.example.weatherwebservice.data.MetWeather;
import com.example.weatherwebservice.data.SmhiWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    SmhiWeather smhiWeather;
    @Autowired
    MetWeather metWeather;

    public Weather getOptimalWeather(int time) {
        Weather smhi = smhiWeather.getWeather(time);
        Weather met = metWeather.getWeather(time);
        return null;
    }
}
