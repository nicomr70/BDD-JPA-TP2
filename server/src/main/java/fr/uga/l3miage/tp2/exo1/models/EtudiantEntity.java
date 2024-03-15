package fr.uga.l3miage.tp2.exo1.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Etudiant")
public class EtudiantEntity {

    @Id
    @Column(name = "agalan")
    private Long agalan;


    @Column(name = "nom")
    private String nom;

    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "etudiants")
    private Set<ClubSportif> clubs;
}
