package com.ejemplo;

//PRACTICA FINAL: Ejercicio 1, Recogida de datos con GetMapping y PostMapping
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {
	
	@GetMapping("/mostrarHola")
	public String muestraPagina() {
		
		return "ej5-PaginaHolaMundo";
		
	}
	
	// http://localhost:8080/mostrarFormulario
	@GetMapping("/mostrarFormulario")
	public String mostrarFormulario(@RequestHeader("accept-language")String acceptLanguage) {
	System.out.println("El valor de la cabecera accept-language es" + acceptLanguage);
	return "formulario";
	}
	// http://localhost:8080/procesarFormulario
	@PostMapping("/procesarFormulario")
	public String procesarFormulario(@RequestParam("nombre")String nombre, 
		@RequestBody String Body, Model model){
			
		System.out.println("El cuerpo es" + Body);
		// si el usuario no ha introducido ningun valor (null), entonces se iguala a una
		//cadena vacía
		
		String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase();
		System.out.println("El valor enviado por el usuario es " + mensaje);
		
		
		// crear un nuevo elemento en el modelo
		model.addAttribute("mensaje", mensaje);	

	return "hola";
	}
		
		
		
}