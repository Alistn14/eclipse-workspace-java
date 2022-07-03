package com.clase.ejercicios;

//Ejercicio página 425: Escribe un programa que genere un array de 6 valores de tipo int y sean
//mostrados en pantalla utilizando un bucle for.

public class array {
	
	//Para añadir 6 valores directamente se puede inicializar con new:
	//int array6[] = new int [6];
	//int numeroAleatorio;  para que se añadan números aleatorios.

	public static void main(String[] args) {
		
		int valores[] = {1,2,3,4,5,6};
		
		for (int i=0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		

	}

}
