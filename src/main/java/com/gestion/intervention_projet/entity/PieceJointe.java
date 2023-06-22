package com.gestion.intervention_projet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "piecejointe")
public class PieceJointe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiece;

    private String typePiece;
    private int taillePiece;
    private Date dateCreation;
    private Date dateModif;

    @ManyToOne
    @JoinColumn(name = "NUMERO_intervention")
    private Intervention intervention;
}
