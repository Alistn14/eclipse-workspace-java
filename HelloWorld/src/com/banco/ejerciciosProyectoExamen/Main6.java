package com.banco.ejerciciosProyectoExamen;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
				+ "1. Gestores\r\n"
				+ "2. Clientes\r\n"
				+ "3. Transferencias\r\n"
				+ "4. Mensajes\r\n"
				+ "5. Pr�stamos\r\n"
				+ "6. Salir\r\n");
		
		while (numero !=6) {
			System.out.println("Introduzca un n�mero: ");
			numero =keyboard.nextInt();
			//Invocaci�n del m�todo
			if (numero == 1) {
				Main6.mensajeGestores1();
			} else if (numero == 2) {
				Main6.mensajeClientes2();
			} else if (numero == 3) {
				Main6.mensajeTransferencias3();
			} else if (numero == 4) {
				Main6.mensajeMensajes4();
			} else if (numero == 5) {
				Main6.mensajePrestamos5();
			} else {
				System.out.println("La opci�n no esta en el sistema");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	Scanner keyboard= new Scanner(System.in);
	int numero =0;
	
	public static void mensajeGestores1() {
		System.out.println("---\n"
				
				+ "1. A�adir gestor\r\n"
				+ "2. Modificar gestor\r\n"
				+ "3. Eliminar gestor\r\n"
				+ "4. Ver gestor\r\n"
				+ "5. Ver gestores\r\n"
				+ "6. Atr�s\r\n"
				+ " Introduzca un n�mero:");
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
