package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
public class TypeAvisDTO {

    @JsonIgnore
    private Integer id;
    @JsonProperty("type_avis")
    private String typeAvis;
}
