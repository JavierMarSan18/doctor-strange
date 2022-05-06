package edu.parcial2.doctorstrange.services;

import edu.parcial2.doctorstrange.entities.Paciente;

import java.util.List;

public interface PacienteService {
    List<Paciente> listar();
    Paciente buscar(Long id);
    void editar(Long id, Paciente paciente);
    void borrar(Long id);
}
