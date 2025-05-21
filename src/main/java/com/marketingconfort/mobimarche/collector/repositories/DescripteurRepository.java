package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.CodeDepartement;
import com.marketingconfort.mobimarche.collector.models.Descripteur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DescripteurRepository extends JpaRepository<Descripteur, Integer> {

    List<Descripteur> findAll();
    Optional<Descripteur> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    Descripteur save(Descripteur descripteur);
    void deleteById(Integer id);
    void delete(Descripteur descripteur);
    void deleteAll(Iterable<? extends Descripteur> descripteur);
    void deleteAll();


}
