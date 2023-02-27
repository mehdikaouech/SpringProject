package tn.esprit.mehdikaouech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mehdikaouech.entites.Abonement;

public interface AbonementRepository extends JpaRepository<Abonement, Long> {
}