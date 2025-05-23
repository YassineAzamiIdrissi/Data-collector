package com.marketingconfort.mobimarche.collector.services;


import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.dto.TenderResponseDTO;
import com.marketingconfort.mobimarche.collector.mapper.TenderMapper;
import com.marketingconfort.mobimarche.collector.models.*;
import com.marketingconfort.mobimarche.collector.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TenderDtoGetterService {
    private final RestTemplate restTemplate;
    private final TenderMapper tenderMapper;


    private final TenderRepository tenderRepo;
    private final CodeDepartementRepository codeDepRepo;
    private final TypeMarcheRepository typeMarcheRepo;
    private final TypeAvisRepository typeAvisRepo;
    private final AnnonceLieRepository annonceLieRepo;
    private final ValeurRepository valeurRepo;
    private final LotRepository lotRepo;

    public List<TenderDTO> getTenderDTOById(String id) {
        try {
            String url = "https://boamp-datadila.opendatasoft.com/api/explore/v2.1/catalog/datasets/boamp/records"
                    + "?where=id=\"" + id + "\"";

            System.out.println("URL utilisée : " + url);

            TenderResponseDTO response = restTemplate.getForObject(url, TenderResponseDTO.class);

            if (response != null && response.getResults() != null) {
                return response.getResults();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    public List<TenderDTO> getTendersByYear(String year, String limit, String offset) {
        try {
            String conditionYear = "dateparution>='" + year + "-01-01'";
            String url = "https://boamp-datadila.opendatasoft.com/api/explore/v2.1/catalog/datasets/boamp/records"
                    + "?where=" + conditionYear + "&limit=" + limit + "&offset=" + offset;


            System.out.println("URL utilisée : " + url);

            TenderResponseDTO response = restTemplate.getForObject(url, TenderResponseDTO.class);

            if (response != null && response.getResults() != null) {
                List<TenderDTO> results = response.getResults();
                for (TenderDTO dto : results) {
                    Tender concernedTender = tenderMapper.toEntity(dto);
                    tenderRepo.save(concernedTender);
                    List<AnnonceLie> annonceLies = new ArrayList<>();
                    List<TypeMarche> typesMarches = new ArrayList<>();
                    List<TypeAvis> typesAvis = new ArrayList<>();
                    List<CodeDepartement> codesDep = new ArrayList<>();
                    if (dto.getAnnonceLies() != null) {
                        for (String annonceLie : dto.getAnnonceLies()) {
                            AnnonceLie annonceLieEntity = AnnonceLie.builder().
                                    annonce(annonceLie).
                                    build();
                            annonceLieEntity.setTender(concernedTender);
                            annonceLies.add(annonceLieEntity);
                        }
                    }
                    if (dto.getTypeMarches() != null) {
                        for (String typeMarche : dto.getTypeMarches()) {
                            TypeMarche typeMarcheEntity = TypeMarche.builder().
                                    typeMarche(typeMarche).build();
                            typeMarcheEntity.setTender(concernedTender);
                            typesMarches.add(typeMarcheEntity);
                        }
                    }
                    if (dto.getTypeAviss() != null) {
                        for (String typeAvis : dto.getTypeAviss()) {
                            TypeAvis typeAvisEntity = TypeAvis.builder().
                                    typeAvis(typeAvis).build();
                            typeAvisEntity.setTender(concernedTender);
                            typesAvis.add(typeAvisEntity);
                        }
                    }
                    if (dto.getCodeDepartements() != null) {
                        for (String codeDep : dto.getCodeDepartements()) {
                            CodeDepartement codeDepEntity = CodeDepartement.builder().codeDepartement(
                                    codeDep
                            ).build();
                            codeDepEntity.setTender(concernedTender);
                            codesDep.add(codeDepEntity);
                        }

                    }
                    if (concernedTender.getLots() != null) {
                        for (Lot conLot : concernedTender.getLots()) {
                            conLot.setTender(concernedTender);
                            lotRepo.save(conLot);
                            if (conLot.getValeurs() != null) {
                                for (Valeur valeur : conLot.getValeurs()) {
                                    valeur.setLot(conLot);
                                    valeurRepo.save(valeur);
                                }
                            }

                        }
                    }
                    // tenderRepo.save(concernedTender);
                    annonceLieRepo.saveAll(annonceLies);
                    typeMarcheRepo.saveAll(typesMarches);
                    typeAvisRepo.saveAll(typesAvis);
                    codeDepRepo.saveAll(codesDep);
                }

                return results;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
