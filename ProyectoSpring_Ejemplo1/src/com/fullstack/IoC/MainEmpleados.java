package com.fullstack.IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmpleados {

	public static void main(String[] args) {

		//Crear objetos 
/*	Empleados Empleado1 = new JefeEmpleado();	
	Empleados Empleado2 = new SecretarioEmpleado();
	Empleados Empleado3= new DirectorEmpleado();
	
		
		//Usar objetos
	
    System.out.println(Empleado1.getTareas());
    System.out.println(Empleado2.getTareas());
    System.out.println(Empleado3.getTareas()); */
    
//Crear contexto
		
ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	
//Solicitar bean del objeto

Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
System.out.println(Juan.getTareas());
System.out.println(Juan.getInforme());

	}

}
