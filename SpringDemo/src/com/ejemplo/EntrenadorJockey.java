package com.ejemplo;
//import org.springframework.stereotype.Component;

public class EntrenadorJockey implements Entrenador {
	
protected String email;
	
	protected String equipo; 
	
	public String getEmail() {
		return email;
		}
		public void setEmail(String email) {
		System.out.println("Inyección de un literal en un método setter: " + email);
		this.email = email;
		}
		public String getEquipo() {
		return equipo;
		}
		public void setEquipo(String equipo) {
		System.out.println("Inyección de un literal en un método setter: " + equipo);
		this.equipo = equipo;
		}
	private ExperienciaServicio experienciaServicio;
	@Override
	public String getEntrenamiento() {
		return "30 pases con el stick";
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyección del servicio en un método setter
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en un método setter");
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}