package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Comprobante;

import java.time.LocalDate;
import java.util.List;

public interface IComprobanteRepo extends IGenericRepository<Comprobante, Integer> {
    public List<Comprobante> findAllByFecha(LocalDate fecha);
    @Query("Delete from Comprobante c where c.id = :id")
    public void deleteComprobante(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from comprobante where id = :id")
    public void deleteComprobanteNative(@Param("id")Integer id);
}
