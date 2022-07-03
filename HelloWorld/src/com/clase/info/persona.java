package com.clase.info;

public abstract class persona implements PersonaInterfaz{
	
	//Atributos
	protected int id;
	protected int edat;
	protected int telefono;
	
	//Constructor
	public persona() {
		this.id = 3;
		this.edat = 18;
		this.telefono = 639639639;
	}
	public persona(int id,int edat, int telefono) {
		this.id = id;
		this.edat = edat;
		this.telefono = telefono;
	}
	//Metodos
	public void mostrarInfo() {
		getId();
		getEdat();
		getTelefono();
	}
	public int getId() {
		return id;
	};
	public void setId(int id) {
		this.id = id;
	};
	public int getEdat() {
		return edat;
	};
	public void setEdat(int edat) {
		this.edat = edat;
	};
	public int getTelefono() {
		return telefono;
	};
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	};
	//Metodo abstracto no haría falta porque ya existen los override en las herencias.
	//public abstract void mostrarID();
}