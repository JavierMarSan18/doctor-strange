package edu.parcial2.doctorstrange.controllers;

import edu.parcial2.doctorstrange.entities.Poliza;
import edu.parcial2.doctorstrange.services.poliza.PolizaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/polizas")
public class PolizaController {

    @Autowired
    private PolizaService polizaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Poliza> listarPoliza(){
        return polizaService.listarPoliza();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Poliza buscarPoliza(@PathVariable Long id){
        return polizaService.buscarPoliza(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void modificarPoliza(@PathVariable Long id, @RequestBody Poliza poliza){
        polizaService.modificarPoliza(id,poliza);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void eliminarPoliza(@PathVariable Long id){
        polizaService.eliminarPoliza(id);
    }
}
