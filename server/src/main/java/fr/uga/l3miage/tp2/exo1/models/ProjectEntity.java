package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.math.BigInteger;
import java.util.Set;

@Entity
class ProjectEntity {
    @Id
    private BigInteger id;
    private String name;
    private String description;
    @ManyToMany
    private Set<DeveloperMiageEntity>developpeurs;
}
