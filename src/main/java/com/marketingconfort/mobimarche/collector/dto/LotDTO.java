package com.marketingconfort.mobimarche.collector.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marketingconfort.mobimarche.collector.models.Valeur;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
public class LotDTO {
    @JsonIgnore
    private Integer id;
    private String description;
    private String lieuPrincipal;
    private List<ValeurDTO> valeursDTO;

}
