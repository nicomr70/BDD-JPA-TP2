package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Entity;

@Entity
class DevEntity extends EmployeEntity {
    private String langagePrefere;
    private String niveauCompetence;
}
