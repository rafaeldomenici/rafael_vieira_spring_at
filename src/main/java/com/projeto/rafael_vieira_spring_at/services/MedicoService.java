package com.projeto.rafael_vieira_spring_at.services;

import com.projeto.rafael_vieira_spring_at.entities.Medico;
import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import com.projeto.rafael_vieira_spring_at.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico cadastrarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }
}
