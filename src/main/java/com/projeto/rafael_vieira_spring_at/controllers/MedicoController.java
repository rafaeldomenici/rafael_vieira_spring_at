package com.projeto.rafael_vieira_spring_at.controllers;


import com.projeto.rafael_vieira_spring_at.entities.Medico;
import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import com.projeto.rafael_vieira_spring_at.services.MedicoService;
import com.projeto.rafael_vieira_spring_at.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    public ResponseEntity<Medico> cadastrarMedico(@RequestBody Medico medico) {
        return ResponseEntity.status(HttpStatus.CREATED).body(medicoService.cadastrarMedico(medico));
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listarMedicos() {

        return ResponseEntity.ok(medicoService.listarMedicos());
    }
}
