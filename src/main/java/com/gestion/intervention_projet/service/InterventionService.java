package com.gestion.intervention_projet.service;

import com.gestion.intervention_projet.entity.Intervention;

import java.util.List;

public interface InterventionService {
    List<Intervention> getAllIntervention();
    void save(Intervention intervention);
    Intervention getById(Long id_interventions);
    void deleteViaId(long id_interventions);
}
