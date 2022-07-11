package com.fullstack.dependencia.constructor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProfesores {

	public static void main(String[] args) {
		
		
		//Abrir contexto a partir del archivo de configuración

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Solicitar bean del objeto

		Profesor Marc = contexto.getBean("miProfesorInformatica", Profesor.class);
		Profesor Paola=contexto.getBean("miProfesorOrientacion", Profesor.class);
		Profesor Carlos=contexto.getBean("miProfesorMates", Profesor.class);
		
		System.out.println(Marc.getClases());
		System.out.println(Marc.getExperiencia());
		
	
		System.out.println(Paola.getClases());
		System.out.println(Paola.getExperiencia());
		
		System.out.println(Carlos.getExamen());
		
		
		//Cerrar contexto
		contexto.close();
	}

}
