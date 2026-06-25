package com.projeto.rafael_vieira_spring_at.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDTO {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String telefone;
}
