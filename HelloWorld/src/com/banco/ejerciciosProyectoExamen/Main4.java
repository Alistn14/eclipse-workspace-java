package com.banco.ejerciciosProyectoExamen;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/* Ejercicio proyecto (Main4): reutiliza el programa desarrollado para mostrar los mensajes
		(Gestores, Clientes, Transferencias, Mensajes, Préstamos) en métodos (un método por
		cada mensaje).
		*/
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
				+ "1. Gestores\r\n"
				+ "2. Clientes\r\n"
				+ "3. Transferencias\r\n"
				+ "4. Mensajes\r\n"
				+ "5. Préstamos\r\n"
				+ "6. Salir\r\n");
		
		while (numero !=6) {
			System.out.println("Introduzca un número: ");
			numero =keyboard.nextInt();
			//Invocación del método
			if (numero == 1) {
				Main4.mensajeGestores1();
			} else if (numero == 2) {
				Main4.mensajeClientes2();
			} else if (numero == 3) {
				Main4.mensajeTransferencias3();
			} else if (numero == 4) {
				Main4.mensajeMensajes4();
			} else if (numero == 5) {
				Main4.mensajePrestamos5();
			} else {
				System.out.println("La opción no esta en el sistema");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores");
		
	}
	public static void mensajeClientes2() {
		System.out.println("2--> Clientes");
	}
	public static void mensajeTransferencias3() {
		System.out.println("3--> Transferencias");
	}
	public static void mensajeMensajes4() {
		System.out.println("4--> Mensajes");
	}
	public static void mensajePrestamos5() {
		System.out.println("5--> Prestamos");
	}
		
}
