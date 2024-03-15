package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("manager")
public class ManagerEntity extends EmployeEntity{
    @Column(name = "niveauGestion")
    private String niveauGestion;

}
