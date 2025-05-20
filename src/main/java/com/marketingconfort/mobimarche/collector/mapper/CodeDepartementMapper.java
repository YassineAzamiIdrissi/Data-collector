package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.CodeDepartementDTO;
import com.marketingconfort.mobimarche.collector.dto.TenderDTO;
import com.marketingconfort.mobimarche.collector.models.CodeDepartement;

public class CodeDepartementMapper {

    public CodeDepartement toEntity(CodeDepartementDTO cdDTO) {
        CodeDepartement cd = new CodeDepartement();
        cd.setId(cdDTO.getId());
        cd.setCodeDepartement(cdDTO.getCodeDepartement());
        return cd ;
    }
}
