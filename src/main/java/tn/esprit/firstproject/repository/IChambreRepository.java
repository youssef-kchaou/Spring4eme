package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.ChamberType;
import tn.esprit.firstproject.entities.Chambre;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre, Long> {
 //   Chambre indChamberByNumchambres(Long C);
   // Long Count() ;
   // List<Chambre> findAllByChambretype(ChamberType ct) ;
 @Query("select Chambre  from Chambre c where c.typeC=:typeChambre and c.bloc.idBloc=:idBloc")
 List<Chambre> findByBlocIdBlocAndTypeChambreJPQL(@Param("idBloc")  long idBloc, @Param("typeChambre") ChamberType typeChambre);
 List<Chambre> findChambreByBlocIdBlocAndTypeC(Long idBloc, ChamberType typechambre);




}
