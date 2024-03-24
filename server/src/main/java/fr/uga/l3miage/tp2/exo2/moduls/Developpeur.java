package fr.uga.l3miage.tp2.exo2.moduls;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class Developpeur extends Employe{
    private String langagePrefere;
    private String niveauCompetence;
}
