package com.ejemplo;

//import org.springframework.stereotype.Component;

public class EntrenadorJockey implements Entrenador {
	private ExperienciaServicio experienciaServicio;
	@Override
	public String getEntrenamiento() {
		return "30 pases con el stick";
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyeccion del servicio en un metodo setter
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyeccion en un metodo setter");
		this.experienciaServicio = experienciaServicio;
	}
}