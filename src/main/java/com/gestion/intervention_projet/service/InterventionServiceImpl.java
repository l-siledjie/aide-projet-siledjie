package com.gestion.intervention_projet.service;

import com.gestion.intervention_projet.entity.Intervention;
import com.gestion.intervention_projet.repository.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class InterventionServiceImpl implements InterventionService{
    @Autowired
    private InterventionRepository interventionsRepository;
    @Override
    public List<Intervention> getAllIntervention() {
        return  interventionsRepository.findAll();
    }

    @Override
    public void save(Intervention intervention) {

    }

    @Override
    public Intervention getById(Long id_interventions) {
        Optional<Intervention> optional = interventionsRepository.findById(id_interventions);
        Intervention intervention = null;
        if (optional.isPresent())
            intervention = optional.get();
        else
            throw new RuntimeException(
                    "intervention not found for id : " + id_interventions);
        return intervention;

    }

    @Override
    public void deleteViaId(long id_interventions) {
        interventionsRepository.deleteById(id_interventions);

    }
}
