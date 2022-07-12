package com.InyeccionDeDependencias;
import org.springframework.stereotype.Component;

//Cada etiqueta Component define el bean con su id, el cual ser� escaneado por el ComponentScan.

@Component("miProfesor3")
public class ProfesorOrientacion implements Profesor{

	@PostConstruct
	public void init() {
		System.out.println("Inicializaci�n");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destrucci�n");
	}
	
	@Override
	public String getClases() {
		return "Clases de Orientaci�n";
	}

}
