package tn.esprit.mehdikaouech.entites;

import javax.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numInscription ;
    private Integer numSemaine ;

    @ManyToOne
    Skieur skieur;
    @ManyToOne
    private Cours Cours ;
}
