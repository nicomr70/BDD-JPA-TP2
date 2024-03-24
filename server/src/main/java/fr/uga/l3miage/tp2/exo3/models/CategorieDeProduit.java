package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "categorie_produit")
public class CategorieDeProduit {
    @Id
    Long id;

    String nom;

    @OneToMany(mappedBy = "categorie")
    Set<Produit> produits;
}
