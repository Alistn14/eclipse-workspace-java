package com.fullstack.dependencia.constructor;

public interface Profesor {
	
//Métodos GET y SET
	
	public String getExamen();
	public void setExamen(String examen);
	
	public abstract String getClases();
	
//Método para obtener la experiencia a partir del servicio que se inyectará.
	
	public abstract int getExperiencia();
	
}
