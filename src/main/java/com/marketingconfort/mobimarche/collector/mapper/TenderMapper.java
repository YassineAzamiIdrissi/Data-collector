package com.marketingconfort.mobimarche.collector.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.mapper.models.AvisPrecedent;
import com.marketingconfort.mobimarche.collector.mapper.models.Descripteur;
import com.marketingconfort.mobimarche.collector.mapper.models.Lot;
import com.marketingconfort.mobimarche.collector.mapper.models.Tender;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenderMapper {


    public Tender toEntity(TenderDTO tDTO) {

        JsonNode gestion = tDTO.getGestion();
        JsonNode donnees = tDTO.getDonnees();

        Tender t = new Tender();

//---------------- Extraction gestion ---------------------------
        ObjectMapper mapper = new ObjectMapper();
        if (gestion.isTextual()) {
            try {
                gestion = mapper.readTree(gestion.textValue());
            } catch (IOException e) {
                System.err.println("Erreur lors du parsing du champ 'gestion' : " + e.getMessage());
            }
        }
        if (gestion.hasNonNull("R2")) t.setR2(gestion.get("R2").asText());
        if (gestion.hasNonNull("R3")) t.setR3(gestion.get("R3").asText());
        if (gestion.hasNonNull("TETIER_R3")) t.setTetier_r3(gestion.get("TETIER_R3").asText());
        if (gestion.hasNonNull("R4")) t.setR4(gestion.get("R4").asText());
        if (gestion.hasNonNull("TETIER_R4")) t.setTetier_r4(gestion.get("TETIER_R4").asText());
        if (gestion.hasNonNull("K1")) t.setK1(gestion.get("K1").asText());
        if (gestion.hasNonNull("K9")) t.setK9(gestion.get("K9").asText());
        if (gestion.hasNonNull("NUM_ANN")) t.setNumAnnonce(gestion.get("NUM_ANN").asText());

        JsonNode indexation = gestion.get("INDEXATION");
        if (indexation != null && indexation.isObject()) {
            if (indexation.hasNonNull("NOMPUBLICATION")) t.setNomPublication(indexation.get("NOMPUBLICATION").asText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            if (indexation.hasNonNull("DATE_PUBLICATION")) {
                t.setDatePublication( LocalDate.parse(indexation.get("DATE_PUBLICATION").asText(), formatter));
            }  if (indexation.hasNonNull("RESUME_OBJET")) t.setResumeObjet(indexation.get("RESUME_OBJET").asText());
            if (indexation.hasNonNull("TYPE_PROCEDURE_V1")) t.setTypeProcedure(indexation.get("TYPE_PROCEDURE_V1").asText());
            if (indexation.hasNonNull("RAPPEL_V1")) t.setRappel(indexation.get("RAPPEL_V1").asText());
            if (indexation.hasNonNull("DESCRIPTEURS")) {
                JsonNode descripteursNode = indexation.get("DESCRIPTEURS").get("DESCRIPTEUR");
                if (descripteursNode != null && descripteursNode.isArray()) {
                    t.setDescripteurs(mapper.convertValue(descripteursNode, Descripteur[].class));
                }
            }
            if (indexation.hasNonNull("GENRE_V1")) t.setGenre(indexation.get("GENRE_V1").asText()) ;

            if (indexation.hasNonNull("AVISLIEE")) {
                JsonNode avisLieeNode = indexation.get("AVISLIEE").get("AVIS_PRECEDENT");
                if (avisLieeNode != null) {
                    t.setAvisPrecedent(mapper.convertValue(avisLieeNode, AvisPrecedent.class));
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
            if (identite.hasNonNull("DENOMINATION")) t.setDenomination(
                    identite.get("DENOMINATION").asText());
            JsonNode typeIdentNational = identite.get("TYPE_IDENT_NATIONAL");
            if (typeIdentNational != null && typeIdentNational.isObject()) {
                if (typeIdentNational.hasNonNull("SIRET")) t.setSiret( typeIdentNational.get("SIRET").asText());
            }
            if (identite.hasNonNull("CODE_IDENT_NATIONAL"))
                t.setCodeIdentNational(identite.get("CODE_IDENT_NATIONAL").asText());
            if (identite.hasNonNull("CONTACT")) t.setContact(identite.get("CONTACT").asText());
            if (identite.hasNonNull("CP")) t.setCp(identite.get("CP").asText());
            if (identite.hasNonNull("VILLE")) t.setVille(identite.get("VILLE").asText());
            if (identite.hasNonNull("URL_PROFIL_ACHETEUR"))
                t.setUrlProfilAcheteur( identite.get("URL_PROFIL_ACHETEUR").asText());
            if (identite.hasNonNull("INTEGRALITE_DOC_OUI"))
                t.setIntegraliteDocOui( identite.get("INTEGRALITE_DOC_OUI").asText());
            if (identite.hasNonNull("AGIT_POUR_AUTRE_COMPTE_NON"))
                t.setAgitPourAutreCompteNon(identite.get("AGIT_POUR_AUTRE_COMPTE_NON").asText());
            if (identite.hasNonNull("ORGANISME_ACHETEUR_CENTRAL_NON"))
                t.setOrganismeAcheteurCentralNon(identite.get("ORGANISME_ACHETEUR_CENTRAL_NON").asText());
        }
        JsonNode objet = donnees.get("OBJET");
        if (objet != null && objet.isObject()) {
            if (objet.hasNonNull("TITRE_MARCHE")) t.setTitreMarche
                    (objet.get("TITRE_MARCHE").asText());
            if (objet.hasNonNull("OBJET_COMPLET"))
                t.setObjetComplet( objet.get("OBJET_COMPLET").asText());

            JsonNode cpv = objet.get("CPV");
            if (cpv != null && cpv.isObject()) {
                if (cpv.hasNonNull("PRINCIPAL"))
                    t.setCpvPrincipal(cpv.get("PRINCIPAL").asText());
            }

            JsonNode lieuExecLiv = objet.get("LIEU_EXEC_LIVR");
            if (lieuExecLiv != null && lieuExecLiv.isObject()) {
                if (lieuExecLiv.hasNonNull("ADRESSE"))
                    t.setLieuExecution(lieuExecLiv.get("ADRESSE").asText());
            }

            JsonNode dureeDelai = objet.get("DUREE_DELAI");
            if (dureeDelai != null && dureeDelai.isObject()) {
                if (dureeDelai.hasNonNull("DUREE_MOIS"))
                    t.setDureeMois(dureeDelai.get("DUREE_MOIS").asText());
            }

            if (objet.hasNonNull("TRANCHE_NON"))
                t.setTrancheNon(objet.get("TRANCHE_NON").asText());

            if (objet.hasNonNull("TRANCHE_NON"))
                t.setTrancheNon(objet.get("TRANCHE_NON").asText());

            if (objet.hasNonNull("MARCHE_RESERVE_NON"))
                t.setMarcheReserveNon(objet.get("MARCHE_RESERVE_NON").asText());

            if (objet.hasNonNull("LOTS")) {
                JsonNode lotNode = objet.get("LOTS").get("LOT");
                if (lotNode != null && lotNode.isArray()) {
                    t.setLots ( mapper.convertValue(lotNode, Lot[].class) ) ;
                }
            }
        }
        JsonNode procedure = donnees.get("PROCEDURE");
        if (procedure != null && procedure.isObject()) {
            JsonNode typeProcedure = procedure.get("TYPE_PROCEDURE");
            if (typeProcedure.hasNonNull("OUVERT"))
                t.setTypeProcedure(typeProcedure.get("OUVERT").asText());

            JsonNode techAchat = procedure.get("TECH_ACHAT");
            if (techAchat.hasNonNull("ACCORD_CADRE")) {
                t.setTechAchat(techAchat.get("ACCORD_CADRE").asText());
            }

            if (techAchat.hasNonNull("VARIANTES_NON"))
                t.setVariantesNon(techAchat.get("VARIANTES_NON").asText());

            if (techAchat.hasNonNull("CATEGORIE_ACHETEUR"))
                t.setCategorieAcheteur(techAchat.get("CATEGORIE_ACHETEUR").asText());

            JsonNode criteresAttribution = procedure.get("CRITERES_ATTRIBUTION");
            if (criteresAttribution.hasNonNull("CRITERES_LIBRE"))
                t.setCriteresAttribution(criteresAttribution.get("CRITERES_LIBRE").asText());

            if (procedure.hasNonNull("ATTRIB_SANS_NEG_OUI"))
                t.setAttribSansNegOui(procedure.get("ATTRIB_SANS_NEG_OUI").asText());

            if (procedure.hasNonNull("VARIANTES_NON"))
                t.setVariantesNon(procedure.get("VARIANTES_NON").asText());

            if (procedure.hasNonNull("CATEGORIE_ACHETEUR"))
                t.setCategorieAcheteur(procedure.get("CATEGORIE_ACHETEUR").asText());
        }
        JsonNode conditionDelai = donnees.get("CONDITION_DELAI");
        if (conditionDelai != null && conditionDelai.isObject()) {
            if (conditionDelai.hasNonNull("RECEPT_OFFRES"))
                t.setDateReceptionOffres(conditionDelai.get("RECEPT_OFFRES").asText());
        }

        JsonNode conditionParticipation = donnees.get("CONDITION_PARTICIPATION");
        if (conditionParticipation != null && conditionParticipation.isObject()) {
            if (conditionParticipation.hasNonNull("CRITERE_SELECTION"))
                t.setCritereSelection(conditionParticipation.get("CRITERE_SELECTION").asText());

            if (conditionParticipation.hasNonNull("CAP_ECO"))
                t.setCapaciteEco(conditionParticipation.get("CAP_ECO").asText());

            if (conditionParticipation.hasNonNull("CAP_TECH"))
                t.setCapaciteTech(conditionParticipation.get("CAP_TECH").asText());
        }

        JsonNode renseignementsComp = donnees.get("RENSEIGNEMENTS_COMPLEMENTAIRES");
        if (renseignementsComp != null && renseignementsComp.isObject()) {
            if (renseignementsComp.hasNonNull("VISITE_NON"))
                t.setVisiteNon(renseignementsComp.get("VISITE_NON").asText());

            if (renseignementsComp.hasNonNull("RENS_COMPLEMENT"))
                t.setRenseignementsComplementaires(renseignementsComp.get("RENS_COMPLEMENT").asText());
        }

        JsonNode conditionRelativeMarche = donnees.get("CONDITION_RELATIVE_MARCHE");
        if (conditionRelativeMarche != null && conditionRelativeMarche.isObject()) {
            t.setParticipationElectroniqueAutorisee(
                    conditionRelativeMarche.get("PARTICIPATION_ELECTRONIQUE_AUTORISEE").asText()
            );
        }

//--------------------------------------------------------------
        return t ;
    }
}
