package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="developer_miage")
public class DevelopperMiage {
    @Id
    private String lastname;
    private String firstname;
    private String email;

    @ManyToMany(mappedBy="developpers")
    private Set<ProjetEntity> projets;
}
