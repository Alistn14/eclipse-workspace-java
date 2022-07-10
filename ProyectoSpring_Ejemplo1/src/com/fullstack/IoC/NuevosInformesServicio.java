package com.fullstack.IoC;

//la clase que implemente la interfaz, capaz de crear informes

public class NuevosInformesServicio implements InformesServicio {

//método instanciado automáticamente
	@Override
	//Característica común que presentaran todas las clases empleados

	public String getInforme() {
		// TODO Auto-generated method stub
		return "Presentación de un nuevo informe";
	}

}
