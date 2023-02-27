package tn.esprit.mehdikaouech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mehdikaouech.entites.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}