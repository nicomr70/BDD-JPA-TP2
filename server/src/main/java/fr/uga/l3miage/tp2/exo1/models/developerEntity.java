package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="developer_miage")
public class developerEntity {
    @Id
    private String lastName;

    private String firstName;

    private String email;

    @ManyToMany(mappedBy = "developers")
    private Set<ProjectEntity> projets;
}
