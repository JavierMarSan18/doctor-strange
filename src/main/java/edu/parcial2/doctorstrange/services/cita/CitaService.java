package edu.parcial2.doctorstrange.services.cita;

import edu.parcial2.doctorstrange.entities.Cita;

import java.util.List;

public interface CitaService {
    List<Cita> listarCitas();
    Cita buscarCita(Long id);
    void crearCita(Cita cita);
    void modificarCita(Long id, Cita cita);
    void eliminarCita(Long id);
}
