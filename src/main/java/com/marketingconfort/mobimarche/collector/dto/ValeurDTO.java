package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class ValeurDTO {
    @JsonIgnore
    private Integer id;
    @JsonProperty("@DEVISE")
    private String devise;
    @JsonProperty("#text")
    private String text;

}
