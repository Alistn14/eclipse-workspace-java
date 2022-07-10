package com.fullstack.IoC;

public interface Empleados {

	//métodos
	public String getTareas();
//Todas aquellas clases que implementen la interfaz empleados además de realizar
//tareas también se le implemente la presentación de informes instanciada en las dependencias.
	public String getInforme();
}
