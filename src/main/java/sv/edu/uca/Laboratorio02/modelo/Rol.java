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
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreRol;

    @OneToMany(mappedBy = "rol")
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "rol")
    private List<RolOpcion> rolOpciones;
}
