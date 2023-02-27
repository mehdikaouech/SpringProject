package tn.esprit.mehdikaouech.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long numPiste ;
    private String nomPiste ;
    @Enumerated(EnumType.STRING)
    private Couleur couleur ;
    private Integer longeur ;
    private Integer pente ;
    @JsonIgnore
    @ManyToMany(mappedBy = "pistes",cascade=CascadeType.REMOVE)
    private List<Skieur> skieurs;

}
