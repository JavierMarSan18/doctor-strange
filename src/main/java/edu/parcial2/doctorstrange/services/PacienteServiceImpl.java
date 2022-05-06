package edu.parcial2.doctorstrange.services;


import edu.parcial2.doctorstrange.dao.PacienteDao;
import edu.parcial2.doctorstrange.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

   @Autowired
    private PacienteDao pacienteDao;

   @Override
    public List<Paciente> listar(){
        return (List<Paciente>) pacienteDao.findAll();
    }
    @Override
    public Paciente buscar(Long id){
        return pacienteDao.findById(id).orElse(null);
    }

    @Override
    public void editar(Long id, Paciente paciente) {
        if (pacienteDao.existsById(id)){
            paciente.setId(id);
            pacienteDao.save(paciente);
        }
    }

    @Override
    public void borrar(Long id) {
        if(pacienteDao.existsById(id)){
            pacienteDao.deleteById(id);
        }
    }
}
