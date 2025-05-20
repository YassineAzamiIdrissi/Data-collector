package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public  class  AvisPrecedent {
    @Getter
    @Setter
    @JsonProperty("NUMEROANNONCE")
    String numeroAnnonce ;
    @Getter
    @Setter
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

