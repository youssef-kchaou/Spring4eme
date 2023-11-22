package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.services.IChambreService;
import tn.esprit.firstproject.services.IEtudiant;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    IEtudiant etudiantService ;

    @PostMapping("/addetudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e) ;
    }

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getChambres() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiant();
        return listEtudiants;
    }
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etId) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(etId);
        return etudiant;
    }
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etId) {
        etudiantService.removeEtudiant(etId);
    }
    @PutMapping("/modify-etudiant")
    public Etudiant modifyChambre(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.modifyEtudiant(e);
        return etudiant;
    }

}
