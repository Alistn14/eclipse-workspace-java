package com.clase.ejercicios;

//Ejercicio p�gina 425: Escribe un programa que genere un array de 6 valores de tipo int y sean
//mostrados en pantalla utilizando un bucle for.

public class array {
	
	//Para a�adir 6 valores directamente se puede inicializar con new:
	//int array6[] = new int [6];
	//int numeroAleatorio;  para que se a�adan n�meros aleatorios.

	public static void main(String[] args) {
		
		int valores[] = {1,2,3,4,5,6};
		
		for (int i=0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		

	}

}
