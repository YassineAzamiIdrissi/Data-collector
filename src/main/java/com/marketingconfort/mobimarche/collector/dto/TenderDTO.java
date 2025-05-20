package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@ToString
public class TenderDTO {
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

    private String r2;
    private String r3;
    private String tetier_r3 ;
    private String r4;
    private String tetier_r4 ;
    private String k1 ;
    private String k9 ;
    private String numAnnonce ;
    private LocalDate datePublication ;
    private String nomPublication;
    private DescripteurDTO[] descripteurs;
    private AvisPrecedentDTO avisPrecedent;
    private String resumeObjet;
    private String typeProcedure;
    private String genre ;
    private String rappel;

    //*************** Donnees Fields ****************************************

    // === IDENTITE ===
    private String denomination;
    private String siret;
    private String codeIdentNational;
    private String contact;
    private String cp;
    private String ville;
    private String urlProfilAcheteur;
    private String integraliteDocOui;
    private String agitPourAutreCompteNon;
    private String organismeAcheteurCentralNon;

    // === OBJET ===
    private String titreMarche;
    private String type_Marche; // Fournitures, Services, etc.
    private String objetComplet;
    private String cpvPrincipal;
    private String lieuExecution;
    private String dureeMois;
    private String trancheNon;
    private String marcheReserveNon;
    private boolean divEnLots;

    // Liste des lots
    private LotDTO[] lots;

    // === PROCEDURE ===
    private String type_Procedure;
    private String techAchat;
    private String attribSansNegOui;
    private String variantesNon;
    private String categorieAcheteur;
    private String criteresAttribution;

    // === CONDITION_DELAI ===
    private String dateReceptionOffres;

    // === CONDITION_RELATIVE_MARCHE ===
    private String participationElectroniqueAutorisee;

    // === CONDITION_PARTICIPATION ===
    private String critereSelection;
    private String capaciteEco;
    private String capaciteTech;

    // === RENSEIGNEMENTS_COMPLEMENTAIRES ===
    private String visiteNon;
    private String renseignementsComplementaires;

}
