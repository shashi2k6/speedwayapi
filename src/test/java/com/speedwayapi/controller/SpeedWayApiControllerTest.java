package com.speedwayapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.speedwayapi.model.RaceCar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SpeedWayApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Add car to the repository.
     * @throws Exception
     */
    @Test
    public void test_addCar() throws Exception {
        RaceCar raceCar = new RaceCar("The Condor","Corvette","2019",27,"AVAILABLE",189);
        mockMvc.perform(post("/api/v1/racecars")
                .content(objectMapper.writeValueAsString(raceCar))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.nickname").value("The Condor"));
    }

    /**
     * Get the cars from the repository.
     * @throws Exception
     */
    @Test
    public void test_getAllCars() throws Exception {
        mockMvc.perform(get("/api/v1/racecars"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty())
                .andExpect(jsonPath("$.[0].nickname").value("The Condor"));
    }
}
