package com.security.springsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//@SpringBootTest
@WebMvcTest
class SpringsecurityApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    public void testHttpsExampleSpringSsl() throws Exception {
        String responseStr = "All is well";
        mockMvc.perform(
                MockMvcRequestBuilders.get("https://localhost:8443/status/health")
        ).andExpect(
                MockMvcResultMatchers.content().string(responseStr)
        )
        ;
    }

}
