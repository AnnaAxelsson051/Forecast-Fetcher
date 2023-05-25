
package com.example.anna.met;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "symbol_code"
})
@Generated("jsonschema2pojo")
public class Summary__2 {

    @JsonProperty("symbol_code")
    private String symbolCode;

    @JsonProperty("symbol_code")
    public String getSymbolCode() {
        return symbolCode;
    }

    @JsonProperty("symbol_code")
    public void setSymbolCode(String symbolCode) {
        this.symbolCode = symbolCode;
    }

}
