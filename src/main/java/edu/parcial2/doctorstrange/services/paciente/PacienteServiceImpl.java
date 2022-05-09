package edu.parcial2.doctorstrange.services.paciente;


import edu.parcial2.doctorstrange.dao.paciente.PacienteDao;
import edu.parcial2.doctorstrange.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

   @Autowired
    private PacienteDao pacienteDao;

   @Override
    public List<Paciente> listarPacientes(){
        return (List<Paciente>) pacienteDao.findAll();
    }
    @Override
    public Paciente buscarPaciente(Long id){
        return pacienteDao.findById(id).orElse(null);
    }

    @Override
    public void modificarPaciente(Long id, Paciente paciente) {
        if (pacienteDao.existsById(id)){
            paciente.setId(id);
            pacienteDao.save(paciente);
        }
    }

    @Override
    public void eliminarPaciente(Long id) {
        if(pacienteDao.existsById(id)){
            pacienteDao.deleteById(id);
        }
    }
}
