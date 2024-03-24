package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;



    @Entity
    public class ProduitEntity{
        @Id
        private Long id;
        private String nom;
        private double prix;
        private int quantite;

        @ManyToMany(mappedBy = "produits")
        private Set<CategorieProduitEntity> categorieProduits;


    }
