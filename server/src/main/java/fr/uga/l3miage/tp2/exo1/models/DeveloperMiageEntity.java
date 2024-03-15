package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
class DeveloperMiageEntity {
    @Id
    private String lastName;
    private String firstName;
    private String email;
    @ManyToMany(mappedBy = "developpeurs")
    private Set<ProjectEntity>projets;
}
