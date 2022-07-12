package com.InyeccionDeDependencias;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Ejercicio 3 mediante comentarios, explicación de las anotaciones:

//Etiqueta configuration para crear la nueva clase configuración y definirla

@Configuration
@ComponentScan("com.InyeccionDeDependencias")
@PropertySource("classpath:datos.properties")


public class Configuracion {

//Definición de Beans
	@Bean
	public ExperienciaServicio experienciaServicio() {
		ExperienciaServicio experienciaServicio = new PocaExperienciaServicio();
		return experienciaServicio;
	}

@Bean
public Profesor ProfesorMates() {
	
	ProfesorMates profesor2=new ProfesorMates(experienciaServicio());
	return profesor2;
}




}


