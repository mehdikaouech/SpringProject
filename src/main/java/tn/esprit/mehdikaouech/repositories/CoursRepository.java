package tn.esprit.mehdikaouech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mehdikaouech.entites.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}