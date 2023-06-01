package com.example.anna.business;

import com.example.anna.data.met.MetWeatherClient;
import com.example.anna.data.meteo.MeteoWeatherClient;
import com.example.anna.data.smhi.SmhiWeatherClient;
import com.example.anna.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    SmhiWeatherClient smhiWeatherClient;
    @Autowired
    MetWeatherClient metWeatherClient;
    @Autowired
    MeteoWeatherClient meteoWeatherClient;

    public Weather getOptimalWeather() {
        Weather smhiWeatherForecast = smhiWeatherClient.getWeather();
        Weather metWeatherForecast = metWeatherClient.getWeather();
        Weather meteoWeatherForecast = meteoWeatherClient.getWeather();

        if (smhiWeatherForecast.getTemperature() > metWeatherForecast.getTemperature() && smhiWeatherForecast.getTemperature() > meteoWeatherForecast.getTemperature()){
            return smhiWeatherForecast;
        }else if (metWeatherForecast.getTemperature() > smhiWeatherForecast.getTemperature() && metWeatherForecast.getTemperature() > meteoWeatherForecast.getTemperature()){
            return metWeatherForecast;
        } else{
            return meteoWeatherForecast;
        }
    }
}
