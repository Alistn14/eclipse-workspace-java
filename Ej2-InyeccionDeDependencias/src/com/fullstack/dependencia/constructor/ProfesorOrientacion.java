package com.fullstack.dependencia.constructor;

public class ProfesorOrientacion implements Profesor{

	  private ExperienciaServicio experienciaServicio;

	@Override
	public String getClases() {
		// TODO Auto-generated method stub
		return "Clases de Orientación";
	}

	
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	
	//método setter
		public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
			this.experienciaServicio = experienciaServicio;
		}

}
