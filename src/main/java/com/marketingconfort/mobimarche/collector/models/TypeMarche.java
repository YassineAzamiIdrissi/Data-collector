package com.marketingconfort.mobimarche.collector.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class TypeMarche {
    @Id
    @GeneratedValue
    private Integer id;
    private String typeMarche;

    @ManyToOne
    private Tender tender;
}
