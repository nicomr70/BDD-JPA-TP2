package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "developpeurs")
@DiscriminatorValue("Developpeur")
public class Developpeur extends Employe {
    @Column(name = "langage_prefere")
    String langagePrefere;

    @Column(name = "niveau_competence")
    String niveauCompetence;
}
