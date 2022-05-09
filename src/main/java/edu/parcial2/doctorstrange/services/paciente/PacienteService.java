package edu.parcial2.doctorstrange.services.paciente;

import edu.parcial2.doctorstrange.entities.Paciente;

import java.util.List;

public interface PacienteService {
    List<Paciente> listarPacientes();
    Paciente buscarPaciente(Long id);
    void modificarPaciente(Long id, Paciente paciente);
    void eliminarPaciente(Long id);
}
