package models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
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
    private Descripteur[] descripteurs;
    private AvisPrecedent avisPrecedent;
    private String resumeObjet;
    private String typeProcedure;
    private String genre ;
    private String rappel;


    @NoArgsConstructor
    public static class  Descripteur {
        @Getter
        @Setter
        @JsonProperty("CODE")
        String code ;
        @Getter
        @Setter
        @JsonProperty("LIBELLE")
        String lebelle ;

        @Override
        public String toString() {
            return "Descripteur{" +
                    "code='" + code + '\'' +
                    ", lebelle='" + lebelle + '\'' +
                    '}';
        }
    }

    @NoArgsConstructor
    public static class  AvisPrecedent {
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

        @Override
        public String toString() {
            return "AvisPrecedent{" +
                    "numeroAnnonce='" + numeroAnnonce + '\'' +
                    ", numeroParution='" + numeroParution + '\'' +
                    ", typeParution='" + typeParution + '\'' +
                    ", dateParution='" + dateParution + '\'' +
                    ", annee='" + annee + '\'' +
                    ", annonceRef='" + annonceRef + '\'' +
                    '}';
        }
    }

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
    private Lot[] lots;

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

    // === Classe Lot interne ===

    @ToString
    public static class Valeur {
        @Getter
        @Setter
        @JsonProperty("@DEVISE")
        private String devise;
        @Getter
        @Setter
        @JsonProperty("#text")
        private String text;
    }

    @ToString
    public static class Lot {
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


}
