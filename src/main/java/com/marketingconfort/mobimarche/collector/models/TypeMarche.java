package com.marketingconfort.mobimarche.collector.models;

import jakarta.persistence.*;
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
    @Column(name = "marketType")
    private String typeMarche;

    @ManyToOne
    @JoinColumn(name = "tender_id")
    private Tender tender;
}
