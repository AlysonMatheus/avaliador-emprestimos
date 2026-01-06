package com.example.avaliador_emprestimos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class LoanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveRetornarEmprestimosParaClienteComRendaAlta() throws Exception {

        String userJson = """
                {
                    "name": "Alyson Matheus",
                    "cpf": "123.456.789-00",
                    "age": 25,
                    "income": 6000.0,
                    "location": "SP"
                }
                """;

        mockMvc.perform(post("/loans")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.customer").value("Alyson Matheus"))
                .andExpect(jsonPath("$.loans").isArray());
    }
}