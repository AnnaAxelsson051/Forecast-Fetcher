package com.example.anna.data.meteo;

import com.example.anna.meteo.Meteo;
import com.example.anna.model.Weather;
import com.example.anna.smhi.Smhi;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Repository
public class MeteoWeatherClient {

    WebClient client = WebClient.create("");

    public Weather getWeather() {
        Mono<Meteo> m = client
                .get()
                .uri("https://api.open-meteo.com/v1/forecast?latitude=59.3110&longitude=18.0300&current_weather=true&hourly=temperature_2m,relativehumidity_2m")
                .retrieve()
                .bodyToMono(Meteo.class);
        Meteo weather = m.block();

        String time = LocalDateTime.now().plusHours(24).toString().substring(0,14);
        int index = 0;
        for(int i = 0; i < weather.getHourly().getTime().size(); i++){
            if(time.equals(weather.getHourly().getTime().get(i).substring(0,14))){
                index = i;
                break;
            }
        }
        System.out.println(time);

        Double temp = weather.getHourly().getTemperature2m().get(index);
        int humidity = weather.getHourly().getRelativehumidity2m().get(index);
        String timeStamp = weather.getHourly().getTime().get(index);
        return new Weather("meteo", temp, humidity, timeStamp);

    }
    }

