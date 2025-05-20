package com.marketingconfort.mobimarche.collector.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TypeAvis {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    @Column(name = "noticeType")
    private String typeAvis;

    @ManyToOne
    @JoinColumn(name = "tender_id")
    private Tender tender;
}
