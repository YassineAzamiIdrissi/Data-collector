package com.marketingconfort.mobimarche.collector.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class CodeDepartement {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String codeDepartement;

    @ManyToOne
    private Tender tender;
}
