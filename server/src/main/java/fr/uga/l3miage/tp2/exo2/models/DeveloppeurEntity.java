package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("D")

public class DeveloppeurEntity {
    @Id
    private String langagePrefere ;
    private String niveauCompetence ;
}
