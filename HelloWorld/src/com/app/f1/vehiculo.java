package com.app.f1;

public abstract class vehiculo {

	//Atributos
	protected float velocidad;
	protected int asientos;
	protected int orientacionRuedas;
	
	//Constructor de la superclase
	public vehiculo () {
		this.velocidad = 0.0f;
		this.asientos= 4;
		this.orientacionRuedas = 0;
		
	}
	
	
	public vehiculo (float velocidad, int asientos, int orientacionRuedas) {
		this.velocidad = velocidad;
		this.asientos= asientos;
		this.orientacionRuedas = orientacionRuedas;
		
	}
	
	//Métodos
	public void acelerar() {}
	public void desacelerar() {}
	public void girarIzquierda() {}
	public void girarDerecha() {}

	//Método abstracto
	protected abstract void parar();
}
	