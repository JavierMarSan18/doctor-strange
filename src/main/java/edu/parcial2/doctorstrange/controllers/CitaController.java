package edu.parcial2.doctorstrange.controllers;

import edu.parcial2.doctorstrange.entities.Cita;
import edu.parcial2.doctorstrange.services.cita.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cita> listarCitas(){
        return citaService.listarCitas();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cita buscarCita(@PathVariable Long id){
        return citaService.buscarCita(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearCita(@RequestBody Cita cita){
        citaService.crearCita(cita);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void modificarCita(@PathVariable Long id, @RequestBody Cita cita){
        citaService.modificarCita(id, cita);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void eliminarCita(@PathVariable Long id){
        citaService.eliminarCita(id);
    }
}
