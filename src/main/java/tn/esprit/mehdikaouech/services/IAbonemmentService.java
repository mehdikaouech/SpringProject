package tn.esprit.mehdikaouech.services;

import tn.esprit.mehdikaouech.entites.Abonement;
import tn.esprit.mehdikaouech.entites.Skieur;

import java.util.List;

public interface IAbonemmentService {

    public Abonement getAbonemment(Long numSkieur);

    public void add(Abonement a);

    public Abonement update(Abonement s);

    public List<Abonement> getAllAbonement();

    public void removeAbonement(Long Abonement);



}
