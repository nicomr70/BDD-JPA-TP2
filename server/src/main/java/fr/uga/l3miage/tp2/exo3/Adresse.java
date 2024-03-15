package fr.uga.l3miage.tp2.exo3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
class Adresse {
    @Id
    private Long id;
    private String rue;
    private String numero;
    private String codePostal;
    private String Ville;
    @OneToOne(mappedBy = "adresse")
    private Client client;
}
