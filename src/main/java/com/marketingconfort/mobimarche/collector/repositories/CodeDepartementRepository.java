package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.CodeDepartement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CodeDepartementRepository extends JpaRepository<CodeDepartement, Integer> {

    List<CodeDepartement> findAll();
    Optional<CodeDepartement> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    CodeDepartement save(CodeDepartement codeDepartement);
    void deleteById(Integer id);
    void delete(CodeDepartement codeDepartement);
    void deleteAll(Iterable<? extends CodeDepartement> codeDepartements);
    void deleteAll();

}
