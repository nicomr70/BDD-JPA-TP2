package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CategorieProduitEntity {
    @Id
    private Long id;
    private String nom;

    @ManyToOne
    private ProduitEntity produit;
}