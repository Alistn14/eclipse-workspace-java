package com.fullstack.dependencia.constructor;


public class ProfesorOrientacion implements Profesor{

	  private ExperienciaServicio experienciaServicio;

	@Override
	public String getClases() {
		return "Sesiones de orientación";
	}


	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	
	//método setter
		public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
			this.experienciaServicio = experienciaServicio;
		}

		//Atributos
	  	protected String examen;
	  	protected String notaExamen;
		
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
