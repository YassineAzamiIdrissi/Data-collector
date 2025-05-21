package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.Descripteur;
import com.marketingconfort.mobimarche.collector.models.Lot;
import com.marketingconfort.mobimarche.collector.models.Tender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LotRepository extends JpaRepository<Lot, Integer> {

    List<Lot> findAll();
    Optional<Lot> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    Lot save(Lot lot);
    void deleteById(Integer id);
    void delete(Lot lot);
    void deleteAll(Iterable<? extends Lot> lot);
    void deleteAll();


}
