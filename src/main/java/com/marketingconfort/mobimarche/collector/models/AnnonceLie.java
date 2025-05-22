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
@Table(name = "AnnonceLie")
public class AnnonceLie {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    @Column(name = "announce")
    private String annonce;

    @ManyToOne
    @JoinColumn(name = "tender_id")
    private Tender tender;

    public AnnonceLie(String annonce) {
        this.annonce = annonce;
    }
}
