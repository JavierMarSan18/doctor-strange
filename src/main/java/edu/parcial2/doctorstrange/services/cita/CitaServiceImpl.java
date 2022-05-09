package edu.parcial2.doctorstrange.services.cita;

import edu.parcial2.doctorstrange.dao.cita.CitaDao;
import edu.parcial2.doctorstrange.entities.Cita;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void modificarCita(Long id, Cita cita) {
        if(citaDao.existsById(id)){
            cita.setId(id);
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
