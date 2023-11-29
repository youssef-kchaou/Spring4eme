package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.ChamberType;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.repository.IBlocRepository;
import tn.esprit.firstproject.services.IBloc;
import tn.esprit.firstproject.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/addchambre")
    public Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c) ;
    }

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

    @PostMapping("/affectBlocChambre/{id-bloc}")
    public Bloc affectBlocChambre(@RequestBody List<Long> idChambres,
                                  @PathVariable("id-bloc") Long idB ){
        return chambreService.affectBlocChambre(idChambres,idB);
    }
    @GetMapping("/getChambresParBlocEtTypeJPQL/{idBloc}/{Ctype}")
    public List<Chambre>getChambresParBlocEtTypeJPQL(@PathVariable("idBloc") Long idBloc,@PathVariable("Ctype") ChamberType c)
    {
        return chambreService.findByBlocIdBlocAndTypeChambreJPQL(idBloc,c);
    }
    @GetMapping("/getChambresParBlocEtTypeKeyWords/{idBloc}/{Ctype}")
    public List<Chambre>getChambresParTypeEtIdBloc(@PathVariable("idBloc") Long idBloc,@PathVariable("Ctype") ChamberType c)
    {
        return chambreService.getChambreParTypeEtIdBloc(idBloc,c);
    }
}
