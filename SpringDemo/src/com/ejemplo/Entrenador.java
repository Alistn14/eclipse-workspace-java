package com.ejemplo;

public interface Entrenador {
	
public abstract String getEntrenamiento();
	
// nuevo método para obtener la experiencia a partir del servicio que se inyectará
	public abstract int getExperiencia();

	//método email
	public String getEmail();
	public void setEmail(String email);
	
	//método equipo
	public String getEquipo();
	public void setEquipo(String equipo);
	
	//método init y destroy
	public void init();
	public void destroy();
}
