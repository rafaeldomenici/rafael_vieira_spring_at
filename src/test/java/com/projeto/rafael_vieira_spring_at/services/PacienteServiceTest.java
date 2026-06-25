package com.projeto.rafael_vieira_spring_at.services;

import com.projeto.rafael_vieira_spring_at.dtos.PacienteDTO;
import com.projeto.rafael_vieira_spring_at.entities.Paciente;
import com.projeto.rafael_vieira_spring_at.repositories.PacienteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PacienteServiceTest {

    @Mock
    private PacienteRepository repository;

    @InjectMocks
    private PacienteService service;

    @Test
    void deveCadastrarPacienteComSucesso(){

        //ARRANGE
        PacienteDTO pacienteDTO = new PacienteDTO(null, "Pedro", "123456789", LocalDate.parse("1995-01-01"),"123456789");
        Paciente pacienteDB = new Paciente(1L, "Pedro", "123456789", LocalDate.parse("1995-01-01"),"123456789",null,null);

        //ACT
        when(this.repository.save(any(Paciente.class))).thenReturn(pacienteDB);
        PacienteDTO pacienteSalvo =  this.service.cadastrarPaciente(pacienteDTO);


        //ASSERT
        assertNotNull(pacienteSalvo.getId());
        assertEquals("Pedro", pacienteSalvo.getNome());

    }
}
