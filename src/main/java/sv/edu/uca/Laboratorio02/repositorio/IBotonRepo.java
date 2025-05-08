package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Boton;

import java.util.List;

public interface IBotonRepo extends IGenericRepository<Boton, Integer> {
    public List<Boton> findAllByNumeroMagico(String numeroMagico);
    @Query("Delete from Boton b where b.id = :id")
    public void deleteBoton(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from boton where id = :id")
    public void deleteBotonNative(@Param("id")Integer id);
}
