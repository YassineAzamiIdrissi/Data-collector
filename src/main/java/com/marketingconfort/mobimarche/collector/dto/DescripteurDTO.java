package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;




@Data
public class DescripteurDTO {
    @JsonIgnore
    private Integer id;
    @JsonProperty("CODE")
    private String code;
    @JsonProperty("LIBELLE")
    private String lebelle;



}
