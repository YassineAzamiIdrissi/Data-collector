package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class DescripteurDTO {
    @JsonProperty("CODE")
    String code ;
    @JsonProperty("LIBELLE")
    String lebelle ;
}
