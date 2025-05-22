package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LotDTO {
    @JsonIgnore
    private Integer id;
    @JsonProperty("DESCRIPTION")
    private String description;
    @JsonProperty("LIEU_PRINCIPAL")
    private String lieuPrincipal;
    @JsonProperty("VALEUR")
    private ValeurDTO valeur;

}
