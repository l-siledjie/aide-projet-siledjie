package com.gestion.intervention_projet.repository;

import com.gestion.intervention_projet.entity.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepository extends JpaRepository<Intervention,Long> {
}
