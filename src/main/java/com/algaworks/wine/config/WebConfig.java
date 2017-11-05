package com.algaworks.wine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.support.DomainClassConverter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public DomainClassConverter<FormattingConversionService> domainClassConverter(FormattingConversionService conversionService){
		
		return new DomainClassConverter<FormattingConversionService>(conversionService);
		
	}
	
	
}
