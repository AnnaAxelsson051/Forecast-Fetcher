package com.example.anna.business;

import com.example.anna.data.MetWeatherClient;
import com.example.anna.data.SmhiWeatherClient;
import com.example.anna.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    SmhiWeatherClient smhiWeather;
    @Autowired
    MetWeatherClient metWeather;

    public Weather getOptimalWeather() {
        Weather smhiWeatherForeCast = smhiWeather.getWeather();
        //Weather metWeatherForeCast = metWeather.getWeather();

        if (smhiWeatherForeCast.getTemperature() > metWeatherForeCast.getTemperature()){
            return smhiWeatherForeCast;
        }else if (metWeatherForeCast.getTemperature() > smhiWeatherForeCast.getTemperature() ){
            return metWeatherForeCast;
        }
        return smhiWeatherForeCast;
    }
}
