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
public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @OneToMany(mappedBy = "piso")
    private List<Habitacion> habitaciones;

    @OneToMany(mappedBy = "piso")
    private List<Salon> salones ;

    @OneToMany(mappedBy = "piso")
    private List<AsignacionMensual> asignacionMensuales;

    @ManyToOne
    private Sucursal sucursal;

    @OneToOne(cascade = CascadeType.ALL)
    private Boton boton;
}
