package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.Tender;
import com.marketingconfort.mobimarche.collector.models.TypeAvis;
import com.marketingconfort.mobimarche.collector.models.TypeMarche;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TypeAvisRepository extends JpaRepository<TypeAvis, Integer> {

    List<TypeAvis> findAll();
    Optional<TypeAvis> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    TypeAvis save(TypeAvis typeAvis);
    void deleteById(Integer id);
    void delete(TypeAvis typeAvis);
    void deleteAll(Iterable<? extends TypeAvis> typeAvis);
    void deleteAll();


}
