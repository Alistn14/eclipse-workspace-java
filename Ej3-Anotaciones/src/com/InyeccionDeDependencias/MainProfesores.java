package com.InyeccionDeDependencias;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProfesores {

	public static void main(String[] args) {
		
		/*Profesor profesorInform�tica = new ProfesorInform�tica();
		Profesor profesorMates = new ProfesorMates();
		Profesor profesorOrientaci�n= new ProfesorOrientaci�n();
		
		System.out.println(profesorInform�tica.getClases());
		System.out.println(profesorMates.getClases());
		System.out.println(profesorOrientaci�n.getClases()); */
		
		//Configuraci�n del container de Spring

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		
	//Definir beans

		Profesor Marc = context.getBean("miProfesor1", Profesor.class);
		System.out.println(Marc.getClases());
		
		Profesor profesor2=context.getBean("ProfesorMates", Profesor.class);
		System.out.println(profesor2.getClases());
		
		
		//Cerrar contexto
		context.close();
	}

}
