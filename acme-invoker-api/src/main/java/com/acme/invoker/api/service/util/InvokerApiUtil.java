package com.acme.invoker.api.service.util;

import com.acme.invoker.api.properties.InvokerApiProperties;

public final class InvokerApiUtil {

	private InvokerApiUtil() {
		throw new IllegalStateException("InvokerApiUtil");
	}
	
	public static String getEndpoint(InvokerApiProperties invokeProperties) {
		return invokeProperties.getUrl()+invokeProperties.getPath();
	}
}
