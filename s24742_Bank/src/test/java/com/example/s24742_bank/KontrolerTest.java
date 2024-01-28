package com.example.s24742_bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;

@SpringBootTest
@AutoConfigureWebTestClient
@AutoConfigureMockMvc
public class KontrolerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testRejestracjiKonta() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/Konta/rejestracja")
                .param("pesel", "122187313")
                .param("saldo", "1000")
                .param("Waluta", "PLN")
                .param("Imie", "maciek")
                .param( "nazwisko", "janiemoge"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
    @Test
    public void testGetKontoById() throws Exception{
        Konto konto = new Konto();
                        Konto.setPesel("2178212981");
                        Konto.setSaldo(BigDecimal.TEN);
    }
}
