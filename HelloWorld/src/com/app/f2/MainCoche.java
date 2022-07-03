package com.app.f2;

public class MainCoche {

	public static void main(String[] args) {
		Coche honda = new Coche(3);
		Coche opel = new Coche(105.0f,19.0f);
		Coche audi = new Coche(0.0f , 350.0f , 2, 0);
		//invocacion de los metodos estaticos
		//Primer metodo le pasamos 350CV y nos convierte a 259.26Kw
		float kw = Coche.convertirCvKw(350.0f);
		//Primer metodo le pasamos 259.26Kw y nos convierte a 350CV
		float cv = Coche.convertirKwCv(kw);
		
		//Mostrar el resultado de los dos calculos de los metodos static
		//System.out.println(kw); //259.26Kw
		//System.out.println(cv); //350CV
		
		//Tambien se puede llamar al metodo estatico desde un objeto
		//audi.convertirCvKw(350.0f);
		//No necesita invocar a traves de un Objeto
		System.out.println(Coche.factorConversionCvKw);
		Coche.factorConversionCvKw = 2.36f;
		System.out.println(Coche.factorConversionCvKw);
	}

}