package com.projeto.rafael_vieira_spring_at.repositories;

import com.projeto.rafael_vieira_spring_at.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {
}
