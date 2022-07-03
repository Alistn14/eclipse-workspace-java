	package examenPractico_modulo3;

	//Ejercicio4: escribe un programa que almacene tres ángulos de un triángulo en variables detipo entero (angulo1, angulo2 y angulo3). 
	//Crea un condicional que compruebe si esos
	//tres ángulos juntos pueden formar un triángulo (los ángulos de un triángulo sumansiempre 180 grados).

	public class ejercicio4 {

		public static void main(String[] args) {
			
			int angulo1= 24, angulo2 = 45, angulo3= 111;
			
		if ( angulo1 + angulo2 + angulo3 == 180){
			
			System.out.println("Los tres ángulos forman un triángulo");
			
		}else {
			System.out.println("Los tres ángulos no forman un triángulo");
		}
			
			
		}
	}

