package com.fullstack.anotaciones;
import org.springframework.stereotype.Component;

//Cada etiqueta Component define el bean con su id, el cual será escaneado por el ComponentScan.

@Component("miProfesor2")
public class ProfesorMates implements Profesor{

	@Override
	public String getClases() {
		// TODO Auto-generated method stub
		return "Clases de Mates";
	}

}
