package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Empleado;
import sv.edu.uca.Laboratorio02.modelo.Regalias;

import java.util.List;

public interface IRegaliasRepo extends IGenericRepository<Regalias, Integer>{
    public List<Regalias> findAllByEmpleado(Empleado empleado);

    @Query("Delete from Regalias r where r.id = :id")
    public void deleteRegalias(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from regalias where id = :id")
    public void deleteRegaliasNative(@Param("id")Integer id);
}
