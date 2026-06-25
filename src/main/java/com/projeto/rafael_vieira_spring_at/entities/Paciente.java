package com.projeto.rafael_vieira_spring_at.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String telefone;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    public List<Consulta> consultas;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    public List<Internacao> internacoes;
}
