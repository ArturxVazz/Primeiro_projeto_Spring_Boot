package br.senac.tads.dsw.exemplo_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExemploSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploSpringBootApplication.class, args);
	}

	@Bean
	public GeradorDeSaida geradorDeSaida (){
		return new GeradorDeSaidaJson();
	}
}
