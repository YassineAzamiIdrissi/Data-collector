package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.DescripteurDTO;
import com.marketingconfort.mobimarche.collector.models.Descripteur;


public class DescripteurMapper {



    public Descripteur toEntity(DescripteurDTO descDTO) {
        Descripteur desc = new Descripteur();
        desc.setCode(descDTO.getCode());
        desc.setLebelle(descDTO.getLebelle());
        return desc  ;
    }
}
