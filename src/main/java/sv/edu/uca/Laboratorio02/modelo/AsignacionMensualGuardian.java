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
public class AsignacionMensualGuardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String superior;
    private Boolean isCoordinador;
    private Integer turno;
    private LocalDate fechaInicio;
    private LocalTime horario;

    @ManyToOne
    private Sucursal sucursal;

    @ManyToOne
    private GuardianDelTrono guardian;


}
