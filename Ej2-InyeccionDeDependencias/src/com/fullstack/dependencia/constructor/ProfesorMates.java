package com.fullstack.dependencia.constructor;

public class ProfesorMates implements Profesor{

	@Override
	public String getClases() {
		// TODO Auto-generated method stub
		return "Clases de Mates";
	}
	
    private ExperienciaServicio experienciaServicio;
	
    //Constructor con el servicio inyectado
	public ProfesorMates(ExperienciaServicio experienciaServicio) {
		this.experienciaServicio=experienciaServicio;
		
	}

	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}

}
