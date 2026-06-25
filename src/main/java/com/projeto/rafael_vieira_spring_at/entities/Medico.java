package com.projeto.rafael_vieira_spring_at.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String crm;
    private String especialidade;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    public List<Consulta> consultas;
}
