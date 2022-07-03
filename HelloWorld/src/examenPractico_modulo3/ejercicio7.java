package examenPractico_modulo3;

import java.util.Scanner;

//Ejercicio7: plantea, sin necesidad de completarlo,el ejercicio del campus, 
//el examen del módulo 3 solo con Gestores, es decir, hasta el punto 6

public class ejercicio7 {

	//arrays
	
	public static void main(String[] args) {
		
		System.out.println("Gestores");
		
		Scanner keyboard=new Scanner(System.in);
	    int numero =0;
	    
		System.out.println("---\n"
				+ "1. Gestor1\r\n"
				+ "2. Gestor2\r\n"
				+ "3. Gestor3\r\n"
				+ "4. Gestor4\r\n"
				+ "5. Gestor5\r\n"
				+ "6. Actualizar gestor\r\n"
				+ "7. Eliminar gestor\r\n");
	    
		while (numero !=6) {
			System.out.println("Introduce un gestor: ");
			numero =keyboard.nextInt();
		
	    if (numero == 1) {
	    	System.out.println("1 --> Gestor1");
	    }
	    else if (numero == 2) {
	    	System.out.println("2 --> Gestor2");
	    }
	    else if (numero == 3) {
	    	System.out.println("3 --> Gestor3");
	    }
	    else if (numero == 4){
	    	System.out.println("4 --> Gestor4");
	    	
	    }
	    else if (numero == 5) {
	    	System.out.println ("5 --> Gestor5");
	    	
	    }
	    else if (numero == 6){
	    	System.out.println("6 --> Actualizar gestor");
	    } else {
	    	System.out.println("7 --> Eliminar gestor");
	    }
	    keyboard.close();
	    
	
		}
   }
}