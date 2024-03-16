package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Client")
public class ClientEntity {

    @Id
    @Column(
            name = "id"
    )
    private Long id;

    @Column(
            name = "nom"
    )
    private String nom;

    @Column(
            name = "email"
    )
    private String email;


    @OneToMany(mappedBy = "client_id")
    private Set<CommandeEntity> commandes;

    @OneToOne
    private AdresseEntity adresse_id;
}
