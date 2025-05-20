package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.Annonce;
import com.marketingconfort.mobimarche.collector.models.Descripteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescripteurRepository extends JpaRepository<Descripteur, Integer> {

}
