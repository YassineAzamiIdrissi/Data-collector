package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class ValeurDTO {
    @JsonProperty("@DEVISE")
    private String devise;
    @JsonProperty("#text")
    private String text;

}
