package edu.parcial2.doctorstrange.dao;

import edu.parcial2.doctorstrange.entities.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;

@Repository
public interface PacienteDao extends CrudRepository<Paciente,Long> {
}
