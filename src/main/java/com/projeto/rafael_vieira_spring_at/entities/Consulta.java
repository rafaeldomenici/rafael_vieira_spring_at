package com.projeto.rafael_vieira_spring_at.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataConsulta;
    private String observacoes;

    @ManyToOne()
    @JoinColumn(name = "paciente_id")
    @JsonIgnore
    public Paciente paciente;

    @ManyToOne()
    @JoinColumn(name = "medico_id")
    @JsonIgnore
    public Medico medico;

}
