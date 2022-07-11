package com.InyeccionDeDependencias;
import org.springframework.stereotype.Component;

//Cada etiqueta Component define el bean con su id, el cual será escaneado por el ComponentScan.

@Component("miProfesor3")
public class ProfesorOrientacion implements Profesor{

	@Override
	public String getClases() {
		return "Clases de Orientación";
	}

}
