package com.clase.ejercicios;
//Ejercicios p�gina 413

public class strings {

	public static void main(String[] args) {

//Ejercicio 1: Escribe un programa que dado dos String compruebe si los dos primeros dos caracteres son iguales
		
		String texto1 = "Hola";
		String texto2 = "Adi�s";
		
		String substringABC = "klkabcklk";
		

		String palíndromo = "sometemos";
		String palinReverse= ""; 

		if( texto1.charAt(0) == texto2.charAt(0)) {
			System.out.println("Son caracteres iniciales iguales");
		} else {
			System.out.println("Son caracteres iniciales diferentes");
		} 		
//Ejercicio 2: Escribe un programa que dado dos String compruebe 
//si los dos primeros caracteres y los dos �ltimos son iguales.
		
		if ( texto1.charAt(texto1.length()-1) == texto2.charAt(texto2.length()-1) &&  texto1.charAt(0) == texto2.charAt(0)) {
			System.out.println("Los dos primeros caracteres y los dos ultimos son iguales");
		} else {
			System.out.println("Los dos primeros caracteres y los dos ultimos no son iguales");
		}

//Ejercicio 3: Escribe un programa que compruebe que el substring 'abc' se encuentra en  un String dado, 
		//pero no puede encontrarse ni al comienzo, ni al final.
		
		if ((substringABC.indexOf("abc") != -1) 
				&& (substringABC.indexOf("abc") !=0) 
				&& (substringABC.lastIndexOf("abc") != substringABC.length()-3)) {
			
			System.out.println("El valor de texto abc esta dentro del texto");
		} else {
			System.out.println("No tenemos abc dentro o estan en los extremos");
		}
		
//Ejercicio 4: escribe un programa que dado un String y un determinado �ndice, 
//compruebe	que el car�cter anterior y el posterior son iguales o no.
				
		    String texto3= "Lorem ipsum dolllor sit amet";
			int indice = 3; 
			int segundoIndice = 15;
			
				if ((texto3.charAt(indice)==texto3.charAt(indice-1)) 
						&& (texto3.charAt(indice)==texto3.charAt(indice+1))) {	
					System.out.printf("El caracter que esta en el indice %d, "
							+ "es igual a su anterior y posterior", indice).println();
				} else {
					System.out.printf("El caracter que esta en el indice %d, es "
							+ "diferente a su anterior y posterior", indice).println();
				}
				if ((texto3.charAt(segundoIndice)==texto3.charAt(segundoIndice-1)) 
						&& (texto3.charAt(segundoIndice)==texto3.charAt(segundoIndice+1))) {	
					System.out.printf("El caracter que esta en el indice %d, "
							+ "es igual a su anterior y posterior", segundoIndice).println();
				} else {
					System.out.printf("El caracter que esta en el indice %d, es "
							+ "diferente a su anterior y posterior", segundoIndice).println();
			}
				
//Ejercicio 5: escribe un programa que muestra por pantalla 
//el �ndice de la segunda y tercera	ocurrencia del 
//car�cter 'a' en un String dado.
			
				String ejercicio5 = "zzzabcdef abcdef abcdef dsajdsajk ";
				
				//Devolveria las posiciones 7 y 14
				
				int primerIndice = ejercicio5.indexOf('a');
				//System.out.println(primerIndice);
				
				int segundoIndiceEj5 = ejercicio5.indexOf('a',primerIndice+1);
				System.out.println(segundoIndiceEj5);
				
				int tercerIndiceEj5 = ejercicio5.indexOf('a', segundoIndiceEj5);
				System.out.println(tercerIndiceEj5);
			
	//Ejercicio 6: Escribe un programa que devuelva si un String es pal�ndromo 
	//(se escribe igual hacia delante y hacia detr�s).Ejemplo:"sometemos".
	
	int indiceRecorre = palíndromo.length()-1; //8
     System.out.println(indiceRecorre);
	char caracter= palíndromo.charAt(indiceRecorre); //s
	System.out.println(caracter);
	
	for (int i = indiceRecorre; i>=0; i--) {
		
		palinReverse=palinReverse.concat(palinReverse.valueOf(caracter));
		indiceRecorre --;
		if(indiceRecorre>=0) {
			caracter = palíndromo.charAt(indiceRecorre);
		}
	}
	System.out.println(palinReverse);
	if (palíndromo.equals(palinReverse)) {
		System.out.println("Es un pal�ndromo");
	} else {
		System.out.println("No es un pal�ndromo");
	}

	
	
	
}


	//Ejercicio 4: Escribe un programa dado un String y un determinado indice,
	//compruebe que el caracter anterior y el posterior son iguales o no.

	String texto3= "Lorem ipsum dolor sit amet";
	int indice = 3;
	int segundoIndice = 15;

if ((texto3.charAt(segundoIndice)== texto3.charAt(segundoIndice-1)) && (texto3.charAt(segundoIndice)== texto3.charAt(segundoIndice+1))) {
	System.out.printf("El caracter que esta en el indice %d,+ es igual a su anterior y posterior", indice).println();
	
} else {
    System.out.printf("El caracter que esta en el indice %d, es " + "diferente a su anterior y posterior", indice).println();	
 }
}

}