package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clubs_sportifs")
public class ClubSportif {
    @Id
    Long id;

    String nom;

    String description;

    @ManyToMany
    @JoinTable(
            name = "etudiant_club_sportif",
            joinColumns = @JoinColumn(name = "etudiant_agalan"),
            inverseJoinColumns = @JoinColumn(name = "club_id")
    )
    Set<Etudiant> etudiants;
}
