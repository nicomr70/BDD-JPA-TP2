package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "role")
public abstract class EmployeEntity {

    @Id
    private Long id;
    private String nom;
    private String email;
    private double salaire;
}