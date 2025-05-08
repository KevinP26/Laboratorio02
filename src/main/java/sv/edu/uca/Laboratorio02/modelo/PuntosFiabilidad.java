package sv.edu.uca.Laboratorio02.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PuntosFiabilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String otorgador;
    private LocalDate fechaUltimaSuma;
    private Integer puntos;

    @ManyToOne
    private Huesped huesped;


}
