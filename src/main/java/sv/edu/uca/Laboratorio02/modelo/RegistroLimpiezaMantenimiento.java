package sv.edu.uca.Laboratorio02.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroLimpiezaMantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String informante;
    private LocalDate fecha;
    private LocalTime hora;
    private String detalle;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Salon salon;

    @ManyToOne
    private Habitacion habitacion;
}
