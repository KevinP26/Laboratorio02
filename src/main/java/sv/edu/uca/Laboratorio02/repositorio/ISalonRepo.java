package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Piso;
import sv.edu.uca.Laboratorio02.modelo.Salon;

import java.util.List;

public interface ISalonRepo extends IGenericRepository<Salon, Integer> {
    public List<Salon> findAllByPiso(Piso piso);

    @Query("Delete from Piso p where p.id = :id")
    public void deletePiso(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from piso where id = :id")
    public void deletePisoNative(@Param("id")Integer id);
}
