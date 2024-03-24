package fr.uga.l3miage.tp2.exo1.moduls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.math.BigInteger;
import java.util.Set;

@Entity
public class Projet {
    @Id
    private BigInteger id;

    private String name;

    private String description;

    @ManyToMany(mappedBy = "projets")
    private Set<DeveloperMiage> developerMiage;


}
