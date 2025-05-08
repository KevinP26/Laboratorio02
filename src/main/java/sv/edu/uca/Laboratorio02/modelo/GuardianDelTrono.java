package sv.edu.uca.Laboratorio02.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuardianDelTrono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String correo;
    private String contrasenia;
    private LocalDate fechaNacimiento;
    private Integer powerLevel; // HIS POWER LEVEL IS OVER 9000!!!!!

    @ManyToOne
    private Departamento departamento;

    @OneToMany(mappedBy = "guardian")
    private List<AsignacionMensualGuardian> asignacionMensualGuardian;

}
