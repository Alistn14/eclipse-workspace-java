package com.ejemplo;

public class EntrenadorTenis implements Entrenador {
	
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
	// constructor con el servicio inyectado
	
	public EntrenadorTenis(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyección en el constructor");
	this.experienciaServicio = experienciaServicio;
	}
	
	@Override
	public String getEntrenamiento() {
		return "Realizar 30 saques";
	}

	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
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