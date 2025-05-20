package models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@ToString
public class Tender {
    @JsonProperty("idweb")
    private String idweb;


    @JsonProperty("id")
    private String id;


    @JsonProperty("contractfolderid")
    private String contractfolderid;

    @Getter
    @JsonProperty("objet")
    private String objet;

    @JsonProperty("code_departement")
    private List<String> codeDepartement;

    @JsonProperty("famille")
    private String famille;

    @JsonProperty("etat")
    private String etat;

    @JsonProperty("dateparution")
    private Date dateParution;

    @JsonProperty("datefindiffusion")
    private Date dateFinDiffusion;

    @JsonProperty("datelimitereponse")
    private Date dateLimitReponse;

    @JsonProperty("nomacheteur")
    private String nomAcheteur;

    @JsonProperty("type_marche")
    private List<String> typeMarche;



    @JsonProperty("type_avis")
    private List<String> typeAvis;

    @JsonProperty("annoncelie")
    private List<String> annonceLie;

    @Getter
    @JsonProperty("gestion")
    private JsonNode gestion;



    @Getter
    @JsonProperty("donnees")
    private JsonNode donnees;


    @JsonProperty("url_avis")
    private String url_avis ;

    //************************ Fields Gestion ******************************//

}
