package com.acme.invoker.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.acme.invoker.api.constant.InvokerApiConstant;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MessageInvokerApiControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getInvoke() throws Exception {
		mockMvc.perform(get(InvokerApiConstant.MAPPING)).andExpect(status().isOk())
				.andExpect(jsonPath("$.answer").isString());
	}


}
