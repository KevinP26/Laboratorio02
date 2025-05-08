package sv.edu.uca.Laboratorio02.repositorio;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.AsignacionMensualGuardian;

import java.util.List;

@Transactional
public interface IAsignacionMensualGuardianRepo
        extends IGenericRepository<AsignacionMensualGuardian, Integer> {
    public List<AsignacionMensualGuardian> findAllBySuperior(String superior);

    @Query("Delete from AsignacionMensualGuardian amg where amg.id = :id")
    public void deleteAsignacionMensualGuardian(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from asignacion_mensual_guardian where id = :id")
    public void deleteAsignacionMensualGuardianNative(@Param("id")Integer id);
}
