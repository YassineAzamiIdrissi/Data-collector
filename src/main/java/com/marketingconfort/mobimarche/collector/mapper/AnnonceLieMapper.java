package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.models.AnnonceLie;

import java.util.ArrayList;
import java.util.List;

public class AnnonceLieMapper {

    public List<AnnonceLie> toListEntity(List<String> annoncesLies) {
        List<AnnonceLie> r = new ArrayList<>();
        for (String annonce : annoncesLies){
            r.add(new AnnonceLie(annonce));
        }
        return r ;
    }
}
