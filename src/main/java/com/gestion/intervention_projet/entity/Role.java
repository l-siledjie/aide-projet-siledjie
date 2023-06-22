package com.gestion.intervention_projet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "role")
public class Role {
    @Id
    private Long code;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private Collection<Intervention> interventions;
}
