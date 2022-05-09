package edu.parcial2.doctorstrange.services.cita;

import edu.parcial2.doctorstrange.dao.cita.CitaDao;
import edu.parcial2.doctorstrange.entities.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;

    @Override
    public List<Cita> listarCitas() {
        return (List<Cita>) citaDao.findAll();
    }

    @Override
    public Cita buscarCita(Long id) {
        return citaDao.findById(id).orElse(null);
    }

    @Override
    public void crearCita(Cita cita) {
        cita.setEstado("PENDIENTE");
        citaDao.save(cita);
    }

    @Override
    public void modificarCita(Long id, String estado) {
        if(citaDao.existsById(id)){
            Cita cita = citaDao.findById(id).orElse(null);
            cita.setEstado(estado);
            citaDao.save(cita);
        }
    }

    @Override
    public void aceptarCita(Long id) {
        if(citaDao.existsById(id)){
            Cita cita = buscarCita(id);
            cita.setEstado("ACEPTADA");
            citaDao.save(cita);
        }
    }

    @Override
    public void cancelarCita(Long id) {
        if(citaDao.existsById(id)){
            Cita cita = buscarCita(id);
            cita.setEstado("CANCELADA");
            citaDao.save(cita);
        }
    }


    @Override
    public void eliminarCita(Long id) {
        if(citaDao.existsById(id)){
            citaDao.deleteById(id);
        }
    }
}
