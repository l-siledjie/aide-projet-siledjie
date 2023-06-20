package com.gestion.intervention_projet.repository;

import com.gestion.intervention_projet.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
}
