package com.app.f2;

public class Coche {
	
	public Coche() {
		this.velocidad = 5.0f;
		this.caballos = 0.0f;
		this.asientos = 4;
		this.orientacionRuedas = 0;
	}
	public Coche(int asientos) {
		this.velocidad = 5.0f;
		this.caballos = 0.0f;
		this.asientos = asientos;
		this.orientacionRuedas = 0;
	}
	public Coche(float velocidad, float caballos) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = 5;
		this.orientacionRuedas = 0;
	}
	public Coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = asientos;
		this.orientacionRuedas = orientacionRuedas;
	}
	private float velocidad;
	private float caballos;
	private int asientos;
	private int orientacionRuedas;
	public static float factorConversionCvKw =2.3f;
	
	public void parar() {}
	public void acelerar() {}
	public void desacelerar() {}
	public void girarIzquierda() {}
	public void girarDerecha() {}


	//Metodo static que convierte los cv a kw
	public static float convertirCvKw(float caballos) {
		return caballos / factorConversionCvKw;
	}
	//Metodo static que convierte los kw a cv
	public static float convertirKwCv(float kilowatios) {
		return kilowatios * factorConversionCvKw;
	}
}