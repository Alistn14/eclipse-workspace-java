package com.fullstack.archivoXML;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainProfesores {

	public static void main(String[] args) {
		
		/*Profesor profesorInformática = new ProfesorInformática();
		Profesor profesorMates = new ProfesorMates();
		Profesor profesorOrientación= new ProfesorOrientación();
		
		System.out.println(profesorInformática.getClases());
		System.out.println(profesorMates.getClases());
		System.out.println(profesorOrientación.getClases()); */
		
		//Abrir contexto a partir del archivo de configuración

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Solicitar bean del objeto

		Profesor Marc = contexto.getBean("miProfesor", Profesor.class);
		System.out.println(Marc.getClases());
		
		//Cerrar contexto
		contexto.close();
	}

}
