	package examenPractico_modulo3;

	//Ejercicio4: escribe un programa que almacene tres �ngulos de un tri�ngulo en variables detipo entero (angulo1, angulo2 y angulo3). 
	//Crea un condicional que compruebe si esos
	//tres �ngulos juntos pueden formar un tri�ngulo (los �ngulos de un tri�ngulo sumansiempre 180 grados).

	public class ejercicio4 {

		public static void main(String[] args) {
			
			int angulo1= 24, angulo2 = 45, angulo3= 111;
			
		if ( angulo1 + angulo2 + angulo3 == 180){
			
			System.out.println("Los tres �ngulos forman un tri�ngulo");
			
		}else {
			System.out.println("Los tres �ngulos no forman un tri�ngulo");
		}
			
			
		}
	}

