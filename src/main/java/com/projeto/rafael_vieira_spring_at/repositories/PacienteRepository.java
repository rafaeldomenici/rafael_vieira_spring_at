package com.projeto.rafael_vieira_spring_at.repositories;

import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}
