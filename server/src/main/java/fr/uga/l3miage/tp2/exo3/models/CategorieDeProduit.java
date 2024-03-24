package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
public class CategorieDeProduit {
    @Id
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "categorieDeProduit")
    private Produit produit;
}
