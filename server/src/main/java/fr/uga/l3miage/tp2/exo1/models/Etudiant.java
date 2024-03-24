package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
class Etudiant {
    @Id
    private Long agalan;
    private String nom;
    private String email;
    @ManyToMany(mappedBy = "etudiants")
    private Set<ClubSportif>clubs;
}
