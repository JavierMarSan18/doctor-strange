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
    public List<Paciente> listar(){
        return pacienteService.listar();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Paciente buscar(@PathVariable Long id){
        return pacienteService.buscar(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void editar(@PathVariable Long id, @RequestBody Paciente paciente){
        pacienteService.editar(id,paciente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void borrar(@PathVariable Long id){
        pacienteService.borrar(id);
    }
}
