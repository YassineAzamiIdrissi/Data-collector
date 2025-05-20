package com.marketingconfort.mobimarche.collector.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marketingconfort.mobimarche.collector.dto.LotDTO;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // offre  : : : : :  ::::: : :  : ::: : : :  : : : :
    private String idweb;
    private String contractfolderid;
    private String objet;
    @OneToMany(mappedBy = "tender")
    private List<CodeDepartement> codeDepartement;
    private String famille;
    private String etat;
    private Date dateParution;
    private Date dateFinDiffusion;
    private Date dateLimitReponse;
    private String nomAcheteur;
    @OneToMany(mappedBy = "tender")
    private List<TypeMarche> typeMarche;
    // donnees : : : :  : : : :::: : :  : : : :
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
    private String titreMarche;
    private String type_Marche; // Fournitures, Services, etc.
    private String objetComplet;
    private String cpvPrincipal;
    private String lieuExecution;
    private String dureeMois;
    private String trancheNon;
    private String marcheReserveNon;
    private boolean divEnLots;
    // ENTITY : : : : : : : : : : : : : private LotDTO[] lots;
    private String type_Procedure;
    private String techAchat;
    private String attribSansNegOui;
    private String variantesNon;
    private String categorieAcheteur;
    private String criteresAttribution;
    private String dateReceptionOffres;
    private String participationElectroniqueAutorisee;
    private String critereSelection;
    private String capaciteEco;
    private String capaciteTech;
    private String visiteNon;
    private String renseignementsComplementaires;
    // gestion : : : : : : : :  :
    private String r2;
    private String r3;
    private String tetier_r3;
    private String r4;
    private String tetier_r4;
    private String k1;
    private String k9;
    private String numAnnonce;
    private LocalDate datePublication;
    private String nomPublication;
    // Entity :: private Descripteur[] descripteurs;
    private String numeroAnnonce;
    private String numeroParution;
    private String typeParution;
    private String annonceRef;
    private String resumeObjet;
    private String typeProcedure;
    private String genre;
    private String rappel;
}
