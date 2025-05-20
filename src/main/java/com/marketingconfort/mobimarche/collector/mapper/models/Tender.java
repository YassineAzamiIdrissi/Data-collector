package com.marketingconfort.mobimarche.collector.mapper.models;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@ToString
public class Tender {

    @Getter @Setter
    private String idweb;
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String contractfolderid;
    @Getter @Setter
    private String objet;
    @Getter @Setter
    private List<String> codeDepartement;
    @Getter @Setter
    private String famille;
    @Getter @Setter
    private String etat;
    @Getter @Setter
    private Date dateParution;
    @Getter @Setter
    private Date dateFinDiffusion;
    @Getter @Setter
    private Date dateLimitReponse;
    @Getter @Setter
    private String nomAcheteur;
    @Getter @Setter
    private List<String> typeMarche;
    @Getter @Setter
    private List<String> typeAvis;
    @Getter @Setter
    private List<String> annonceLie;
    @Getter @Setter
    private JsonNode gestion;
    @Getter @Setter
    private JsonNode donnees;
    @Getter @Setter
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
    private Descripteur[] descripteurs;
    @Getter @Setter
    private AvisPrecedent avisPrecedent;
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
    private Lot[] lots;

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
