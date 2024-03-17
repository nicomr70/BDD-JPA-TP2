package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Entity;

@Entity
public class DeveloppeurEntity extends EmployeEntity {
    private String languagePrefere;

    private String niveauCompetence;
}
