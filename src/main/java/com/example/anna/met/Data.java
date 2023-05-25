
package com.example.anna.met;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instant",
    "next_12_hours",
    "next_1_hours",
    "next_6_hours"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("instant")
    private Instant instant;
    @JsonProperty("next_12_hours")
    private Next12Hours next12Hours;
    @JsonProperty("next_1_hours")
    private Next1Hours next1Hours;
    @JsonProperty("next_6_hours")
    private Next6Hours next6Hours;

    @JsonProperty("instant")
    public Instant getInstant() {
        return instant;
    }

    @JsonProperty("instant")
    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    @JsonProperty("next_12_hours")
    public Next12Hours getNext12Hours() {
        return next12Hours;
    }

    @JsonProperty("next_12_hours")
    public void setNext12Hours(Next12Hours next12Hours) {
        this.next12Hours = next12Hours;
    }

    @JsonProperty("next_1_hours")
    public Next1Hours getNext1Hours() {
        return next1Hours;
    }

    @JsonProperty("next_1_hours")
    public void setNext1Hours(Next1Hours next1Hours) {
        this.next1Hours = next1Hours;
    }

    @JsonProperty("next_6_hours")
    public Next6Hours getNext6Hours() {
        return next6Hours;
    }

    @JsonProperty("next_6_hours")
    public void setNext6Hours(Next6Hours next6Hours) {
        this.next6Hours = next6Hours;
    }

}
