package com.marketingconfort.mobimarche.collector.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class DescripteurDTO {
    @Getter
    @Setter
    @JsonProperty("CODE")
    String code ;
    @Getter
    @Setter
    @JsonProperty("LIBELLE")
    String lebelle ;
}
