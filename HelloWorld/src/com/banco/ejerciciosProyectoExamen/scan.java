package com.banco.ejerciciosProyectoExamen;
import java.util.Scanner;

// Ejercicio proyecto Main 1

public class scan {

	public static void main(String[] args) {

		System.out.println("Introduce un n�mero por pantalla");
		
   //Es necesaria la clase Scanner para introducir datos por consola.
	
	Scanner keyboard=new Scanner(System.in);
    int numero= keyboard.nextInt();
  
    if (numero == 1) {
    	System.out.println("1 --> Gestores");
    }
    else if (numero == 2) {
    	System.out.println("2 --> Clientes");
    }
    else if (numero == 3) {
    	System.out.println("3 --> Transferencias");
    }
    else if (numero == 4){
    	System.out.println("4 --> Mensajes");
    	
    }
    else if (numero == 5) {
    	System.out.println ("5 --> Pr�stamos");
    	
    }
    else if (numero == 6) {
    	System.out.println ("6 --> Salir");
    }
    else {
    	System.out.println("No has introducido el n�mero adecuado");
    }
    keyboard.close();
    
	}
}
    	

    	

    	
    