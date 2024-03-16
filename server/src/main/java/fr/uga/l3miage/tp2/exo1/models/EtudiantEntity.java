package fr.uga.l3miage.tp2.exo1.models;

import java.util.Set;

import javax.persistence.*;

public class EtudiantEntity {
    @Id
    private Long id;

    private String nom;
    private String description;

    @ManyToMany(mappedBy = "etudiants")
    private Set<ClubSportifEntity> clubSportifs;
}