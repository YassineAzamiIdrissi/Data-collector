package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.DescripteurDTO;
import com.marketingconfort.mobimarche.collector.dto.ValeurDTO;
import com.marketingconfort.mobimarche.collector.models.Descripteur;
import com.marketingconfort.mobimarche.collector.models.Valeur;

import java.util.ArrayList;
import java.util.List;


public class DescripteurMapper {



    public Descripteur toEntity(DescripteurDTO descDTO) {
        Descripteur desc = new Descripteur();
        desc.setCode(descDTO.getCode());
        desc.setLebelle(descDTO.getLebelle());
        return desc  ;
    }

    public List<Descripteur> toListEntity(List<DescripteurDTO> descsDTO) {
        List<Descripteur> descs = new ArrayList<Descripteur>();
        for (DescripteurDTO descDTO : descsDTO){
            Descripteur desc = new Descripteur();
            desc.setCode(descDTO.getCode());
            desc.setLebelle(descDTO.getLebelle());
            descs.add(desc);
        }
        return descs ;
    }
}
