package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.AnnonceLieDTO;
import com.marketingconfort.mobimarche.collector.models.Annonce;

public class AnnonceLieMapper {

    public Annonce toEntity(AnnonceLieDTO aDTO) {
        Annonce a = new Annonce();
        a.setId(aDTO.getId());
        a.setAnnonce(aDTO.getAnnonce());
        return a ;
    }
}
