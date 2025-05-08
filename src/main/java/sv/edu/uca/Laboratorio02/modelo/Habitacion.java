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
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String detallesEspeciales;

    @ManyToOne
    private Piso piso;

    @OneToMany(mappedBy = "habitacion")
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "habitacion")
    private List<RegistroLimpiezaMantenimiento> registroLimpiezas;



}
