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
@Getter @Setter
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
    @Getter @Setter
    private String r2;
    @Getter @Setter
    private String r3;
    @Getter @Setter
    private String tetier_r3 ;
    @Getter @Setter
    private String r4;
    @Getter @Setter
    private String tetier_r4 ;
    @Getter @Setter
    private String k1 ;
    @Getter @Setter
    private String k9 ;
    @Getter @Setter
    private String numAnnonce ;
    @Getter @Setter
    private LocalDate datePublication ;
    @Getter @Setter
    private String nomPublication;
    @Getter @Setter
    private DescripteurDTO[] descripteurs;
    @Getter @Setter
    private AvisPrecedentDTO avisPrecedent;
    @Getter @Setter
    private String resumeObjet;
    @Getter @Setter
    private String typeProcedure;
    @Getter @Setter
    private String genre ;
    @Getter @Setter
    private String rappel;

    //*************** Donnees Fields ****************************************

    // === IDENTITE ===
    @Getter @Setter
    private String denomination;
    @Getter @Setter
    private String siret;
    @Getter @Setter
    private String codeIdentNational;
    @Getter @Setter
    private String contact;
    @Getter @Setter
    private String cp;
    @Getter @Setter
    private String ville;
    @Getter @Setter
    private String urlProfilAcheteur;
    @Getter @Setter
    private String integraliteDocOui;
    @Getter @Setter
    private String agitPourAutreCompteNon;
    @Getter @Setter
    private String organismeAcheteurCentralNon;

    // === OBJET ===
    @Getter @Setter
    private String titreMarche;
    @Getter @Setter
    private String type_Marche; // Fournitures, Services, etc.
    @Getter @Setter
    private String objetComplet;
    @Getter @Setter
    private String cpvPrincipal;
    @Getter @Setter
    private String lieuExecution;
    @Getter @Setter
    private String dureeMois;
    @Getter @Setter
    private String trancheNon;
    @Getter @Setter
    private String marcheReserveNon;
    @Getter @Setter
    private boolean divEnLots;

    // Liste des lots
    @Getter @Setter
    private LotDTO[] lots;

    // === PROCEDURE ===
    @Getter @Setter
    private String type_Procedure;
    @Getter @Setter
    private String techAchat;
    @Getter @Setter
    private String attribSansNegOui;
    @Getter @Setter
    private String variantesNon;
    @Getter @Setter
    private String categorieAcheteur;
    @Getter @Setter
    private String criteresAttribution;

    // === CONDITION_DELAI ===
    @Getter @Setter
    private String dateReceptionOffres;

    // === CONDITION_RELATIVE_MARCHE ===
    @Getter @Setter
    private String participationElectroniqueAutorisee;

    // === CONDITION_PARTICIPATION ===
    @Getter @Setter
    private String critereSelection;
    @Getter @Setter
    private String capaciteEco;
    @Getter @Setter
    private String capaciteTech;

    // === RENSEIGNEMENTS_COMPLEMENTAIRES ===
    @Getter @Setter
    private String visiteNon;
    @Getter @Setter
    private String renseignementsComplementaires;

}
