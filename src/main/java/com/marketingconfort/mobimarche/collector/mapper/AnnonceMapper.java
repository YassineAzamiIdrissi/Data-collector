package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.AnnonceDTO;
import com.marketingconfort.mobimarche.collector.dto.CodeDepartementDTO;
import com.marketingconfort.mobimarche.collector.models.Annonce;
import com.marketingconfort.mobimarche.collector.models.CodeDepartement;

public class AnnonceMapper {

    public Annonce toEntity(AnnonceDTO aDTO) {
        Annonce a = new Annonce();
        a.setId(aDTO.getId());
        a.setAnnonce(aDTO.getAnnonce());
        return a ;
    }
}
