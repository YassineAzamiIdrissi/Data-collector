package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.AnnonceLieDTO;
import com.marketingconfort.mobimarche.collector.models.AnnonceLie;

public class AnnonceLieMapper {

    public AnnonceLie toEntity(AnnonceLieDTO aDTO) {
        AnnonceLie a = new AnnonceLie();
        a.setId(aDTO.getId());
        a.setAnnonce(aDTO.getAnnonce());
        return a ;
    }
}
