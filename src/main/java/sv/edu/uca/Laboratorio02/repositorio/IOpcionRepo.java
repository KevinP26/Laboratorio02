package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Opcion;

import java.util.List;

public interface IOpcionRepo extends IGenericRepository<Opcion, Integer>{
    public List<Opcion> findAllByNombreOpcion(String nombreOpcion);

    @Query("Delete from Opcion o where o.id = :id")
    public void deleteOpcion(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from opcion where id = :id")
    public void deleteOpcionNative(@Param("id")Integer id);
}
