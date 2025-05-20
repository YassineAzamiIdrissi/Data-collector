package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.TypeAvis;
import com.marketingconfort.mobimarche.collector.models.TypeMarche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeMarcheRepository extends JpaRepository<TypeMarche, Integer> {

}
