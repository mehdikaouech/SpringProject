package tn.esprit.mehdikaouech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mehdikaouech.entites.Piste;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}