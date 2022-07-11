package metodoSetter;

public class ProfesorMates2 implements Profesor2{

	private ExperienciaServicio2 experienciaServicio;
	
	@Override
	public String getClases() {
		// TODO Auto-generated method stub
		return "Clases de Mates";
	}
	

	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}

	public void setExperienciaServicio(ExperienciaServicio2 experienciaServicio) {
		this.experienciaServicio = experienciaServicio;
	}

}
