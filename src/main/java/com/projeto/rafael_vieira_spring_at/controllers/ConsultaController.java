package com.projeto.rafael_vieira_spring_at.controllers;

import com.projeto.rafael_vieira_spring_at.entities.Consulta;
import com.projeto.rafael_vieira_spring_at.entities.Medico;
import com.projeto.rafael_vieira_spring_at.services.ConsultaService;
import com.projeto.rafael_vieira_spring_at.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<Consulta> cadastrarConsulta(@RequestBody Consulta consulta, @RequestParam Long idPaciente, @RequestParam Long idMedico) {

        return ResponseEntity.status(HttpStatus.CREATED).body(consultaService.cadastrarConsulta(consulta,idPaciente,idMedico));
    }
    @GetMapping("/lista")
    public List<Object[]> listarMedicosMaiorQuantidadeConsultas() {
        return consultaService.listarMedicosMaiorQuantidadeConsultas();
    }
}
