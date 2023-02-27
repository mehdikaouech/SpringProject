package tn.esprit.mehdikaouech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.mehdikaouech.entites.Piste;
import tn.esprit.mehdikaouech.entites.Skieur;
import tn.esprit.mehdikaouech.repositories.PisteRepository;
import tn.esprit.mehdikaouech.repositories.SkieurRepository;

import java.util.List;
import java.util.Optional;

@Service//instance de la classe dans le spring context
public class ISkieurServiceIMP implements ISkieurService {
    @Autowired //injecter les dependance(instance)pour tous les attributs
    private SkieurRepository skieurRepository;
    @Autowired
    private PisteRepository pisteRepository;

    @Override
    public Skieur getSkieur(Long numSkieur) {
        Optional<Skieur> Skieur = Optional.of(this.skieurRepository.getReferenceById(numSkieur));
        return Skieur.orElse(null);
    }

    @Override
    public void add(Skieur s) {
         skieurRepository.save(s);
    }

    @Override
    public Skieur update(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public void removeSkieufhyfhygtfhyr(Long numSkieur) {

    }

    @Override
    public Skieur skieurtopiste(Long numSkieur, Long numPiste) {

        //1) recuperation des objet

        Skieur skieur =skieurRepository.findById(numSkieur).orElse(null) ;
        //  Assert permet de verifier si l objet null ou non
        Assert.notNull(skieur,"Skieur not found");
        Piste piste=pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste,"Skieur not found");

        if(skieur !=null && piste!= null) {

            /*
            //traitement pour ajouter une piste a la liste des piste de skieur
            List<Piste> pistes = skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes); */

            skieur.getPistes().add(piste);

            // save
        }
        return skieurRepository.save(skieur);

    }
}
