package fr.uga.l3miage.tp2.exo2.moduls;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type")
public abstract class Employe {
    @Id
    private Long id;

    private String nom;

    private String email;

    private double salaire;
}
