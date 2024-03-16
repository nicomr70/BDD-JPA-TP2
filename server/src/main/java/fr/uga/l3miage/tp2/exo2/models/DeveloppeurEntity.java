package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("dev")
public class DeveloppeurEntity extends EmployeEntity{
    private String langagePrefere;
    private String niveauCompentence;
}