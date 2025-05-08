package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.PuntosFiabilidad;

import java.util.List;

public interface IPuntosFiabilidadRepo extends IGenericRepository<PuntosFiabilidad, Integer> {
    public List<PuntosFiabilidad> findAllByOtorgador(String otorgador);

    @Query("Delete from PuntosFiabilidad pf where pf.id = :id")
    public void deletePuntosFiabilidad(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from puntos_fiabilidad where id = :id")
    public void deletePuntosFiabilidadNative(@Param("id")Integer id);
}
