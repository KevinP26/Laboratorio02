package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Empleado;

import java.util.List;

public interface IEmpleadoRepo extends IGenericRepository<Empleado, Integer> {
    public List<Empleado> findAllByNombre(String nombre);

    @Query("Delete from Empleado e where e.id = :id")
    public void deleteEmpleado(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from empleado where id = :id")
    public void deleteEmpleadoNative(@Param("id")Integer id);
}
