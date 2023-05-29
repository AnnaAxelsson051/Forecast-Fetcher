package com.example.anna.business;

import com.example.anna.data.met.MetWeatherClient;
import com.example.anna.data.smhi.SmhiWeatherClient;
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
        Weather smhiWeatherForecast = smhiWeather.getWeather();
        Weather metWeatherForecast = metWeather.getWeather();

        if (smhiWeatherForecast.getTemperature() > metWeatherForecast.getTemperature()){
            return smhiWeatherForecast;
        }else if (metWeatherForecast.getTemperature() > smhiWeatherForecast.getTemperature() ){
            return metWeatherForecast;
        }
        return smhiWeatherForecast;
    }
}
