package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class AnnonceLieDTO {
   @JsonIgnore
   private Integer id;

   @JsonProperty("annonce_lie")
   private String annonce;
}
