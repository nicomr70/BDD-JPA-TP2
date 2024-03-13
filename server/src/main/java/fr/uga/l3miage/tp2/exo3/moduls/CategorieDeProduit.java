package fr.uga.l3miage.tp2.exo3.moduls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CategorieDeProduit {
    @Id
    private Long id;

    private String nom;

    @ManyToOne
    private Produit produit;
}
