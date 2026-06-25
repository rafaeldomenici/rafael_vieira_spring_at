package com.projeto.rafael_vieira_spring_at.controllers;

import com.projeto.rafael_vieira_spring_at.dtos.PacienteDTO;
import com.projeto.rafael_vieira_spring_at.services.PacienteService;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

//@WebMvcTest(PacienteController.class)
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public class PacienteControllerTest {
    /*
    private final MockMvc mockMvc;
    private final ObjectMapper objectMapper;

    @MockitoBean
    private PacienteService service;

    public PacienteControllerTest(MockMvc mockMvc, ObjectMapper objectMapper) {
        this.mockMvc = mockMvc;
        this.objectMapper = objectMapper;
    }


    @Test
    void cadastrarPacienteComSucesso() throws Exception{

        //ARRANGE
        PacienteDTO pacienteDTO = new PacienteDTO(null, "Pedro", "123456789", LocalDate.parse("1995-01-01"),"123456789");
        PacienteDTO pacienteDTOCriado =  new PacienteDTO(1L, "Pedro", "123456789", LocalDate.parse("1995-01-01"),"123456789");

        when(this.service.cadastrarPaciente(pacienteDTO)).thenReturn(pacienteDTOCriado);

        String jsonString = this.objectMapper.writeValueAsString(pacienteDTOCriado);

        // ACTION
        MockHttpServletResponse response =  this.mockMvc.perform(post("/pacientes").contentType(MediaType.APPLICATION_JSON)
                .content(jsonString)).andDo(print()).andReturn().getResponse();


        // ASSERT
        assertThat(response.getStatus()).isEqualTo(201);
        assertThat(response.getContentAsString()).contains("Pedro");

    }*/

}
