package metodoSetter;

public class ProfesorInformática2 implements Profesor2 {

	private ExperienciaServicio2 experienciaServicio;
	
	@Override
	public String getClases() {
		return "Clases de Informática";
	}
	
	
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}


	public void setExperienciaServicio(ExperienciaServicio2 experienciaServicio) {
		this.experienciaServicio = experienciaServicio;
	}
	

	

	
}
