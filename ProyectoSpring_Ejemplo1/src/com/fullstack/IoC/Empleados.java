package com.fullstack.IoC;

public interface Empleados {

	//m�todos
	public String getTareas();
//Todas aquellas clases que implementen la interfaz empleados adem�s de realizar
//tareas tambi�n se le implemente la presentaci�n de informes instanciada en las dependencias.
	public String getInforme();
}
