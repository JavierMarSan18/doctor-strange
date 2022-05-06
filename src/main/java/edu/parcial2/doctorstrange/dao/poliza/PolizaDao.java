package edu.parcial2.doctorstrange.dao.poliza;

import edu.parcial2.doctorstrange.entities.Poliza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolizaDao extends CrudRepository<Poliza,Long> {
}
