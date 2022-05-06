package edu.parcial2.doctorstrange.dao.cita;

import edu.parcial2.doctorstrange.entities.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaDao extends CrudRepository<Cita,Long> {
}
