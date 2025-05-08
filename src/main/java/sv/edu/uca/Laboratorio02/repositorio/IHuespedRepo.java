package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Huesped;

import java.util.List;

public interface IHuespedRepo extends IGenericRepository<Huesped, Integer>{
    public List<Huesped> findAllByNombre(String nombre);

    @Query("Delete from Huesped h where h.id = :id")
    public void deleteHuesped(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from huesped where id = :id")
    public void deleteHuespedNative(@Param("id")Integer id);
}
