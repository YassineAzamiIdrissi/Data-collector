package com.marketingconfort.mobimarche.collector.mapper.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Descripteur {
    @Getter @Setter
    String code ;
    @Getter  @Setter
    String lebelle ;
}
