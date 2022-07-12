package com.ejemplo;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	@RequestMapping
	public String muestraPagina() {
		
		return "ej5-PaginaHolaMundo";
	
		
	}
	// http://localhost:8080/mostrarFormulario
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() {
	// /WEB-INF/vista/formulario.jsp
	return "formulario";
	}
	// http://localhost:8080/procesarFormulario
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(HttpServletRequest request, Model model) {
	// /WEB-INF/vista/PaginaPrincipal.jsp
		
		// se extrae el valor del atributo name del campo del formulario formulario
		String nombre = request.getParameter("nombre");
		String edad= request.getParameter("edad");
		// si el usuario no ha introducido ningun valor (null), entonces se iguala a una
		//cadena vacía
		
		String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase();
		System.out.println("El valor enviado por el usuario es " + mensaje);
		
		String texto = (edad == null) ? "undefined" : edad.toUpperCase();
		System.out.println("El valor enviado por el usuario es " + texto);
		
		// crear un nuevo elemento en el modelo
		model.addAttribute("mensaje", mensaje);	
		
	return "hola";
	}
		
		
		
}