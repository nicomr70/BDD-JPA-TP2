package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "etudiants")
public class Etudiant {
    @Id
    Long agalan;

    String nom;

    String email;

    @ManyToMany(mappedBy = "etudiants")
    Set<ClubSportif> clubs;
}
