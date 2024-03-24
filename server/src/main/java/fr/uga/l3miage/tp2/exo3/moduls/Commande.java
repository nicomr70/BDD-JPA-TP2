package fr.uga.l3miage.tp2.exo3.moduls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
public class Commande {
    @Id
    private Long id;

    private Date date;

    private double montantTotal;

    @ManyToOne
    private Client client;

    @OneToMany
    private Set<Produit> produits;
}
