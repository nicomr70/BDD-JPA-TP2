package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
public class AdresseEntity {

    @Id
    private Long id;
    private String rue;
    private String numero;
    private String codePostal;
    private String ville;

}
