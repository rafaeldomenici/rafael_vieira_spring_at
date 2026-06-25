package com.projeto.rafael_vieira_spring_at.services;


import com.projeto.rafael_vieira_spring_at.dtos.PacienteDTO;
import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import com.projeto.rafael_vieira_spring_at.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public PacienteDTO cadastrarPaciente(PacienteDTO dto) {
        Paciente paciente = new Paciente(null, dto.getNome(), dto.getCpf(), dto.getDataDeNascimento(),dto.getTelefone(),null,null);
        Paciente salvo = pacienteRepository.save(paciente);
        return new PacienteDTO(salvo.getId(), salvo.getNome(), salvo.getCpf(),salvo.getDataDeNascimento(), salvo.getTelefone());
    }

    public Paciente buscarPaciente(Long id) {
        Paciente paciente = pacienteRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return paciente;
    }

    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }

    public void removerPaciente(Long id) {
        Paciente paciente = pacienteRepository.findById(id).orElseThrow(() -> new RuntimeException());
        pacienteRepository.delete(paciente);
    }

}
