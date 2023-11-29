package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.ChamberType;
import tn.esprit.firstproject.entities.Chambre;

import java.util.List;

public interface IBloc {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
    public List<Chambre> getChambresParBlocEtType (long idBloc, ChamberType typeC) ;
    public List<Bloc> getByIdUniv(Long iduniversite);

}
