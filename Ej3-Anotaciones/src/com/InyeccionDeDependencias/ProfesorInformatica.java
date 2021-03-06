package com.InyeccionDeDependencias;
import org.springframework.stereotype.Component;

//Cada etiqueta Component define el bean con su id, el cual será escaneado por el ComponentScan.

@Component("miProfesor1")
public class ProfesorInformatica implements Profesor {
	
	@PostConstruct
	public void init() {
		System.out.println("Inicialización");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destrucción");
	}

//La etiqueta Override define automáticamente el método definido en la interfaz.
	
	@Override
	public String getClases() {
		return "Clases de Informática";
	}

}
