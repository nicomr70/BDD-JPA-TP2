package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
class ClubSportif {
    @Id
    private Long id;
    private String nom;
    private String description;
    @ManyToMany
    private Set<Etudiant>etudiants;
}
