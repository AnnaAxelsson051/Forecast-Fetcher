package com.example.anna.model;

import java.time.LocalDateTime;

public class Weather {

    private String origin;
    private double temperature;
    private double humidity;
    private String timeStamp;

    public Weather(){

    }

    public Weather(String origin, double temperature, double humidity, String timeStamp) {
        this.origin = origin;
        this.temperature = temperature;
        this.humidity = humidity;
        this.timeStamp = timeStamp;
    }


    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "origin='" + origin + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", timeStamp=" + timeStamp +
                '}';
    }

}
