package com.gestion.intervention_projet.controller;

import com.gestion.intervention_projet.entity.Etudiant;
import com.gestion.intervention_projet.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@AllArgsConstructor
public class EtudiantController {
    private EtudiantRepository studRepository;
    @GetMapping("/indexE")
    public void accueilE() {

    }
}
