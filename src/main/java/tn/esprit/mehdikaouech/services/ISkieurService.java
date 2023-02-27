package tn.esprit.mehdikaouech.services;

import tn.esprit.mehdikaouech.entites.Skieur;

import java.util.List;

public interface ISkieurService {
    public Skieur getSkieur(Long numSkieur);

    public void add(Skieur s);

    public Skieur update(Skieur s);

    public List<Skieur> getAllSkieur();

    public void removeSkieur(Long numSkieur);

    public void removeSkieufhyfhygtfhyr(Long numSkieur);


    Skieur skieurtopiste(Long numSkieur, Long numPiste);
}
