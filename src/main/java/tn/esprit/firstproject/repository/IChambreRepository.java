package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.ChamberType;
import tn.esprit.firstproject.entities.Chambre;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre, Long> {
 //   Chambre indChamberByNumchambres(Long C);
   // Long Count() ;
   // List<Chambre> findAllByChambretype(ChamberType ct) ;



}
