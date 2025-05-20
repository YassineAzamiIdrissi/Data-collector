package com.marketingconfort.mobimarche.collector.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
@Data
@Entity
public  class AvisPrecedent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter  @Setter
    String numeroAnnonce ;
    @Getter @Setter
    String numeroParution ;
    @Getter @Setter
    String typeParution ;
    @Getter @Setter
    String dateParution ;
    @Getter @Setter
    String annee;
    @Getter  @Setter
    String annonceRef;
}

