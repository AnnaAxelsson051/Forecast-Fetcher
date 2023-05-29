package com.example.anna.data.smhi;

import com.example.anna.model.Weather;
import com.example.anna.smhi.Parameter;
import com.example.anna.smhi.Smhi;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public class SmhiWeatherClient {
    WebClient client = WebClient.create("");

    //Modify "String" to Example klass från json
    public Weather getWeather() {
        Mono<Smhi> m = client
                .get()
                .uri("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json")
                .retrieve()
                .bodyToMono(Smhi.class);
        Smhi weather = m.block();

        //delivers array of alla weather details 24 hrs forward
        //Temp
        List<Parameter> parameters = weather.getTimeSeries().get(25).getParameters();
        String timeStamp = weather.getTimeSeries().get(25).getValidTime();
        double temp = -1000;
        for (Parameter p : parameters){
            if(p.getName().equals("t")){
                temp = p.getValues().get(0);
            }
        }
        double humidity = -1000;
        for (Parameter p : parameters){
            if(p.getName().equals("r")){
                humidity = p.getValues().get(0);
            }
        }

        return new Weather("smhi", temp, humidity, timeStamp);
    }
}