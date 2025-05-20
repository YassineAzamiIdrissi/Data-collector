package com.marketingconfort.mobimarche.collector.models;

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

    @Column(name = "publication_date")
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
    @Column(name = "r2")
    private String r2;

    @Column(name = "r3")
    private String r3;

    @Column(name = "r3_profession")
    private String tetier_r3;

    @Column(name = "r4")
    private String r4;

    @Column(name = "r4_profession")
    private String tetier_r4;

    @Column(name = "k1")
    private String k1;

    @Column(name = "k9")
    private String k9;

    @Column(name = "announcement_number")
    private String numAnnonce;

    @Column(name = "publication_date_2")
    private LocalDate datePublication;

    @Column(name = "publication_name")
    private String nomPublication;

    @Column(name = "announcement_ref_number")
    private String avisPrecedentNumeroAnnonce;

    @Column(name = "issue_number")
    private String avisPrecedentNumeroParution;

    @Column(name = "issue_type")
    private String avisPrecedentTypeParution;

    @Column(name = "announcement_reference")
    private String avisPrecedentAnnonceRef;

    @Column(name = "prev_annonce_year")
    private String avisPrecedentAnnee;

    @Column(name = "subject_summary")
    private String resumeObjet;

    @Column(name = "procedure_type_alias")
    private String typeProcedure;

    @Column(name = "gender")
    private String genre;

    @Column(name = "reminder")
    private String rappel;


}
