package fr.uga.l3miage.tp2.exo2.models;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("developpeur")
public class DeveloppeurEntity extends EmployeEntity {
    @Column(name = "langagePrefere")
    private String langagePrefere;

    @Column(name = "niveauCompetence")
    private String niveauCompetence;

}
