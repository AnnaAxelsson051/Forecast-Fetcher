package com.example.anna.data;

import com.example.anna.business.Weather;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Repository
    public class SmhiWeather {
    WebClient client = WebClient.create("");

    //Modify "String" to Example klass från json
    public Weather getWeather(int time) {
        Mono<String> m = client
                .get()
                .uri("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json")
                .retrieve()
                .bodyToMono(String.class);
        String weather = m.block();

return null;
    }
}
