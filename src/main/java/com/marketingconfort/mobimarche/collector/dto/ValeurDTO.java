package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ValeurDTO {
    @JsonProperty("@DEVISE")
    private String devise;
    @JsonProperty("#text")
    private String text;
}