package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TypeMarcheDTO {

    @JsonIgnore
    private Integer id;
    @JsonProperty("type_marche")
    private String typeMarche;
}
