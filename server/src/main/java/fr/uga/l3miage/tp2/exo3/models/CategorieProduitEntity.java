package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class CategorieProduitEntity {
    @Id
    private Long id;
    private String nom;

    @ManyToMany
    private Set<ProduitEntity> produits;
}