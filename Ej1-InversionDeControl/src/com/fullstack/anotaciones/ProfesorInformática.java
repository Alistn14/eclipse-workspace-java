package com.fullstack.anotaciones;
import org.springframework.stereotype.Component;

//Cada etiqueta Component define el bean con su id, el cual será escaneado por el ComponentScan.

@Component("miProfesor1")
public class ProfesorInformática implements Profesor {

//La etiqueta Override define automáticamente el método definido en la interfaz.
	
	@Override
	public String getClases() {
		// TODO Auto-generated method stub
		return "Clases de Informática";
	}

}
