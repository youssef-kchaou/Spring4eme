package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Foyer;
@Repository
public interface IFoyerRepository extends JpaRepository<Foyer, Long> {
    Foyer findAllByCapcipteFoyerGreaterThan(long capacite) ;
}
