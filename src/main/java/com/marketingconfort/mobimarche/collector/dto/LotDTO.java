package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class LotDTO {

    @JsonProperty("DESCRIPTION")
    private String description;

    @JsonProperty("LIEU_PRINCIPAL")
    private String lieuPrincipal;

    @JsonProperty("VALEUR")
    private ValeurDTO valeur;
}