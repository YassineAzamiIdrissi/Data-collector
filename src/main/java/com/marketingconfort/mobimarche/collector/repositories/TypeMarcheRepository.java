package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.Tender;
import com.marketingconfort.mobimarche.collector.models.TypeAvis;
import com.marketingconfort.mobimarche.collector.models.TypeMarche;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TypeMarcheRepository extends JpaRepository<TypeMarche, Integer> {

    List<TypeMarche> findAll();
    Optional<TypeMarche> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    TypeMarche save(TypeMarche typeMarche);
    void deleteById(Integer id);
    void delete(TypeMarche typeMarche);
    void deleteAll(Iterable<? extends TypeMarche> typeMarche);
    void deleteAll();


}
