package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "adresses")
public class Adresse {
    @Id
    Long id;

    String rue;

    String numero;

    @Column(name = "code_postal")
    String codePostal;

    String ville;
}
