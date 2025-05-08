package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.GuardianDelTrono;

import java.util.List;

public interface IGuardianDelTronoRepo extends IGenericRepository<GuardianDelTrono, Integer> {
    public List<GuardianDelTrono> findAllByNombre(String nombre);

    @Query("Delete from GuardianDelTrono gdt where gdt.id = :id")
    public void deleteGuardianDelTrono(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from guardian_del_trono where id = :id")
    public void deleteGuardianDelTronoNative(@Param("id")Integer id);
}
