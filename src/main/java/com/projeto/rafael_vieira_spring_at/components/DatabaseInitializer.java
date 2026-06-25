package com.projeto.rafael_vieira_spring_at.components;

import com.projeto.rafael_vieira_spring_at.entities.Medico;
import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import com.projeto.rafael_vieira_spring_at.repositories.MedicoRepository;
import com.projeto.rafael_vieira_spring_at.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Medico> medicos = medicoRepository.findAll();
        if(medicos.isEmpty()) {
            Medico medico1 = new Medico(null,"Luis","123456789","Cardiologista",null);
            Medico medico2 = new Medico(null,"Lucas","123456789","Ortopedista",null);
            medicoRepository.save(medico1);
            medicoRepository.save(medico2);
        }
        List<Paciente> pacientes = pacienteRepository.findAll();
        if(pacientes.isEmpty()) {
            Paciente paciente1 = new Paciente(null,"João Silva","123456789", LocalDate.parse("1996-01-01"),"987654321",null,null);
            Paciente paciente2 = new Paciente(null,"Maria Oliveira","2345678901", LocalDate.parse("1995-01-01"),"967456731",null,null);
            pacienteRepository.save(paciente1);
            pacienteRepository.save(paciente2);
        }

    }
}