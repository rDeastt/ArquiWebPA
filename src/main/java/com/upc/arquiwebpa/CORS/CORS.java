package com.upc.arquiwebpa.CORS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORS {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/image/**")
                        .allowedOrigins("http://localhost:4200") // Reemplaza con la URL de tu aplicación Angular
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}
