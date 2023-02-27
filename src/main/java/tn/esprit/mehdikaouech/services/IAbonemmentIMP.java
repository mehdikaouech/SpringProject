package tn.esprit.mehdikaouech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mehdikaouech.entites.Abonement;
import tn.esprit.mehdikaouech.entites.Skieur;
import tn.esprit.mehdikaouech.repositories.AbonementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IAbonemmentIMP implements IAbonemmentService{
    @Autowired
    private AbonementRepository abonementRepository ;


    @Override
    public Abonement getAbonemment(Long numAbo) {

        Optional<Abonement> abonement = Optional.of(this.abonementRepository.getReferenceById(numAbo));
        return abonement.orElse(null);

    }

    @Override
    public void add(Abonement a) {
        abonementRepository.save(a);
    }

    @Override
    public Abonement update(Abonement s) {

        return abonementRepository.save(s);
    }

    @Override
    public List<Abonement> getAllAbonement() {
        return abonementRepository.findAll();

    }

    @Override
    public void removeAbonement(Long numAbo) {
        abonementRepository.deleteById(numAbo);
    }
}
