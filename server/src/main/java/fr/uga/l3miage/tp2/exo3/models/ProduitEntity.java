package fr.uga.l3miage.tp2.exo3.models;

import fr.uga.l3miage.tp2.exo3.models.CategorieDeProduitEntity;
import fr.uga.l3miage.tp2.exo3.models.CommandeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "produit")
public class ProduitEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prix")
    private Double prix;
    @Column(name = "quantite")
    private Integer quantite;
    @ManyToOne
    private CommandeEntity commande;
    @ManyToMany(mappedBy = "produits")
    private Set<CategorieDeProduitEntity> categorieDeProduits;
}
