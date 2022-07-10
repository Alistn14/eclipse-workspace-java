package com.ejemplo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		/*Entrenador entrenadorFutbol = new EntrenadorFutbol();
		Entrenador entrenadorBaloncesto= new EntrenadorBaloncesto();
		System.out.println(entrenadorFutbol.getEntrenamiento());
		System.out.println(entrenadorBaloncesto.getEntrenamiento());*/
		
		// abre el contexto a partir del archivo de configuración
		
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Recoge datos xml de los beans");
		
		/*
		obtiene el bean, donde:
		- el primer parámetro es el identificador del bean
		- el segundo parámetro es la interfaz que implementa el bean a recibir, realizando
		una especie casting
		*/
		//Entrenador entrenador = context.getBean("mientrenadorBaloncesto", Entrenador.class);
		//System.out.println(entrenador.getEntrenamiento());
		
		//Entrenador entrenador1 = context.getBean("mientrenadorFutbol", Entrenador.class);
		//System.out.println(entrenador1.getEntrenamiento());
		
		//Entrenador entrenador2 = context.getBean("mientrenadorTenis", Entrenador.class);
		//System.out.println(entrenador2.getEntrenamiento());
		
		Entrenador entrenador3 = context.getBean("mientrenadorFutbol1", Entrenador.class);
		System.out.println(entrenador3.getExperiencia());
		System.out.println(entrenador3.getEntrenamiento());
		System.out.println(entrenador3.getEmail());
		System.out.println(entrenador3.getEquipo());
		
		Entrenador entrenador4 = context.getBean("mientrenadorBaloncesto", Entrenador.class);
		System.out.println(entrenador4.getExperiencia());
		System.out.println(entrenador4.getEntrenamiento());
		System.out.println(entrenador4.getEmail());
		System.out.println(entrenador4.getEquipo());
		
		Entrenador entrenador5 = context.getBean("mientrenadorTenis", Entrenador.class);
		System.out.println(entrenador5.getExperiencia());
		System.out.println(entrenador5.getEntrenamiento());
		System.out.println(entrenador5.getEmail());
		System.out.println(entrenador5.getEquipo());
		
		Entrenador entrenador6 = context.getBean("mientrenadorJockey", Entrenador.class);
		System.out.println(entrenador6.getExperiencia());
		System.out.println(entrenador6.getEntrenamiento());
		System.out.println(entrenador6.getEmail());
		System.out.println(entrenador6.getEquipo());
		
		// cierra el contexto
		context.close();
	}

}