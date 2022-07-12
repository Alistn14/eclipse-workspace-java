package com.InyeccionDeDependencias;
import org.springframework.stereotype.Component;

//Cada etiqueta Component define el bean con su id, el cual ser� escaneado por el ComponentScan.

@Component("miProfesor1")
public class ProfesorInformatica implements Profesor {
	
	@PostConstruct
	public void init() {
		System.out.println("Inicializaci�n");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destrucci�n");
	}

//La etiqueta Override define autom�ticamente el m�todo definido en la interfaz.
	
	@Override
	public String getClases() {
		return "Clases de Inform�tica";
	}

}
