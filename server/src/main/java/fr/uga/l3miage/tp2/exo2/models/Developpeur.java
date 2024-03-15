package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
public class Developpeur extends Employe {
    String langagePrefere;
    String niveauCompetence;
}
