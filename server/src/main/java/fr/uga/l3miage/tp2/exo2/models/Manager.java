package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "managers")
@DiscriminatorValue("Manager")
public class Manager extends Employe {
    @Column(name = "niveau_gestion")
    String niveauGestion;
}
