package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
public class Produit {
    @Id
    private Long id;
    private String nom;
    private Double prix;
    private Integer quantite;

    @ManyToOne
    private Commande commande;

    @ManyToOne
    private CategorieDeProduit categorieDeProduit;
}
