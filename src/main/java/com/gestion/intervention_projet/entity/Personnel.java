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
@Table(name = "staff")
public class Personnel {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idPersonnel")
    private Long idP;

    @Column(name = "nomPersonnel")
    private String nomP;

    @Column(name = "prenomPersonnel")
    private String prenomP;

    @Column(name = "emailPersonnel")
    private String emailP;

    @Column(name = "telPersonnel")
    private Long telP;

    @Column(name = "postes")
    private String poste;
    private Departement departement;
}
