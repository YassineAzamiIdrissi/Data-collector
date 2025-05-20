package com.marketingconfort.mobimarche.collector.dto;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
public class TypeAvisDTO {
    private Integer id;
    private String typeAvis;
}
