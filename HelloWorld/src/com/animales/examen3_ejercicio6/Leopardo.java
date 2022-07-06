package com.animales.examen3_ejercicio6;

public class Leopardo extends Animales{
	
	//constructor
	public Leopardo (int Patas, boolean Pelaje) {
		this.Patas= Patas;
		this.Pelaje= Pelaje;
	}
	
	//atributos
	private int Patas;
	private boolean Pelaje;
	
	//m�todos
	public void Correr () {}
	public void Rugir () {}
	
	@Override
	public String getComer() {
		// TODO Auto-generated method stub
		return null;
	}

}
