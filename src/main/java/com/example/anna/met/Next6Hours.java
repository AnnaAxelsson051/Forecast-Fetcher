
package com.example.anna.met;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "summary",
    "details"
})
@Generated("jsonschema2pojo")
public class Next6Hours {

    @JsonProperty("summary")
    private Summary__2 summary;
    @JsonProperty("details")
    private Details__2 details;

    @JsonProperty("summary")
    public Summary__2 getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary__2 summary) {
        this.summary = summary;
    }

    @JsonProperty("details")
    public Details__2 getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(Details__2 details) {
        this.details = details;
    }

}
