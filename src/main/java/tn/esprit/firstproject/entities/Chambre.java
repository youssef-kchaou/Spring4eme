package tn.esprit.firstproject.entities;
import jakarta.persistence.*;
import lombok.*;


import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private ChamberType typeC;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
    @ManyToOne
    private Bloc bloc;


}