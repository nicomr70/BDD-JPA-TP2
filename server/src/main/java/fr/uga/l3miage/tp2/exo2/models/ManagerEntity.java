package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("M")

public class ManagerEntity extends EmployeEntity {
    @Id
    private String niveauGestion ;
}
