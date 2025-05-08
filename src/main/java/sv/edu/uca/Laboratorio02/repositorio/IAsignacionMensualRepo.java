package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.AsignacionMensual;
import sv.edu.uca.Laboratorio02.modelo.Empleado;

import java.util.List;

public interface IAsignacionMensualRepo extends IGenericRepository<AsignacionMensual, Integer> {
    public List<AsignacionMensual> findAllByEmpleado(Empleado empleado);
    @Query("Delete from AsignacionMensual am where am.id = :id")
    public void deleteAsignacionMensual(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from asignacion_mensual where id = :id")
    public void deleteAsignacionMensualNative(@Param("id")Integer id);
}
