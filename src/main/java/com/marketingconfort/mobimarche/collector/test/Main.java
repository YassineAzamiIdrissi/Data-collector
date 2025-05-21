package com.marketingconfort.mobimarche.collector.test;

import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.mapper.TenderMapper;
import com.marketingconfort.mobimarche.collector.services.TenderDtoGetterService;
import org.springframework.web.client.RestTemplate;

import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        ////

        // Créez le service
        TenderDtoGetterService tenderDtoGetterService = new TenderDtoGetterService(restTemplate , new TenderMapper());

        // Récupérer les offres pour un idweb spécifique
        List<TenderDTO> offres = tenderDtoGetterService.getTenderDTOById("22_170271");
        System.out.println("----------------L'offre -------------------------");
       System.out.println(offres.get(0));


    }

}


