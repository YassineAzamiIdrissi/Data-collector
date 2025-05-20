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
public class Annonce {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "announce")
    private String annonce;

    @ManyToOne
    private Tender tender;
}
