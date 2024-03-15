package fr.uga.l3miage.tp2.exo3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
class CategorieProduit {
    @Id
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "categorieDeProduit")
    private Set<Produit> produits;
}
