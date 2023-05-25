
package com.example.anna.met;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "timeseries"
})
public class Properties {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("timeseries")
    private List<Timeseries> timeseries;

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("timeseries")
    public List<Timeseries> getTimeseries() {
        return timeseries;
    }

    @JsonProperty("timeseries")
    public void setTimeseries(List<Timeseries> timeseries) {
        this.timeseries = timeseries;
    }

}
