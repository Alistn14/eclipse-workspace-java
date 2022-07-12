package com.InyeccionDeDependencias;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfesorMates implements Profesor{
	
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
		return "Clases de Mates";
	}
	
	private ExperienciaServicio experienciaServicio;
	
	public ProfesorMates(ExperienciaServicio experienciaServicio) {
		this.experienciaServicio=experienciaServicio;
	}
	
	public int getExperienciaServicio() {
		return experienciaServicio.getExperiencia();
	}

	//Inyecci�n por properties
	
	@Value("${notaExamen}")
	private String notaExamen;
	
	public String getnotaExamen() {
		return notaExamen;
	}
}
