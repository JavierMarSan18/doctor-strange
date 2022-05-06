package edu.parcial2.doctorstrange.services.poliza;

import edu.parcial2.doctorstrange.dao.poliza.PolizaDao;
import edu.parcial2.doctorstrange.entities.Poliza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolizaServiceImpl implements PolizaService{

    @Autowired
    private PolizaDao polizaDao;

    @Override
    public List<Poliza> listarPoliza() {
        return (List<Poliza>) polizaDao.findAll();
    }

    @Override
    public Poliza buscarPoliza(Long id) {
        return polizaDao.findById(id).orElse(null);
    }

    @Override
    public void modificarPoliza(Long id, Poliza poliza) {
        if(polizaDao.existsById(id)){
            poliza.setId(id);
            polizaDao.save(poliza);
        }
    }

    @Override
    public void eliminarPoliza(Long id) {
        if(polizaDao.existsById(id)){
            polizaDao.deleteById(id);
        }
    }
}
