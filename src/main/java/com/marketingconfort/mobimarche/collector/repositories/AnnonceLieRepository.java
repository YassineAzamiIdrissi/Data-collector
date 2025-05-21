package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.AnnonceLie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnnonceLieRepository extends JpaRepository<AnnonceLie, Integer> {

    List<AnnonceLie> findAll();
    Optional<AnnonceLie> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    AnnonceLie save(AnnonceLie annonceLie);                // pour insert ou update
    void deleteById(Integer id);
    void delete(AnnonceLie annonceLie);
    void deleteAll(Iterable<? extends AnnonceLie> annonceLies);
    void deleteAll();

}
