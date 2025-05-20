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
public  class AvisPrecedentDTO {
    @JsonProperty("NUMEROANNONCE")
    String numeroAnnonce ;
    @JsonProperty("NUMEROPARUTION")
    String numeroParution ;

    @Getter
    @Setter
    @JsonProperty("TYPEPARUTION")
    String typeParution ;

    @Getter
    @Setter
    @JsonProperty("DATEPARUTION")
    String dateParution ;

    @Getter
    @Setter
    @JsonProperty("ANNEE")
    String annee;

    @Getter
    @Setter
    @JsonProperty("ANNONCEREF")
    String annonceRef;
}

