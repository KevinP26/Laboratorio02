package sv.edu.uca.Laboratorio02.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.uca.Laboratorio02.modelo.Huesped;
import sv.edu.uca.Laboratorio02.modelo.Reserva;

import java.util.List;

public interface IReservaRepo extends IGenericRepository<Reserva, Integer>{
    public List<Reserva> findAllByHuesped(Huesped huesped);

    @Query("Delete from Reserva r where r.id = :id")
    public void deleteReserva(@Param("id")Integer id);

    @Query(nativeQuery = true, value = "Delete from reserva where id = :id")
    public void deleteReservaNative(@Param("id")Integer id);
}
