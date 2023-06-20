package com.gestion.intervention_projet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comptes")
public class Compte {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompte")
    private String id;

    @Column(name = "password")
    private String mdp;

    public String login()   {
        return null;
    }
}
