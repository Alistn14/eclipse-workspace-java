package com.clase.ejercicios;

public class ejerciciosFor3 {

	public static void main(String[] args) {
		int num=5;
		int resultado = 0;
		for(int i= num; i>0; i--) {
			resultado+=i;
		}
		System.out.printf("El resultado de la suma decremental es: %d",resultado).println();
	}

}
