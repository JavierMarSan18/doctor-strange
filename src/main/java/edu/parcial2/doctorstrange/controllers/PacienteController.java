package edu.parcial2.doctorstrange.controllers;

import edu.parcial2.doctorstrange.entities.Paciente;
import edu.parcial2.doctorstrange.services.paciente.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Paciente> listarPacientes(){
        return pacienteService.listarPacientes();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Paciente buscarPaciente(@PathVariable Long id){
        return pacienteService.buscarPaciente(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void modificarPaciente(@PathVariable Long id, @RequestBody Paciente paciente){
        pacienteService.modificarPaciente(id,paciente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void borrarPaciente(@PathVariable Long id){
        pacienteService.eliminarPaciente(id);
    }
}
