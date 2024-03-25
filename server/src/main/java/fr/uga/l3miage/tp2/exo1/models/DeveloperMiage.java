package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class DeveloperMiage {

    @Id
    private String lastname;

    private String firstname;

    private String email;

    @ManyToMany(mappedBy = "developers")
    private Set<Projet> Projets;

}
