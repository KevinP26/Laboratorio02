package sv.edu.uca.Laboratorio02.repositorio;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Habitacion;

import java.util.List;

public interface IHabitacionRepo extends IGenericRepository<Habitacion, Integer> {
    public List<Habitacion> findAllByNombre(String nombre);

    @Query("Delete from Habitacion h where h.id = :id")
    public void deleteHabitacion(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from habitacion where id = :id")
    public void deleteHabitacionNative(@Param("id")Integer id);

}
