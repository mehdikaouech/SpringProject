package tn.esprit.mehdikaouech.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mehdikaouech.entites.Skieur;
import tn.esprit.mehdikaouech.services.ISkieurService;
import tn.esprit.mehdikaouech.services.ISkieurServiceIMP;

import java.util.List;

@RequestMapping("/Skieurs")
@RestController

public class SkieurController {

    @Autowired
    private ISkieurService iSkieurService;


    @PostMapping
    public void add(@RequestBody Skieur s) {
        iSkieurService.add(s);
    }

    @PutMapping
    public Skieur update(@RequestBody Skieur s) {
        return iSkieurService.update(s);

    }

    @GetMapping("/{id}")
    public Skieur getSkieur(@PathVariable(value = "id") Long numSkieur) {
        return this.iSkieurService.getSkieur(numSkieur);
    }

    @GetMapping
    public List<Skieur> getAllSkieur() {
        return iSkieurService.getAllSkieur();
    }

    @DeleteMapping
    public void remove(@PathVariable long id){
        iSkieurService.removeSkieur(id);

}
    @PutMapping("/{numSkieur}/{numPiste}")
    public Skieur skieurtopiste(@PathVariable long numSkieur, @PathVariable long numPiste){



        return iSkieurService.skieurtopiste(numSkieur,numPiste);

    }

}
