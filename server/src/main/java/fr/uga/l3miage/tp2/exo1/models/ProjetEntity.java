package fr.uga.l3miage.tp2.exo1.models;

import java.math.BigInteger;
import java.util.*;

import javax.persistence.*;

@Table(name = "projet")
@Entity
public class ProjetEntity {

    @Id
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "projets")
    private Set<DevelopperEntity> developers;
}