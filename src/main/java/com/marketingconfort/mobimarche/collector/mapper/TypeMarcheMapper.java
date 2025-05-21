package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.models.TypeMarche;

import java.util.ArrayList;
import java.util.List;

public class TypeMarcheMapper {


    public List<TypeMarche> toListEntity(List<String> typeMarches) {
        List<TypeMarche> r = new ArrayList<>();
        for (String typeMarche : typeMarches){
            r.add(new TypeMarche(typeMarche));
        }
        return r ;
    }
}
