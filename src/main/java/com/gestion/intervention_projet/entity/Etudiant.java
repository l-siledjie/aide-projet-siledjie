package com.gestion.intervention_projet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column(name = "code_authentification")
    private Long codeAut;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "nom")
    private String nomE;

    @Column(name = "prenom")
    private String prenomE;

    @Column(name = "email")
    private String emailE;

    @Column(name = "telephone")
    private Long telE;

    @Column(name = "filiere")
    private String filiere;

//    @OneToOne(mappedBy = "etudiant", fetch = FetchType.LAZY)
//    private List<Compte> comptes_l;
}
