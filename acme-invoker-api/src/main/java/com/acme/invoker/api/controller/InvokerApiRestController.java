package com.acme.invoker.api.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acme.invoker.api.constant.InvokerApiConstant;
import com.acme.invoker.api.service.InvokerApiService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.Setter;

@Api(value = "Endpoints of Invoker for API", tags = {"invoker"})
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(InvokerApiConstant.MAPPING)
@Setter
public class InvokerApiRestController {
	
	public static final Logger LOG = LoggerFactory.getLogger(InvokerApiRestController.class);
	
	@Autowired
	private InvokerApiService invokerApiService;

    @ApiOperation(value = "Invoke Endpoint with HTTP GET", notes = "Return a JSON", tags = { "invoker" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response=List.class )  }
    )	    
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> invokeEndpointGet() {
    	LOG.info("Invoke Endpoint with HTTP GET ...");
    	
    	String value = invokerApiService.invokeEndpointGet();
    	LOG.info(" [*] message :: {}",value);
    	
    	if (value == null || value.isEmpty() ) {
			return ResponseEntity.notFound().build();
    	}
    	
    	return ResponseEntity.ok(value);
    }
}
