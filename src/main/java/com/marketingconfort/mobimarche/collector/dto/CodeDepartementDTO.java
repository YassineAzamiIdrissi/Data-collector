package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CodeDepartementDTO {
    @JsonIgnore
    private Integer id;

    @JsonProperty("code_departement")
    private String codeDepartement;
}
