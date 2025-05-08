package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Opcion;
import sv.edu.uca.Laboratorio02.modelo.RolOpcion;

import java.util.List;

public interface IRolOpcionRepo extends IGenericRepository<RolOpcion, Integer> {
    public List<RolOpcion> findAllByOpcion(Opcion opcion);

    @Query("Delete from RolOpcion ro where ro.id = :id")
    public void deleteRolOpcion(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from rol_opcion where id = :id")
    public void deleteRolOpcionNative(@Param("id")Integer id);
}
