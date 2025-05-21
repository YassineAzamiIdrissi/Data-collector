package com.marketingconfort.mobimarche.collector.mapper;


import com.marketingconfort.mobimarche.collector.models.CodeDepartement;

import java.util.ArrayList;
import java.util.List;

public class CodeDepartementMapper {


    public List<CodeDepartement> toListEntity(List<String> codeDepartements) {
        List<CodeDepartement> r = new ArrayList<>();
        for (String cd : codeDepartements){
            r.add(new CodeDepartement(cd));
        }
        return r ;
    }
}
