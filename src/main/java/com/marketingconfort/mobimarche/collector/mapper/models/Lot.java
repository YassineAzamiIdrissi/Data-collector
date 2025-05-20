package com.marketingconfort.mobimarche.collector.mapper.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.marketingconfort.mobimarche.collector.dto.ValeurDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Lot {
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String lieuPrincipal;
    @Getter  @Setter
    private ValeurDTO valeur;
}