package sv.edu.uca.Laboratorio02.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaReserva;
    private String estado;

    @OneToOne(cascade = CascadeType.ALL)
    private Comprobante comprobante;

    @ManyToOne
    private Huesped huesped;

    @ManyToOne
    private Habitacion habitacion;

    @ManyToOne
    private Salon salon;
}
