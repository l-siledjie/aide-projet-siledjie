package com.gestion.intervention_projet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "utilisateur_role")
public class UserRole {
    @Id
    private Long code_utilisateur;
    @Id
    private Long code_role;


}
