package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Sucursal;

import java.util.List;

public interface ISucursalRepo extends IGenericRepository<Sucursal, Integer> {
    public List<Sucursal> findAllByNombre(String nombre);

    @Query("Delete from Sucursal s where s.id = :id")
    public void deleteSucursal(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from sucursal where id = :id")
    public void deleteSucursalNative(@Param("id")Integer id);
}
