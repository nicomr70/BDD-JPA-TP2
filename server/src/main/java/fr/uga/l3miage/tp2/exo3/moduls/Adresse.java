package fr.uga.l3miage.tp2.exo3.moduls;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresse {
    @Id
    private Long id;

    private String rue;

    private String numero;

    private String codePostal;

    private String ville;
}
