package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@ToString
@Getter
@Setter
public class TenderDTO {
    @JsonProperty("idweb")
    private String idweb;


    @JsonProperty("id")
    private String id;


    @JsonProperty("contractfolderid")
    private String contractfolderid;


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


    @JsonProperty("gestion")
    private JsonNode gestion;

    @JsonProperty("donnees")
    private JsonNode donnees;


    @JsonProperty("url_avis")
    private String url_avis ;

}
