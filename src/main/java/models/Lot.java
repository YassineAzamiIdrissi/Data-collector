package models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Lot {
    @Getter
    @Setter
    @JsonProperty("DESCRIPTION")
    private String description;
    @Getter
    @Setter
    @JsonProperty("LIEU_PRINCIPAL")
    private String lieuPrincipal;
    @Getter
    @Setter
    @JsonProperty("VALEUR")
    private Valeur valeur;
}