package com.fullstack.anotaciones;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProfesores {

	public static void main(String[] args) {
		
		/*Profesor profesorInformática = new ProfesorInformática();
		Profesor profesorMates = new ProfesorMates();
		Profesor profesorOrientación= new ProfesorOrientación();
		
		System.out.println(profesorInformática.getClases());
		System.out.println(profesorMates.getClases());
		System.out.println(profesorOrientación.getClases()); */
		
		//Configuración del container de Spring

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		
	//Definir beans

		Profesor Marc = context.getBean("miProfesor1", Profesor.class);
		System.out.println(Marc.getClases());
		
		//Cerrar contexto
		context.close();
	}

}
