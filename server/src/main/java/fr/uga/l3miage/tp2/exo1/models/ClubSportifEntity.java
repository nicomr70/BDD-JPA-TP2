package fr.uga.l3miage.tp2.exo1.models;

import java.util.Set;

import javax.persistence.*;

public class ClubSportifEntity {

    @Id
    private Long agalan;

    private String nom;
    private String email;

    @ManyToMany
    private Set<EtudiantEntity> etudiants;
}