package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "categorie_de_produit")
public class CategorieDeProduitEntity {

    @Id
    @Column(
            name = "id"
    )
    private Long id;

    @Column(
            name = "nom"
    )
    private String nom;


    @ManyToOne
    private ProduitEntity produits;
}
