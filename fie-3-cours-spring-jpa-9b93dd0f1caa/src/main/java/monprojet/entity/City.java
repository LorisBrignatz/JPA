package monprojet.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class City {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Identifiant métier (code ISO)
    @Column(unique=true)
    @NonNull
    private String name;

    @Column(unique=true)
    @NonNull
    private int population;

    @NonNull
    @ManyToOne(optional = false)// obligatoire, la clé étrangère ne doit pas être nulle
    private Country country;
}
