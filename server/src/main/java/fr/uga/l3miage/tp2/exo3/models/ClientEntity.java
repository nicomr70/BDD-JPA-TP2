package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class ClientEntity {
    @Id
    private Long id ;
    private String nom ;
    private String email ;
    @OneToMany
    private Set<CommandeEntity> commandes ;
    @OneToOne(mappedBy = "client")
    private AdresseEntity adresse ;
}
