package com.example.weatherwebservice.data;

import com.example.weatherwebservice.bussiness.Weather;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Repository
public class MetWeather {
    WebClient client = WebClient.create("");
    LocalDateTime localDateTime;

    //Modify "String" to Example klass från json
    public Weather getWeather(int time) {
        Mono<String> m = client
                .get()
                .uri("https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.3110&lon=18.0300")
                .retrieve()
                .bodyToMono(String.class);
        String weather = m.block();
        return null;
    }
}
