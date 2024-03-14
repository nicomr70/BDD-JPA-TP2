package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "commandes")
public class Commande {
    @Id
    Long id;

    LocalDate date;

    @Column(name = "montant_total")
    Double montantTotal;

    @ManyToOne
    Client client;

    @OneToMany
    Set<Produit> produits;
}
