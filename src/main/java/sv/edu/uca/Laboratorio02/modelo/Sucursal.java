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
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String direccion;

    @OneToMany(mappedBy = "sucursal")
    private List<AsignacionMensualGuardian> asignacionMensualGuardian;

    @OneToMany(mappedBy = "sucursal")
    private List<Piso> pisos;

}
