package tn.esprit.mehdikaouech.entites;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Abonement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numAbo;
    private LocalDate dateDeb ;
    private LocalDate dateFin ;
    private Float prixAbo ;
    private TypeAbo typeAbo ;

    @OneToOne
    private Skieur  Skieur ;

}
