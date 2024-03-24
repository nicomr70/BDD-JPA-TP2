package fr.uga.l3miage.tp2.exo3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
class Produit {
    @Id
    private Long id;
    private String nom;
    private Double prix;
    private Integer quantite;
    @ManyToOne
    private CategorieProduit categorieDeProduit;
    @ManyToOne
    private Commande commande;
}
