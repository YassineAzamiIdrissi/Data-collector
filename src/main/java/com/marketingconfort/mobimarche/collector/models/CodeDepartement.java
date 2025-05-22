package com.marketingconfort.mobimarche.collector.models;

import jakarta.persistence.*;
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
@Table(name = "CodeDepartement")
public class CodeDepartement {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String codeDepartement;

    @ManyToOne
    @JoinColumn(name = "tender_id")
    private Tender tender;

    public CodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }
}
