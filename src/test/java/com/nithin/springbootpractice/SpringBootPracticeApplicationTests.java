package com.nithin.springbootpractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.nithin.springbootpractice.controllers.HelloWorldController;

@WebMvcTest(HelloWorldController.class)
class SpringBootPracticeApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHello() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello/Nithin"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello, Nithin!"));
	}

//	@Test
//	public void testCreateUser() throws Exception {
//		mockMvc.perform(
//				MockMvcRequestBuilders.post("/user").content().contentType(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.content().string("Create user: NewUser"));
//	}

}
