
package com.example.anna.meteo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temperature",
    "windspeed",
    "winddirection",
    "weathercode",
    "is_day",
    "time"
})
public class CurrentWeather {

    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("windspeed")
    private Double windspeed;
    @JsonProperty("winddirection")
    private Double winddirection;
    @JsonProperty("weathercode")
    private Integer weathercode;
    @JsonProperty("is_day")
    private Integer isDay;
    @JsonProperty("time")
    private String time;

    @JsonProperty("temperature")
    public Double getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("windspeed")
    public Double getWindspeed() {
        return windspeed;
    }

    @JsonProperty("windspeed")
    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    @JsonProperty("winddirection")
    public Double getWinddirection() {
        return winddirection;
    }

    @JsonProperty("winddirection")
    public void setWinddirection(Double winddirection) {
        this.winddirection = winddirection;
    }

    @JsonProperty("weathercode")
    public Integer getWeathercode() {
        return weathercode;
    }

    @JsonProperty("weathercode")
    public void setWeathercode(Integer weathercode) {
        this.weathercode = weathercode;
    }

    @JsonProperty("is_day")
    public Integer getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

}
