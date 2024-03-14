package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    Long id;

    String nom;

    String email;

    @OneToMany(mappedBy = "client")
    Set<Commande> commandes;

    @OneToOne
    Adresse adresse;
}
