package tn.esprit.mehdikaouech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mehdikaouech.entites.Abonement;
import tn.esprit.mehdikaouech.entites.Skieur;
import tn.esprit.mehdikaouech.services.IAbonemmentService;

import java.util.List;

@RequestMapping("/Abonnement")
@RestController


public class AbonnementController {

    @Autowired
    private IAbonemmentService iAbonemmentService ;

    @PostMapping
    public void add(@RequestBody Abonement s) {
        iAbonemmentService.add(s);
    }

    @PutMapping
    public Abonement update(@RequestBody Abonement s) {
        return iAbonemmentService.update(s);

    }
    //pathVariable : optionnel pour connaitre que l id = numAbo
    @GetMapping("/{id}")
    public Abonement getAbonnement(@PathVariable(value = "id") Long numAbo) {
        return this.iAbonemmentService.getAbonemment(numAbo);
    }
//pathVariable : optionnel pour connaitre que l id = numAbo
    @GetMapping
    public List<Abonement> getAllAbonnement() {
        return iAbonemmentService.getAllAbonement();
    }


    @DeleteMapping
    public void remove(@PathVariable long id){
        iAbonemmentService.removeAbonement(id);

    }
}
