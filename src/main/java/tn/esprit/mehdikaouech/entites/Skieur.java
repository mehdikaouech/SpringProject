package tn.esprit.mehdikaouech.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numSkieur ;
    private String nomS ;
    private String prenom ;
    private LocalDate dateNaissance ;
    private String ville  ;

    @ManyToMany
    private List<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    List<Inscription> inscription;

    @OneToOne
    Abonement abonement;
}
