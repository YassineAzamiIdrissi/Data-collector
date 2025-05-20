package com.marketingconfort.mobimarche.collector.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TypeAvis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "noticeType")
    private String typeAvis;

    @ManyToOne
    private Tender tender;
}
