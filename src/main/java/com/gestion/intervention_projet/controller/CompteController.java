package com.gestion.intervention_projet.controller;

import com.gestion.intervention_projet.entity.Compte;
import com.gestion.intervention_projet.repository.CompteRepository;
import com.gestion.intervention_projet.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/compte")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class CompteController {

    @Autowired
    private CompteRepository compteRepository;

    @PostMapping("http://localhost:8087/compte/login")
    public ResponseEntity<Compte>   userLogin(@RequestBody Compte compteData)   {

        Compte compte = new Compte();
            compteRepository.findById(compteData.getId());
        if(compte.getMdp().equals(compteData.getMdp()))
            return ResponseEntity.ok(compte);

        return  (ResponseEntity<Compte>) ResponseEntity.internalServerError();
    }

    @PostMapping("http://localhost:8087/compte/login-pro")
    public ResponseEntity<Compte>    proLogin(@RequestBody Compte comptePro) {
        Compte compte = new Compte();
            compteRepository.findById(comptePro.getId());
        if(compte.getMdp().equals(comptePro.getMdp()))
            return ResponseEntity.ok(compte);

        return (ResponseEntity<Compte>) ResponseEntity.internalServerError();
    }
}
