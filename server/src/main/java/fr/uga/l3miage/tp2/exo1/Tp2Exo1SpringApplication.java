package fr.uga.l3miage.tp2.exo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Correspond au main de l'application et donc ce qui va la lancer
 * Les Annotations :
 * <ul>
 *     <li>{@link SpringBootApplication} permet de dire à spring que cette classe est le run de l'application</li>
 * </ul>
 */
@SpringBootApplication
public class
Tp2Exo1SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp2Exo1SpringApplication.class,args);
    }
}
