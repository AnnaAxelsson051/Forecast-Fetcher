package com.example.anna.data.met;

import com.example.anna.met.Data;
import com.example.anna.met.Details;
import com.example.anna.met.Met;
import com.example.anna.met.Timeseries;
import com.example.anna.model.Weather;
import com.example.anna.smhi.Parameter;
import com.example.anna.smhi.TimeSeries;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public class MetWeatherClient {
    WebClient client = WebClient.create("");

    public Weather getWeather() {
        Mono<Met> m = client
                .get()
                .uri("https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.3110&lon=18.0300")
                .retrieve()
                .bodyToMono(Met.class);
        Met weather = m.block();

        Data data = weather.getProperties().getTimeseries().get(26).getData();
        String timeStamp = weather.getProperties().getTimeseries().get(26).getTime();
        Double temp = data.getInstant().getDetails().getAirTemperature();
        Double humidity = data.getInstant().getDetails().getRelativeHumidity();

        return new Weather("Met", temp, humidity , timeStamp);
    }

}
