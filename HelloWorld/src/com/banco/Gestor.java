package com.banco;

public class Gestor {
	
	//Constructores
	public Gestor() {
		this.id=1;
		this.usuario="Marc";
		this.password="12345";
		this.correo="marc@correo.com";
	}
	
	//Atributos
	private int id;
	private String usuario;
	private String password;
	private String correo;
	
	//M�todos "getters" y "setters"
	
	public int getId() {
		return id;
	};
	public void setId(int id) {
		this.id = id;
	};
	public String getUsuario() {
		return usuario;
	};
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	};
	public String getPassword() {
		return password;
	};
	public void setPassword(String password) {
		this.password = password;
	};
	public String getCorreo() {
		return correo;
	};
	public void setCorreo(String correo) {
		this.correo = correo;
	};
}