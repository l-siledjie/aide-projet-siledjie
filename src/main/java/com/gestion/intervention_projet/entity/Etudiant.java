package com.gestion.intervention_projet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etudiants")
public class Etudiant {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "matricules")
    private String matricule;

    @Column(name = "nomEtudiant")
    private String nomE;

    @Column(name = "prenomEtudiant")
    private String prenomE;

    @Column(name = "emailEtudiant")
    private String emailE;

    @Column(name = "telEtudiant")
    private Long telE;

    @Column(name = "filieres")
    private String filiere;
}
