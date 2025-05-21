package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.models.TypeAvis;

import java.util.ArrayList;
import java.util.List;

public class TypeAvisMapper {



    public List<TypeAvis> toListEntity(List<String> typeAviss) {
        List<TypeAvis> r = new ArrayList<>();
        for (String typeAvis : typeAviss){
            r.add(new TypeAvis(typeAvis));
        }
        return r ;
    }
}
