package tn.esprit.mehdikaouech.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long numCour;
    private Integer niveau ;
    @Enumerated
    private TypeCours typeCour ;
    @Enumerated
    private Support support ;
    private Integer creneau ;
    private Float prix ;

    @OneToMany
    private List<Moniteur> moniteurs ;
    @OneToMany(mappedBy="Cours")
    private List<Inscription> inscription ;


}
