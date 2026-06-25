package com.projeto.rafael_vieira_spring_at.controllers;

import com.projeto.rafael_vieira_spring_at.dtos.PacienteDTO;
import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import com.projeto.rafael_vieira_spring_at.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<PacienteDTO> cadastrarPaciente(@RequestBody PacienteDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.cadastrarPaciente(dto));
    }

    @GetMapping("/{id}")
    public Paciente buscarPaciente(@PathVariable Long id) {
        return pacienteService.buscarPaciente(id);
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listarPàcientes() {

        return ResponseEntity.ok(pacienteService.listarPacientes());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPaciente(@PathVariable Long id) {

        pacienteService.removerPaciente(id);
        return ResponseEntity.noContent().build();
    }

}
