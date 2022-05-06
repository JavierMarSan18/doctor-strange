package edu.parcial2.doctorstrange.services.poliza;

import edu.parcial2.doctorstrange.entities.Poliza;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PolizaService {
    List<Poliza> listarPoliza();
    Poliza buscarPoliza(Long id);
    void modificarPoliza(Long id, Poliza poliza);
    void eliminarPoliza(Long id);
}
