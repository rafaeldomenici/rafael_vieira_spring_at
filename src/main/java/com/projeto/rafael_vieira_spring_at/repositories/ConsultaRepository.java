package com.projeto.rafael_vieira_spring_at.repositories;

import com.projeto.rafael_vieira_spring_at.entities.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta,Long> {

    @Query("SELECT m.nome, COUNT(*) FROM Consulta c JOIN c.medico m"
            + " GROUP BY m.nome " +
            " ORDER BY COUNT(*) desc ")
    List<Object[]> listaMedicosMaiorQuantidadeConsultas();
}
