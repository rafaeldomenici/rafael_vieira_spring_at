package com.projeto.rafael_vieira_spring_at.services;

import com.projeto.rafael_vieira_spring_at.entities.Consulta;
import com.projeto.rafael_vieira_spring_at.entities.Medico;
import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import com.projeto.rafael_vieira_spring_at.repositories.ConsultaRepository;
import com.projeto.rafael_vieira_spring_at.repositories.MedicoRepository;
import com.projeto.rafael_vieira_spring_at.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    public Consulta cadastrarConsulta(Consulta consulta, Long idPaciente, Long idMedico) {
        Paciente paciente = pacienteRepository.findById(idPaciente).orElseThrow(() -> new RuntimeException());
        Medico medico = medicoRepository.findById(idMedico).orElseThrow(() -> new RuntimeException());
        consulta.paciente = paciente;
        consulta.medico = medico;
        return consultaRepository.save(consulta);
    }

    public List<Object[]> listarMedicosMaiorQuantidadeConsultas() {
        return consultaRepository.listaMedicosMaiorQuantidadeConsultas();
    }
}
