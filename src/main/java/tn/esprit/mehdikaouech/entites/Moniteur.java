package tn.esprit.mehdikaouech.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numMoniteur ;
    private String nomM ;
    private TypeCours PrenomP ;
    private LocalDate dateRecu ;


}
