package org.health.app.repository.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value={"health.app.{impl.env}.properties"})
public class DatabaseConfig {
	
	@Inject
	private Environment environment;
	

}
