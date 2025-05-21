package com.marketingconfort.mobimarche.collector.services;


import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.dto.TenderResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TenderDtoGetterService {
    private final RestTemplate restTemplate;

    public TenderDtoGetterService(RestTemplate restTemplate ) {
        this.restTemplate = restTemplate;
    }

    public List<TenderDTO> getTenderDTOById(String id) {
        try {
            String url = "https://boamp-datadila.opendatasoft.com/api/explore/v2.1/catalog/datasets/boamp/records"
                    + "?where=id=\""+id+"\"";

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


}
