package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role", discriminatorType = DiscriminatorType.STRING)
public class Employe {
    @Id
    Long id;

    String nom;

    String email;

    Double salaire;
}
