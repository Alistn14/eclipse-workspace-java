package com.banco.ejerciciosProyectoExamen;


//Ejercicios página 355

import java.util.Scanner;

//Ejercicio proyecto Main 2

public class main2
{
	public static void main(String[] args) {
    Scanner keyboard=new Scanner(System.in);
    int numero = 0;
    
	while (numero !=6) {
		System.out.println("Introduce un número por pantalla: ");
    	numero= keyboard.nextInt();
    }
    
    	System.out.println("Es correcto el número");
    	numero= keyboard.nextInt();
    	keyboard.close();
    }
  
}
   

    	
    