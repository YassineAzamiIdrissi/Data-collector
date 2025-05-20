package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.CodeDepartementDTO;
import com.marketingconfort.mobimarche.collector.dto.TypeAvisDTO;
import com.marketingconfort.mobimarche.collector.models.CodeDepartement;
import com.marketingconfort.mobimarche.collector.models.TypeAvis;

public class TypeAvisMapper {

    TypeAvis toEntity(TypeAvisDTO taDTO){
        TypeAvis ta = new TypeAvis();
        ta.setId(taDTO.getId());
        ta.setTypeAvis(taDTO.getTypeAvis());
        return ta ;
    }
}
