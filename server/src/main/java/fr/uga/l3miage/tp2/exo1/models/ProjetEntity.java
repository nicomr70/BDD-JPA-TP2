package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Entity
@Table(name = "projet")
public class ProjetEntity {
    @Id
    BigInteger id;

    String name;

    String description;

    @ManyToMany
    @JoinTable(
            name = "developer_miage_project",
            joinColumns = @JoinColumn(name = "developer_lastname"),
            inverseJoinColumns = @JoinColumn(name = "projet_id")
    )
    Set<DeveloperMiageEntity> developers;
}
