package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.DescripteurDTO;
import com.marketingconfort.mobimarche.collector.dto.LotDTO;
import com.marketingconfort.mobimarche.collector.dto.ValeurDTO;
import com.marketingconfort.mobimarche.collector.models.Descripteur;
import com.marketingconfort.mobimarche.collector.models.Lot;
import com.marketingconfort.mobimarche.collector.models.Valeur;

import java.util.ArrayList;
import java.util.List;

public class LotMapper {

    public Lot toEntity(LotDTO lotDTO) {
        Lot lot = new Lot();
        lot.setDescription(lotDTO.getDescription());
        lot.setLieuPrincipal(lotDTO.getLieuPrincipal());
        ValeurMapper vm = new ValeurMapper();
        List<Valeur> val = vm.toListEntity(lotDTO.getValeursDTO());
        lot.setValeurs( val);
        return lot ;
    }

    public List<Lot> toListEntity(List<LotDTO> lotsDTO) {
        List<Lot> lots = new ArrayList<Lot>();
        for (LotDTO lotDTO : lotsDTO){
            Lot lot = new Lot();
            lot.setDescription(lotDTO.getDescription());
            lot.setLieuPrincipal(lotDTO.getLieuPrincipal());
            ValeurMapper vm = new ValeurMapper();
            List<Valeur> val = vm.toListEntity(lotDTO.getValeursDTO());
            lot.setValeurs( val);
            lots.add(lot);
        }
        return lots ;
    }
}
