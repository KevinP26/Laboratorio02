package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Rol;

import java.util.List;

public interface IRolRepo extends IGenericRepository<Rol, Integer> {
    public List<Rol> findAllByNombreRol(String nombreRol);

    @Query("Delete from Rol r where r.id = :id")
    public void deleteRol(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from rol where id = :id")
    public void deleteRolNative(@Param("id")Integer id);
}
