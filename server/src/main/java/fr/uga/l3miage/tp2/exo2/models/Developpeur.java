package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class Developpeur extends Employe {
    @Column(name = "langagePrefere")
    private String langagePrefere;
    @Column(name = "niveauCompetence")
    private String niveauCompetence;
}
