package com.fullstack.IoC;

public class DirectorEmpleado implements Empleados {

	@Override
	public String getTareas() {
		
		return "Gestionar plantilla";
	}

	//Creación de campo tipo InformesServicio (interfaz)
	private InformesServicio informeNuevo;
	
	//Creación de Constructor que inyecta la dependencia 
	public DirectorEmpleado(InformesServicio informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director:" + informeNuevo.getInforme();
	}

}
