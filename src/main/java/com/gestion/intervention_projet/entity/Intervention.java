package com.gestion.intervention_projet.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "intervention")
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInter;

    private Date date_creation;
    private Boolean statut;
    private String nomInter;

    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "intervention", fetch = FetchType.LAZY)
    private List<PieceJointe> pieceJointes;

    @ManyToOne
    @JoinColumn(name = "CODE_Etudiant")
    private Etudiant etudiant;
}
