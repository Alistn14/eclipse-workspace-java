package com.app.f2;
import com.app.f1.vehiculo;

//Especializacion de la superclase Vehiculo, es decir, una clase hija

public class bicicleta extends vehiculo {

	//Atributos
	private int cambios;
	
	//Constructores
	public bicicleta() {
		super();  //Llama al constructor de la superclase Vehiculo
		this.cambios = 13;
		System.out.println("Constructor de la clase hija, tiene estos cambios: "+ this.cambios);
	}

	public bicicleta(float velocidad, int cambios , int asientos, int orientacionRuedas) {
		super(23.0f , 4 , 0);
		this.cambios = 4;
	}

	@Override
	protected void parar() {
		// TODO Auto-generated method stub
		
	}
	
}