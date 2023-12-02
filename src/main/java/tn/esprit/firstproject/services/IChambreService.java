package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.ChamberType;
import tn.esprit.firstproject.entities.Chambre;

import java.util.List;

public interface IChambreService {
        public List<Chambre> retrieveAllChambres();
        public Chambre retrieveChambre(Long chambreId);
        public Chambre addChambre(Chambre c);
        public void removeChambre(Long chambreId);
        public Chambre modifyChambre(Chambre chambre);
        public Bloc affectBlocChambre(List<Long> idChambres, long idBloc);
        public List<Chambre> findByBlocIdBlocAndTypeChambreJPQL(long idBloc, ChamberType typeChambre);
        public List<Chambre> getChambreParTypeEtIdBloc(long idBloc, ChamberType typeChambre);

        public Chambre AddChambreReservationEtudiant(Chambre c);
}
