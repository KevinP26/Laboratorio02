package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Empleado;
import sv.edu.uca.Laboratorio02.modelo.RegistroLimpiezaMantenimiento;

import java.util.List;

public interface IRegistroLimpiezaMantenimientoRepo extends
        IGenericRepository<RegistroLimpiezaMantenimiento, Integer> {
    public List<RegistroLimpiezaMantenimiento> findAllByEmpleado(Empleado empleado);

    @Query("Delete from RegistroLimpiezaMantenimiento rlm where rlm.id = :id")
    public void deleteRegistroLimpiezaMantenimiento(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from registro_limpieza_mantenimiento where id = :id")
    public void deleteRegistroLimpiezaMantenimientoNative(@Param("id")Integer id);
}
