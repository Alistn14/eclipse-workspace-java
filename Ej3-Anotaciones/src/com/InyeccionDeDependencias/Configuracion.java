package com.InyeccionDeDependencias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Ejercicio 3 mediante comentarios, explicación de las anotaciones:

//Etiqueta configuration para crear la nueva clase configuración y definirla

@Configuration
@PropertySource("classpath:datos.properties")

//Etiqueta ComponentScan es opcional pero lo uso para escanear los beans definidos en las clases.

@ComponentScan("com.InyeccionDeDependencias")

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


