package examenPractico_modulo3;

//Ejercicio5:Escribe un programa que dado 4 números imprima por pantalla cuál es el mayor.

public class ejercicio5 {

	public static void main(String[] args) {
		
		int a=1, b=4, c=5, d=8;
		
		if(a>b && a>b && a>c && a>d) {
			
			System.out.println("La variable a=1 es mayor");
			
		}
		else if (b>c && b>d) {
			
			System.out.println("La variable b=4 es mayor");
		}
		else if (c>d) {
			
			System.out.println("La variable c=5 es mayor");
		}
		else {
			System.out.println("La variable d=8 es mayor");
		}
	}

}
