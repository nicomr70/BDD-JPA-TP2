package fr.uga.l3miage.tp2.exo1.moduls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class DeveloperMiage {
    @Id
    private String lastName;

    private String firstName;

    private String email;

    @ManyToMany
    @JoinColumn(name = "projets_id", referencedColumnName = "id")
    private Set<Projet> projets;
}
