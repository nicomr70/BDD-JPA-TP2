package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Commande")
public class CommandeEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private Date date;
    @Column(name = "montantTotal")
    private double montantTotal;
    @ManyToOne
    private ClientEntity client;
    @OneToMany
    private Set<ProduitEntity> produits;
}
