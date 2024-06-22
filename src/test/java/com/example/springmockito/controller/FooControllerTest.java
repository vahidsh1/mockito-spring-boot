package com.example.springmockito.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class FooControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void foo() throws Exception {
         mockMvc.perform(MockMvcRequestBuilders.get("/displayallbeans")).andExpect(MockMvcResultMatchers.status().isGatewayTimeout());
     }
    @Test
    public void foo2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/displayallbeans")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}