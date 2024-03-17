package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "projet")
public class ProjectEntity {
    @Id
    private Long id;

    private String name;

    private String description;

    @ManyToMany
    private Set<developerEntity> developers;
}
