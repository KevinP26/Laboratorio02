package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Departamento;

import java.util.List;

public interface IDepartamentoRepo extends IGenericRepository<Departamento, Integer> {
    public List<Departamento> findAllByNombre(String nombre);

    @Query("Delete from Departamento d where d.id = :id")
    public void deleteDepartamento(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from departamento where id = :id")
    public void deleteDepartamentoNative(@Param("id")Integer id);
}
