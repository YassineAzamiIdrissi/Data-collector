package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.AnnonceDTO;
import com.marketingconfort.mobimarche.collector.dto.CodeDepartementDTO;
import com.marketingconfort.mobimarche.collector.models.Annonce;
import com.marketingconfort.mobimarche.collector.models.CodeDepartement;

public class AnnonceMapper {

    public Annonce toEntity(AnnonceDTO cdDTO) {
        CodeDepartement cd = new CodeDepartement();
        cd.setId(cdDTO.getId());
        cd.setCodeDepartement(cdDTO.getCodeDepartement());
        return cd ;
    }
}
