package com.acme.invoker.api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.acme.invoker.api.properties.InvokerApiProperties;
import com.acme.invoker.api.service.InvokerApiService;
import com.acme.invoker.api.service.util.InvokerApiUtil;

@Service("invokerApiService")
public class InvokerApiServiceImpl implements InvokerApiService {

	private final Logger LOG = LoggerFactory.getLogger(InvokerApiServiceImpl.class);
	
	@Autowired
    private InvokerApiProperties invokerApiProperties;
	
	private RestTemplate restTemplate;
	
	@Override
	public String invokeEndpointGet() {
		LOG.debug("Invoke Endpoint with HTTP GET ...");
		
		String URI = InvokerApiUtil.getEndpoint(invokerApiProperties);
		LOG.debug(" [*] URI :: {}",URI);
		
		restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(URI, String.class);
		
		LOG.debug(" [*] Result :: {}",response);
		
		return response.toString();
	}

}
