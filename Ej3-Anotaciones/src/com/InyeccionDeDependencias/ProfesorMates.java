package com.InyeccionDeDependencias;
import org.springframework.beans.factory.annotation.Value;

public class ProfesorMates implements Profesor{

	@Override
	public String getClases() {
		return "Clases de Mates";
	}
	
	private ExperienciaServicio experienciaServicio;
	
	public ProfesorMates(ExperienciaServicio experienciaServicio) {
		this.experienciaServicio=experienciaServicio;
	}
	
	public int getExperienciaServicio() {
		return experienciaServicio.getExperiencia();
	}

	//Inyección por properties
	
	@Value("${notaExamen}")
	private String notaExamen;
	
	public String getnotaExamen() {
		return notaExamen;
	}
}
