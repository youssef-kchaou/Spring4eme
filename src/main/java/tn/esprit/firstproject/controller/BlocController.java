package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.ChamberType;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.services.IBloc;
import tn.esprit.firstproject.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBloc blocService;

    @PostMapping("/addbloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return blocService.addBloc(b) ;
    }

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
        Bloc bloc = blocService.retrieveBloc(bId);
        return bloc;
    }
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long bId) {
        blocService.removeBloc(bId);
    }
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }
    @GetMapping("/getChambresParBlocEtType/{id-bloc}/{TypeC}")
    public  List<Chambre> affectBlocChambre(@PathVariable ("Typec") ChamberType TypeChambre,
                                  @PathVariable("id-bloc") Long idB ){
        return blocService.getChambresParBlocEtType(idB, TypeChambre);
    }




}
