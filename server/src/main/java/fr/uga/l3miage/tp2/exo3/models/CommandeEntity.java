package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class CommandeEntity {
    @Id
    private Long id ;
    private double montantTotal ;
    @ManyToOne
    private ClientEntity client ;
    @OneToMany
    private Set<ProduitEntity> produits ;
}
