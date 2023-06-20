package com.gestion.intervention_projet.controller;

import com.gestion.intervention_projet.repository.CompteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PersonnelController {
    private CompteRepository compteRepository;
    @GetMapping("/indexP")
    public void accueilP() {

    }
}
