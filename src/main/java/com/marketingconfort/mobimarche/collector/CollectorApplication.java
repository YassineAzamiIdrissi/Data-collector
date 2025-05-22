package com.marketingconfort.mobimarche.collector;

import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.mapper.TenderMapper;
import com.marketingconfort.mobimarche.collector.models.Tender;
import com.marketingconfort.mobimarche.collector.services.TenderDtoGetterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CollectorApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CollectorApplication.class, args);
		ApplicationContext context = SpringApplication.run(CollectorApplication.class, args);

		// Récupérer le service géré par Spring
		TenderDtoGetterService tenderDtoGetterService = context.getBean(TenderDtoGetterService.class);

		// Utilisation du service
		List<TenderDTO> offres = tenderDtoGetterService.getTenderDTOById("22_170271");
		System.out.println("----------------TenderDTO -------------------------");
		System.out.println(offres.get(0));
		TenderMapper tm = new TenderMapper();
		Tender t = tm.toEntity(offres.get(0));
		System.out.println("----------------Tender -------------------------");
		System.out.println(t);
	}

}
