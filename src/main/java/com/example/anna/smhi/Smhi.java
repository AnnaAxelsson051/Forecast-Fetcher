
package com.example.anna.smhi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "approvedTime",
    "referenceTime",
    "geometry",
    "timeSeries"
})
public class Smhi {

    @JsonProperty("approvedTime")
    private String approvedTime;
    @JsonProperty("referenceTime")
    private String referenceTime;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("timeSeries")
    private List<TimeSeries> timeSeries;

    @JsonProperty("approvedTime")
    public String getApprovedTime() {
        return approvedTime;
    }

    @JsonProperty("approvedTime")
    public void setApprovedTime(String approvedTime) {
        this.approvedTime = approvedTime;
    }

    @JsonProperty("referenceTime")
    public String getReferenceTime() {
        return referenceTime;
    }

    @JsonProperty("referenceTime")
    public void setReferenceTime(String referenceTime) {
        this.referenceTime = referenceTime;
    }

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("timeSeries")
    public List<TimeSeries> getTimeSeries() {
        return timeSeries;
    }

    @JsonProperty("timeSeries")
    public void setTimeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
    }

}
