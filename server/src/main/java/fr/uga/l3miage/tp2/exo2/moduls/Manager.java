package fr.uga.l3miage.tp2.exo2.moduls;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Manager extends Employe{
    private String niveauGestion;
}
