package fr.uga.l3miage.tp2.exo1.moduls;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    private Long id;

    private String nom;

    private String description;

    @ManyToMany()
    private Set<ClubSportif> clubSportifs;
}
