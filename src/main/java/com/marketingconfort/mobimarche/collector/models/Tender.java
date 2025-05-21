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


    @Column(name = "tender_id")
    private String id_;

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
    private List<AnnonceLie> annonceLies;

    @Column(name = "family")
    private String famille;

    @Column(name = "status")
    private String etat;

    @Column(name = "offer_publication_date")
    private Date dateParution;

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
    @Column(name = "data_legal_name")
    private String donneesDenomination;

    @Column(name = "data_siret_number")
    private String donneesSiret;

    @Column(name = "data_national_id_code")
    private String donneesCodeIdentNational;

    @Column(name = "data_contact_info")
    private String donneesContact;

    @Column(name = "data_postal_code")
    private String donneesCp;

    @Column(name = "data_city")
    private String donneesVille;

    @Column(name = "data_buyer_profile_url")
    private String donneesUrlProfilAcheteur;

    @Column(name = "data_full_documents_yes")
    private String donneesIntegraliteDocOui;

    @Column(name = "data_acts_on_behalf_no")
    private String donneesAgitPourAutreCompteNon;

    @Column(name = "data_central_purchasing_body_no")
    private String donneesOrganismeAcheteurCentralNon;

    @Column(name = "data_contract_title")
    private String donneesTitreMarche;


    @Column(name = "data_full_subject")
    private String donneesObjetComplet;

    @Column(name = "data_main_cpv")
    private String donneesCpvPrincipal;

    @Column(name = "data_place_of_execution")
    private String donneesLieuExecution;

    @Column(name = "data_duration_months")
    private String donneesDureeMois;

    @Column(name = "data_non_phased_contract")
    private String donneesTrancheNon;

    @Column(name = "data_reserved_contract_no")
    private String donneesMarcheReserveNon;

    @Column(name = "data_divided_into_lots")
    private String donneesDivEnLots;


    @Column(name = "data_procedure_type")
    private String donneesType_Procedure;

    @Column(name = "data_purchase_technique")
    private String donneesTechAchat;

    @Column(name = "data_award_without_negotiation_yes")
    private String donneesAttribSansNegOui;

    @Column(name = "data_variants_not_allowed")
    private String donneesVariantesNon;

    @Column(name = "data_buyer_category")
    private String donneesCategorieAcheteur;

    @Column(name = "data_award_criteria")
    private String donneesCriteresAttribution;

    @Column(name = "data_offer_reception_date")
    private String donneesDateReceptionOffres;

    @Column(name = "data_electronic_participation_allowed")
    private String donneesParticipationElectroniqueAutorisee;

    @Column(name = "data_selection_criteria")
    private String donneesCritereSelection;

    @Column(name = "data_economic_capacity")
    private String donneesCapaciteEco;

    @Column(name = "data_technical_capacity")
    private String donneesCapaciteTech;

    @Column(name = "data_site_visit_no")
    private String donneesVisiteNon;

    @Column(name = "data_additional_information")
    private String donneesRenseignementsComplementaires;

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

    @Column(name = "management_prev_notice_publication_date")
    private Date gestionAvisPrecedentDateParution;

    @Column(name = "management_subject_summary")
    private String gestionResumeObjet;

    @Column(name = "management_procedure_type_alias")
    private String gestionTypeProcedure;

    @Column(name = "management_type")
    private String gestionGenre;

    @Column(name = "management_reminder")
    private String gestionRappel;


}
