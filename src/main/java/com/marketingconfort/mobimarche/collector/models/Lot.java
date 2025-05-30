package com.marketingconfort.mobimarche.collector.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Lot")
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String lieuPrincipal;

    @OneToMany(mappedBy = "lot")
    private List<Valeur> valeurs;

    @ManyToOne
    @JoinColumn(name = "tender_id")
    private Tender tender;
}
