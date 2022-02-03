package de.casag.connector.processmanager.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import de.casag.connector.webapp.config.security.WebSecurityConfig;



@Configuration
@EnableWebSecurity
public class CustomWebSecurityConfig extends WebSecurityConfig{

}
