package fr.uga.l3miage.tp2.exo1.moduls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class ClubSportif {
    @Id
    private Long agalan;

    private String nom;

    private String email;

    @ManyToMany(mappedBy = "clubSportifs")
    private Set<Etudiant> etudiants;
}
