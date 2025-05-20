package com.marketingconfort.mobimarche.collector.mapper.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public  class AvisPrecedent {
    @Getter  @Setter
    String numeroAnnonce ;
    @Getter @Setter
    String numeroParution ;
    @Getter @Setter
    String typeParution ;
    @Getter @Setter
    String dateParution ;
    @Getter @Setter
    String annee;
    @Getter  @Setter
    String annonceRef;
}

