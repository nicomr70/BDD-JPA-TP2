package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class CategorieDeProduit {
    @Id
    private Long Id;

    private String nom;

    @OneToMany(mappedBy = "categorie")
    private Set<Produit> produits;
}
