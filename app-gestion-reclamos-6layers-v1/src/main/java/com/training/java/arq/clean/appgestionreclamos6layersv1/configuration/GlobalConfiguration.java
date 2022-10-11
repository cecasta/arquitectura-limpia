package com.training.java.arq.clean.appgestionreclamos6layersv1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class GlobalConfiguration {

	@Bean
	JsonMapper getJsonMapper() {
		return new JsonMapper();
	}
}
