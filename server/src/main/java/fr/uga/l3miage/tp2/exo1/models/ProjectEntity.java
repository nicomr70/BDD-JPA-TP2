package fr.uga.l3miage.tp2.exo1.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @Column(name = "id")
    private Long id;


    @Column(name = "name")
    private String name;


    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "project")
    private Set<DeveloperEntity> lastname;
}
