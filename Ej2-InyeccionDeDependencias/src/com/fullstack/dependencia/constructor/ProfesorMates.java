package com.fullstack.dependencia.constructor;
public class ProfesorMates implements Profesor{

	 private ExperienciaServicio experienciaServicio;
	 
	@Override
	public String getClases() {
		
		return "Clases de Mates";
	}
	
		
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	
	 //Constructor con el servicio inyectado
		public ProfesorMates(ExperienciaServicio experienciaServicio) {
			this.experienciaServicio=experienciaServicio; 
		}
	
	
	//Atributos
  	protected String examen;
  
    //Métodos GET and SET
	
	@Override
	public String getExamen() {
		return examen;
	}

	@Override
	public void setExamen(String examen) {
		this.examen=examen;
	}

}
