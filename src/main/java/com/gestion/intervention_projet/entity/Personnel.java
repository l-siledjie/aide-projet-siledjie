package com.gestion.intervention_projet.entity;

import com.gestion.intervention_projet.group.Departement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "utilisateur")
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Long idP;

    @Column(name = "nom")
    private String nomP;

    @Column(name = "prenom")
    private String prenomP;

    @Column(name = "email")
    private String emailP;

    @Column(name = "telephone")
    private Long telP;

    @Column(name = "postes")
    private String poste;
    private Departement departement;
}
