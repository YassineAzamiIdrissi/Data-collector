package com.marketingconfort.mobimarche.collector.repositories;

import com.marketingconfort.mobimarche.collector.models.TypeMarche;
import com.marketingconfort.mobimarche.collector.models.Valeur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ValeurRepository extends JpaRepository<Valeur, Integer>
{

    List<Valeur> findAll();
    Optional<Valeur> findById(Integer id);
    boolean existsById(Integer id);
    long count();
    Valeur save(Valeur valeur);
    void deleteById(Integer id);
    void delete(Valeur valeur);
    void deleteAll(Iterable<? extends Valeur> valeur);
    void deleteAll();

}
