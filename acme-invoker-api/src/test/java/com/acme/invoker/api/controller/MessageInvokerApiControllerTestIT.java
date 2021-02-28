package com.acme.invoker.api.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.acme.invoker.api.constant.InvokerApiConstant;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MessageInvokerApiControllerTestIT {

	@LocalServerPort
    private int port;

    private URL base;
    
    private String templateMessageTest;

    @Autowired
    private TestRestTemplate template;

    @BeforeEach
    public void setUp() throws Exception {
    	templateMessageTest = "answer";
    	
        base = new URL("http://localhost:" + port + InvokerApiConstant.MAPPING);
    }

    @Test
    public void getInvoke() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);
        
        assertThat(response.getBody(), containsString(templateMessageTest));
    }
	
}
