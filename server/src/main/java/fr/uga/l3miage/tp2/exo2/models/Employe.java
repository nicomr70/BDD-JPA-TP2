package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employe {
    @Id
    private Long id;

    private String email;

    private Double salaire;
}
