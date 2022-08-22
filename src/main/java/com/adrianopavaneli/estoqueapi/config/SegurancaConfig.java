package com.adrianopavaneli.estoqueapi.config;






import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;





@EnableWebSecurity
@EnableAuthorizationServer
@EnableResourceServer
@Configuration
public class SegurancaConfig  {
    
}  
