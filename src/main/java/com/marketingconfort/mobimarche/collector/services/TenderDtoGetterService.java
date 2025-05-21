package com.marketingconfort.mobimarche.collector.services;


import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.dto.TenderResponseDTO;
import com.marketingconfort.mobimarche.collector.mapper.TenderMapper;
import com.marketingconfort.mobimarche.collector.models.Tender;
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

    public List<TenderDTO> getOffresByYear(String year, String limit) {
        try {
            String conditionYear = "dateparution>='" + year + "-01-01'";
            String url = "https://boamp-datadila.opendatasoft.com/api/explore/v2.1/catalog/datasets/boamp/records"
                    + "?where=" + conditionYear + "&limit=" + limit;


            System.out.println("URL utilisée : " + url);

            TenderResponseDTO response = restTemplate.getForObject(url, TenderResponseDTO.class);

            if (response != null && response.getResults() != null) {
                List<TenderDTO> results = response.getResults();
                List<Tender> concerned = new ArrayList<>();
                for (TenderDTO dto : results) {
                    concerned.add(tenderMapper.toEntity(dto));
                }
                for (Tender tender : concerned) {

                }
                return results;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
