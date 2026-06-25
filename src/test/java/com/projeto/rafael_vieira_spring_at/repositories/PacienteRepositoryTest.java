package com.projeto.rafael_vieira_spring_at.repositories;

import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PacienteRepositoryTest {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Test
    void cadastrarPacienteComSucesso() {
        Paciente paciente = new Paciente(null, "Pedro", "123456789", LocalDate.parse("1995-01-01"),"123456789",null,null);

        Paciente pacienteSalvo =  pacienteRepository.save(paciente);

        // ASSERT
        assertNotNull(pacienteSalvo.getId());
    }
}
