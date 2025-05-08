package sv.edu.uca.Laboratorio02.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer capacidad;
    private String ornamentros;

    @ManyToOne
    private Piso piso;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "salon")
    private List<RegistroLimpiezaMantenimiento> registroLimpiezas;

}
