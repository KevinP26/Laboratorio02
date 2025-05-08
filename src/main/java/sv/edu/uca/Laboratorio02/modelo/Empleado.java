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
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String correo;
    private String contrasenia;
    private String modoAcceso;

    @OneToMany(mappedBy = "empleado" )
    private List<AsignacionMensual> asignacionMensual;

    @OneToMany(mappedBy = "empleado")
    private List<Regalias> regalias;

    @OneToMany(mappedBy = "empleado")
    private List<RegistroLimpiezaMantenimiento> registroLimpieza;

    @ManyToOne
    private Rol rol;

}
