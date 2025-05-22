package com.marketingconfort.mobimarche.collector.mapper;

import com.marketingconfort.mobimarche.collector.dto.ValeurDTO;
import com.marketingconfort.mobimarche.collector.models.Valeur;

import java.util.ArrayList;
import java.util.List;

public class ValeurMapper {
    public Valeur toEntity(ValeurDTO valDTO) {
        Valeur val = new Valeur();
        val.setDevise(valDTO.getDevise());
        val.setText(valDTO.getText());
        return val ;
    }

    public List<Valeur> toListEntity(List<ValeurDTO> valsDTO) {
        List<Valeur> vals = new ArrayList<Valeur>();
        for (ValeurDTO vDTO : valsDTO){
            Valeur val = new Valeur();
            val.setDevise(vDTO.getDevise());
            val.setText(vDTO.getText());
            vals.add(val);
        }
        return vals ;
    }
}
