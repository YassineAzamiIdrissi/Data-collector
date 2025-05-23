package com.marketingconfort.mobimarche.collector.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marketingconfort.mobimarche.collector.dto.DescripteurDTO;
import com.marketingconfort.mobimarche.collector.dto.LotDTO;
import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.models.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class TenderMapper {


    public Tender toEntity(TenderDTO tDTO) {
        Tender t = new Tender();
        t.setIdweb(tDTO.getIdweb());
        t.setId_(tDTO.getId_());
        t.setContractfolderid(tDTO.getContractfolderid());
        t.setObjet(tDTO.getObjet());
        t.setFamille(tDTO.getFamille());
        t.setEtat(tDTO.getEtat());
        t.setDateParution(tDTO.getDateParution());
        t.setDateFinDiffusion(tDTO.getDateFinDiffusion());
        t.setDateLimitReponse(tDTO.getDateLimitReponse());
        t.setNomAcheteur(tDTO.getNomAcheteur());
        t.setUrl_avis(tDTO.getUrl_avis());
        //-----------------------------
        CodeDepartementMapper cdMapper = new CodeDepartementMapper();
        if (tDTO.getCodeDepartements() != null) {
            List<CodeDepartement> codeDepartements = cdMapper.toListEntity(tDTO.getCodeDepartements());
            t.setCodesDepartements(codeDepartements);
        }
        //----------------------------
        TypeMarcheMapper tmMapper = new TypeMarcheMapper();
        if (tDTO.getTypeMarches() != null) {
            List<TypeMarche> typeMarches = tmMapper.toListEntity(tDTO.getTypeMarches());
            t.setTypeMarches(typeMarches);
        }

        //----------------------------
        TypeAvisMapper taMapper = new TypeAvisMapper();
        if (tDTO.getTypeAviss() != null) {
            List<TypeAvis> typeAviss = taMapper.toListEntity(tDTO.getTypeAviss());
            t.setTypeAviss(typeAviss);
        }

        //-----------------------------
        AnnonceLieMapper annonceMapper = new AnnonceLieMapper();
        if (tDTO.getAnnonceLies() != null) {
            List<AnnonceLie> annonces = annonceMapper.toListEntity(tDTO.getAnnonceLies());
            t.setAnnonceLies(annonces);
        }

        //-----------------------------


        JsonNode gestion = tDTO.getGestion();
        JsonNode donnees = tDTO.getDonnees();


//---------------- Extraction gestion ---------------------------
        DescripteurMapper dm = new DescripteurMapper();
        ObjectMapper mapper = new ObjectMapper();
        if (gestion.isTextual()) {
            try {
                gestion = mapper.readTree(gestion.textValue());
            } catch (IOException e) {
                System.err.println("Erreur lors du parsing du champ 'gestion' : " + e.getMessage());
            }
        }
        if (gestion.hasNonNull("R2")) t.setGestionR2(gestion.get("R2").asText());
        if (gestion.hasNonNull("R3")) t.setGestionR3(gestion.get("R3").asText());
        if (gestion.hasNonNull("TETIER_R3")) t.setGestionTetier_r3(gestion.get("TETIER_R3").asText());
        if (gestion.hasNonNull("R4")) t.setGestionR4(gestion.get("R4").asText());
        if (gestion.hasNonNull("TETIER_R4")) t.setGestionTetier_r4(gestion.get("TETIER_R4").asText());
        if (gestion.hasNonNull("K1")) t.setGestionK1(gestion.get("K1").asText());
        if (gestion.hasNonNull("K9")) t.setGestionK9(gestion.get("K9").asText());
        if (gestion.hasNonNull("NUM_ANN")) t.setGestionNumAnnonce(gestion.get("NUM_ANN").asText());

        JsonNode indexation = gestion.get("INDEXATION");
        if (indexation != null && indexation.isObject()) {
            if (indexation.hasNonNull("NOMPUBLICATION"))
                t.setGestionNomPublication(indexation.get("NOMPUBLICATION").asText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            if (indexation.hasNonNull("DATE_PUBLICATION")) {
                t.setGestionDatePublication(LocalDate.parse(indexation.get("DATE_PUBLICATION").asText(), formatter));
            }
            if (indexation.hasNonNull("RESUME_OBJET")) t.setGestionResumeObjet(indexation.get("RESUME_OBJET").asText());
            if (indexation.hasNonNull("TYPE_PROCEDURE_V1"))
                t.setGestionTypeProcedure(indexation.get("TYPE_PROCEDURE_V1").asText());
            if (indexation.hasNonNull("RAPPEL_V1")) t.setGestionRappel(indexation.get("RAPPEL_V1").asText());
            if (indexation.hasNonNull("DESCRIPTEURS")) {
                JsonNode descripteursNode = indexation.get("DESCRIPTEURS").get("DESCRIPTEUR");
                if (descripteursNode != null && descripteursNode.isArray()) {
                    DescripteurDTO[] tableau = mapper.convertValue(descripteursNode, DescripteurDTO[].class);
                    t.setDescriptors(dm.toListEntity(Arrays.asList(tableau)));
                } else if (descripteursNode.isObject()) {
                    DescripteurDTO descripteur = mapper.convertValue(descripteursNode, DescripteurDTO.class);
                    List<DescripteurDTO> descripteurList = new ArrayList<>();
                    descripteurList.add(descripteur);
                    List<Descripteur> descripteurs = dm.toListEntity(descripteurList);
                    t.setDescriptors(descripteurs);
                }
            }
            if (indexation.hasNonNull("GENRE_V1")) t.setGestionGenre(indexation.get("GENRE_V1").asText());

            if (indexation.hasNonNull("AVISLIEE")) {
                JsonNode avisLieeNode = indexation.get("AVISLIEE").get("AVIS_PRECEDENT");
                if (avisLieeNode != null && avisLieeNode.isObject()) {
                    if (avisLieeNode.hasNonNull("AVIS_PRECEDENT")) {
                        JsonNode avisPrecedent = avisLieeNode.get("AVIS_PRECEDENT");
                        if (avisPrecedent != null && avisPrecedent.isObject()) {
                            if (avisPrecedent.hasNonNull("NUMEROANNONCE"))
                                t.setGestionAvisPrecedentNumeroAnnonce(avisPrecedent.get("NUMEROANNONCE").
                                        asText());
                            if (avisPrecedent.hasNonNull("NUMEROPARUTION"))
                                t.setGestionAvisPrecedentNumeroParution(avisPrecedent.get("NUMEROPARUTION").
                                        asText());

                            if (avisPrecedent.hasNonNull("TYPEPARUTION"))
                                t.setGestionAvisPrecedentTypeParution(avisPrecedent.get("TYPEPARUTION").
                                        asText());

                            if (avisPrecedent.hasNonNull("DATEPARUTION"))
                                t.setGestionAvisPrecedentDateParution(avisPrecedent.get("DATEPARUTION").
                                        asText());

                            if (avisPrecedent.hasNonNull("ANNEE"))
                                t.setGestionAvisPrecedentAnnee(avisPrecedent.get("ANNEE").
                                        asText());

                            if (avisPrecedent.hasNonNull("ANNONCEREF"))
                                t.setGestionAvisPrecedentAnnonceRef(avisPrecedent.get("ANNONCEREF").
                                        asText());
                        }
                    }
                }
            }

        }
//---------------- Extraction donnees --------------------------

        ObjectMapper mapper2 = new ObjectMapper();

        if (donnees.isTextual()) {
            try {
                donnees = mapper2.readTree(donnees.textValue());
            } catch (IOException e) {
                System.err.println("Erreur lors du parsing du champ 'données' : " + e.getMessage());
            }
        }
        JsonNode identite = donnees.get("IDENTITE");
        if (identite != null && identite.isObject()) {
            if (identite.hasNonNull("DENOMINATION")) t.setDonneesDenomination(
                    identite.get("DENOMINATION").asText());
            JsonNode typeIdentNational = identite.get("TYPE_IDENT_NATIONAL");
            if (typeIdentNational != null && typeIdentNational.isObject()) {
                if (typeIdentNational.hasNonNull("SIRET")) t.setDonneesSiret(typeIdentNational.get("SIRET").asText());
            }
            if (identite.hasNonNull("CODE_IDENT_NATIONAL"))
                t.setDonneesCodeIdentNational(identite.get("CODE_IDENT_NATIONAL").asText());
            if (identite.hasNonNull("CONTACT")) t.setDonneesContact(identite.get("CONTACT").asText());
            if (identite.hasNonNull("CP")) t.setDonneesCp(identite.get("CP").asText());
            if (identite.hasNonNull("VILLE")) t.setDonneesVille(identite.get("VILLE").asText());
            if (identite.hasNonNull("URL_PROFIL_ACHETEUR"))
                t.setDonneesUrlProfilAcheteur(identite.get("URL_PROFIL_ACHETEUR").asText());
            if (identite.hasNonNull("INTEGRALITE_DOC_OUI"))
                t.setDonneesIntegraliteDocOui(identite.get("INTEGRALITE_DOC_OUI").asText());
            if (identite.hasNonNull("AGIT_POUR_AUTRE_COMPTE_NON"))
                t.setDonneesAgitPourAutreCompteNon(identite.get("AGIT_POUR_AUTRE_COMPTE_NON").asText());
            if (identite.hasNonNull("ORGANISME_ACHETEUR_CENTRAL_NON"))
                t.setDonneesOrganismeAcheteurCentralNon(identite.get("ORGANISME_ACHETEUR_CENTRAL_NON").asText());
        }
        JsonNode objet = donnees.get("OBJET");
        if (objet != null && objet.isObject()) {
            if (objet.hasNonNull("TITRE_MARCHE")) t.setDonneesTitreMarche
                    (objet.get("TITRE_MARCHE").asText());
            if (objet.hasNonNull("OBJET_COMPLET"))
                t.setDonneesObjetComplet(objet.get("OBJET_COMPLET").asText());

            JsonNode cpv = objet.get("CPV");
            if (cpv != null && cpv.isObject()) {
                if (cpv.hasNonNull("PRINCIPAL"))
                    t.setDonneesCpvPrincipal(cpv.get("PRINCIPAL").asText());
            }

            JsonNode lieuExecLiv = objet.get("LIEU_EXEC_LIVR");
            if (lieuExecLiv != null && lieuExecLiv.isObject()) {
                if (lieuExecLiv.hasNonNull("ADRESSE"))
                    t.setDonneesLieuExecution(lieuExecLiv.get("ADRESSE").asText());
            }

            JsonNode dureeDelai = objet.get("DUREE_DELAI");
            if (dureeDelai != null && dureeDelai.isObject()) {
                if (dureeDelai.hasNonNull("DUREE_MOIS"))
                    t.setDonneesDureeMois(dureeDelai.get("DUREE_MOIS").asText());
            }

            if (objet.hasNonNull("TRANCHE_NON"))
                t.setDonneesTrancheNon(objet.get("TRANCHE_NON").asText());

            if (objet.hasNonNull("TRANCHE_NON"))
                t.setDonneesTrancheNon(objet.get("TRANCHE_NON").asText());

            if (objet.hasNonNull("MARCHE_RESERVE_NON"))
                t.setDonneesMarcheReserveNon(objet.get("MARCHE_RESERVE_NON").asText());

            if (objet.hasNonNull("LOTS")) {
                JsonNode lotNode = objet.get("LOTS").get("LOT");
                if (lotNode != null && lotNode.isArray()) {
                    LotDTO[] tableau = mapper2.convertValue(lotNode, LotDTO[].class);
                    LotMapper lm = new LotMapper();
                    t.setLots(lm.toListEntity(Arrays.asList(tableau)));
                }
            }

            if (objet.hasNonNull("DIV_EN_LOTS")) {
                t.setDonneesDivEnLots(objet.get("DIV_EN_LOTS").asText());
            }


        }
        JsonNode procedure = donnees.get("PROCEDURE");
        if (procedure != null && procedure.isObject()) {
            JsonNode typeProcedure = procedure.get("TYPE_PROCEDURE");
            if (typeProcedure != null && typeProcedure.isObject()) {
                if (typeProcedure.hasNonNull("OUVERT"))
                    t.setDonneesType_Procedure(typeProcedure.get("OUVERT").asText());
            }


            JsonNode techAchat = procedure.get("TECH_ACHAT");
            if (techAchat != null && techAchat.isObject()) {
                if (techAchat.hasNonNull("ACCORD_CADRE")) {
                    t.setDonneesTechAchat(techAchat.get("ACCORD_CADRE").asText());
                }
                if (techAchat.hasNonNull("VARIANTES_NON"))
                    t.setDonneesVariantesNon(techAchat.get("VARIANTES_NON").asText());

                if (techAchat.hasNonNull("CATEGORIE_ACHETEUR"))
                    t.setDonneesCategorieAcheteur(techAchat.get("CATEGORIE_ACHETEUR").asText());
            }


            JsonNode criteresAttribution = procedure.get("CRITERES_ATTRIBUTION");
            if (criteresAttribution != null && criteresAttribution.isObject()) {
                if (criteresAttribution.hasNonNull("CRITERES_LIBRE"))
                    t.setDonneesCriteresAttribution(criteresAttribution.get("CRITERES_LIBRE").asText());
            }


            if (procedure.hasNonNull("ATTRIB_SANS_NEG_OUI"))
                t.setDonneesAttribSansNegOui(procedure.get("ATTRIB_SANS_NEG_OUI").asText());

            if (procedure.hasNonNull("VARIANTES_NON"))
                t.setDonneesVariantesNon(procedure.get("VARIANTES_NON").asText());

            if (procedure.hasNonNull("CATEGORIE_ACHETEUR"))
                t.setDonneesCategorieAcheteur(procedure.get("CATEGORIE_ACHETEUR").asText());
        }
        JsonNode conditionDelai = donnees.get("CONDITION_DELAI");
        if (conditionDelai != null && conditionDelai.isObject()) {
            if (conditionDelai.hasNonNull("RECEPT_OFFRES"))
                t.setDonneesDateReceptionOffres(conditionDelai.get("RECEPT_OFFRES").asText());
        }

        JsonNode conditionParticipation = donnees.get("CONDITION_PARTICIPATION");
        if (conditionParticipation != null && conditionParticipation.isObject()) {
            if (conditionParticipation.hasNonNull("CRITERE_SELECTION"))
                t.setDonneesCritereSelection(conditionParticipation.get("CRITERE_SELECTION").asText());

            if (conditionParticipation.hasNonNull("CAP_ECO"))
                t.setDonneesCapaciteEco(conditionParticipation.get("CAP_ECO").asText());

            if (conditionParticipation.hasNonNull("CAP_TECH"))
                t.setDonneesCapaciteTech(conditionParticipation.get("CAP_TECH").asText());
        }

        JsonNode renseignementsComp = donnees.get("RENSEIGNEMENTS_COMPLEMENTAIRES");
        if (renseignementsComp != null && renseignementsComp.isObject()) {
            if (renseignementsComp.hasNonNull("VISITE_NON"))
                t.setDonneesVisiteNon(renseignementsComp.get("VISITE_NON").asText());

            if (renseignementsComp.hasNonNull("RENS_COMPLEMENT"))
                t.setDonneesRenseignementsComplementaires(renseignementsComp.get("RENS_COMPLEMENT").asText());
        }

        JsonNode conditionRelativeMarche = donnees.get("CONDITION_RELATIVE_MARCHE");
        if (conditionRelativeMarche != null && conditionRelativeMarche.isObject()) {
            if (conditionRelativeMarche.hasNonNull("PARTICIPATION_ELECTRONIQUE_AUTORISEE"))
                t.setDonneesParticipationElectroniqueAutorisee(
                        conditionRelativeMarche.get("PARTICIPATION_ELECTRONIQUE_AUTORISEE").asText()
                );
        }

//--------------------------------------------------------------
        return t;
    }
}
