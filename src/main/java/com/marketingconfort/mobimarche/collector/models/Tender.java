package com.marketingconfort.mobimarche.collector.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class Tender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    // offre  : : : : ::: : : : : : : : : : : : : : : :
    @Column(name = "web_id")
    private String idweb;

    @Column(name = "notice_url")
    private String url_avis;


    @Column(name = "contract_folder_id")
    private String contractfolderid;

    @Column(name = "subject")
    private String objet;

    @OneToMany(mappedBy = "tender")
    private List<CodeDepartement> codesDepartement;

    @OneToMany(mappedBy = "tender")
    private List<Lot> lots;

    @OneToMany(mappedBy = "tender")
    private List<TypeAvis> typeAvis;

    @OneToMany(mappedBy = "tender")
    private List<Annonce> annonces;

    @Column(name = "family")
    private String famille;

    @Column(name = "status")
    private String etat;

    @Column(name = "offer_publication_date")
    private Date dateParution;

    @Column(name = "notice_prev_publication_date")
    private Date avisPrecedentDateParution;

    @Column(name = "end_of_distribution_date")
    private Date dateFinDiffusion;

    @Column(name = "response_deadline")
    private Date dateLimitReponse;

    @Column(name = "buyer_name")
    private String nomAcheteur;

    @OneToMany(mappedBy = "tender")
    private List<TypeMarche> typeMarche;

    @OneToMany(mappedBy = "tender")
    private List<Descripteur> descriptors;


    // données :  :: : : : : : : : : : : : : :  : : :
    @Column(name = "legal_name")
    private String denomination;

    @Column(name = "siret_number")
    private String siret;

    @Column(name = "national_id_code")
    private String codeIdentNational;

    @Column(name = "contact_info")
    private String contact;

    @Column(name = "postal_code")
    private String cp;

    @Column(name = "city")
    private String ville;

    @Column(name = "buyer_profile_url")
    private String urlProfilAcheteur;

    @Column(name = "full_documents_yes")
    private String integraliteDocOui;

    @Column(name = "acts_on_behalf_no")
    private String agitPourAutreCompteNon;

    @Column(name = "central_purchasing_body_no")
    private String organismeAcheteurCentralNon;

    @Column(name = "contract_title")
    private String titreMarche;

    @Column(name = "contract_type")
    private String type_Marche;

    @Column(name = "full_subject")
    private String objetComplet;

    @Column(name = "main_cpv")
    private String cpvPrincipal;

    @Column(name = "place_of_execution")
    private String lieuExecution;

    @Column(name = "duration_months")
    private String dureeMois;

    @Column(name = "non_phased_contract")
    private String trancheNon;

    @Column(name = "reserved_contract_no")
    private String marcheReserveNon;

    @Column(name = "divided_into_lots")
    private boolean divEnLots;


    @Column(name = "procedure_type")
    private String type_Procedure;

    @Column(name = "purchase_technique")
    private String techAchat;

    @Column(name = "award_without_negotiation_yes")
    private String attribSansNegOui;

    @Column(name = "variants_not_allowed")
    private String variantesNon;

    @Column(name = "buyer_category")
    private String categorieAcheteur;

    @Column(name = "award_criteria")
    private String criteresAttribution;

    @Column(name = "offer_reception_date")
    private String dateReceptionOffres;

    @Column(name = "electronic_participation_allowed")
    private String participationElectroniqueAutorisee;

    @Column(name = "selection_criteria")
    private String critereSelection;

    @Column(name = "economic_capacity")
    private String capaciteEco;

    @Column(name = "technical_capacity")
    private String capaciteTech;

    @Column(name = "site_visit_no")
    private String visiteNon;

    @Column(name = "additional_information")
    private String renseignementsComplementaires;

    // gestion : : : : : : : : : ::: : : : : : : : :
    @Column(name = "management_r2")
    private String gestionR2;

    @Column(name = "management_r3")
    private String gestionR3;

    @Column(name = "management_r3_profession")
    private String gestionTetier_r3;

    @Column(name = "management_r4")
    private String gestionR4;

    @Column(name = "management_r4_profession")
    private String gestionTetier_r4;

    @Column(name = "management_k1")
    private String gestionK1;

    @Column(name = "management_k9")
    private String gestionK9;

    @Column(name = "management_announcement_number")
    private String gestionNumAnnonce;

    @Column(name = "management_publication_date")
    private LocalDate gestionDatePublication;

    @Column(name = "management_publication_name")
    private String gestionNomPublication;

    @Column(name = "management_prev_notice_announce_number")
    private String gestionAvisPrecedentNumeroAnnonce;

    @Column(name = "management_prev_notice_publication_number")
    private String gestionAvisPrecedentNumeroParution;

    @Column(name = "management_prev_notice_publication_type")
    private String gestionAvisPrecedentTypeParution;

    @Column(name = "management_prev_notice_announce_reference")
    private String gestionAvisPrecedentAnnonceRef;

    @Column(name = "management_prev_notice_year")
    private String gestionAvisPrecedentAnnee;

    @Column(name = "management_subject_summary")
    private String gestionResumeObjet;

    @Column(name = "management_procedure_type_alias")
    private String gestionTypeProcedure;

    @Column(name = "management_type")
    private String gestionGenre;

    @Column(name = "management_reminder")
    private String gestionRappel;


}
