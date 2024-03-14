package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "produits")
public class Produit {
    @Id
    Long id;

    String nom;

    Double prix;

    Integer quantite;

    @ManyToOne
    CategorieDeProduit categorie;
}
