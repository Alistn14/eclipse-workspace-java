package com.clase.ejercicios;

public class ejerciciosString421 {

	
	public static void main(String[] args) {

		//Ejercicio 1: Escribe un programa que concatene dos StringBuilder, utilizando append y
		//también el operador concatenación.
		
		StringBuilder strb1 = new StringBuilder("buenas"); 
		StringBuilder strb2 = new StringBuilder("tardes");
		
		
		//strb1.append(strb2);
		//System.out.println(strb1);
		
		String strb3 = strb1.toString()+strb2.toString();
		System.out.println(strb3);
		 
		 
		//Ejercicio 2: Escribe un programa que elimine el último carácter de un StringBuilder.
		
		int ultimoIndice = strb1.length()-1;
		strb1.deleteCharAt(ultimoIndice);
		System.out.println(strb1);
		 
		//Ejercicio 3: Escribe un programa que inserte el carácter 'b' cada tres posiciones en un
		//StringBuilder.
		
		StringBuilder strb4 = new StringBuilder ("Buenas tardes");
		System.out.println(strb4);
		
		for (int i=0 ; i< strb4.length()-1; i+=3) {
			strb4.insert(i, 'b');
		}
		System.out.println(strb4);

		//Ejercicio 4: Escribe un programa que convierta en mayúsculas la primera letra de cada
		//palabra de un StringBuilder.
		
		StringBuilder strb5 = new StringBuilder ("Ayer cayó un rayo");
		String conv = strb5.toString();
		
		int pos = 0;
		String espacio= " ";
		String letra = "";
		System.out.println(conv);
		
		for (int i = 0; i < conv.length()-1; i++) {
			letra = letra.valueOf(conv.charAt(i));
			letra = letra.toUpperCase();
			System.out.println(letra);
			
			//System.out.println(conv.charAt(i));
			if (letra.equals(espacio)) {
				pos=i;
				//System.out.println(i);
				letra = letra.valueOf(conv.charAt(pos+1));
				letra = letra.toUpperCase();
				strb5.replace(i+1, i+2, letra);
				
		//Primera vez seria [4] para la "C"
				
				
			}
		}
		System.out.println(strb5);
	}

}
