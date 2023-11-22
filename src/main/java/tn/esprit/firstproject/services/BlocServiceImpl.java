package tn.esprit.firstproject.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.ChamberType;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.repository.IBlocRepository;


import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class BlocServiceImpl implements IBloc{
    @Autowired
    IBlocRepository iBlocRepository ;

    @Scheduled(fixedRate = 60000)
    @Override
    public List<Bloc> retrieveAllBlocs() {
        log.info("Liste des Blocs: {}", iBlocRepository.findAll());
        return iBlocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return iBlocRepository.findById(blocId).get();
    }

    @Override
    public Bloc addBloc(Bloc c) {
        return iBlocRepository.save(c);
    }

    @Override
    public void removeBloc(Long blocId) {
        iBlocRepository.deleteById(blocId);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, ChamberType typeC) {
        Bloc b = iBlocRepository.findById(idBloc).get();
        List<Chambre> chambres = new ArrayList<>();
        for (int i=0 ; i< b.getChambers().size();i++){
            if(b.getChambers().get(i).getTypeC()==typeC)
             chambres.add(b.getChambers().get(i));
        }
    return chambres ;
    }


}
