package fr.uga.l3miage.tp2.exo2.models;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EmployeEntity {
    @Id
    @Column(
            name = "id"
    )
    private Long idEmploye ;


    @Column(
            name = "nom"
    )
    private String nom;


    @Column(
            name = "email"
    )
    private String emailEmploye;

    @Column(
            name = "salaire"
    )
    private double salaireEmploye;
}
