package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.TypeAvisDTO;
import com.marketingconfort.mobimarche.collector.dto.TypeMarcheDTO;
import com.marketingconfort.mobimarche.collector.models.TypeAvis;
import com.marketingconfort.mobimarche.collector.models.TypeMarche;

public class TypeMarcheMapper {

    TypeMarche toEntity(TypeMarcheDTO tmDTO){
        TypeMarche tm = new TypeMarche();
        tm.setId(tmDTO.getId());
        tm.setTypeMarche(tmDTO.getTypeMarche());
        return tm;
    }
}
