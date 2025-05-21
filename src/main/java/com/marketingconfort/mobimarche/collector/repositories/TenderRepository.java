package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.AnnonceLie;
import com.marketingconfort.mobimarche.collector.models.Tender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TenderRepository extends JpaRepository<Tender, Integer>
{
    List<Tender> findAll();
    Optional<Tender> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    Tender save(Tender tender);
    void deleteById(Integer id);
    void delete(Tender tender);
    void deleteAll(Iterable<? extends Tender> tenders);
    void deleteAll();


}
