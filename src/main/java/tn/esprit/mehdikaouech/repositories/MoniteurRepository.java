package tn.esprit.mehdikaouech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mehdikaouech.entites.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}