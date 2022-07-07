package com.fullstack.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class ManejadorExcepciones {
	// maneja todo tipo de excepciones (Exception.class)
	/*@ExceptionHandler(Exception.class)
	public String manejadorExcepcion(HttpServletRequest req, ResponseStatusException
	ex){
		System.out.println("Manejador de excepciones");
		// redirige a la pagina error.jsp
		return "error";
	}*/
	// maneja solamente la excepcion ResponseStatusException
	/*@ExceptionHandler(ResponseStatusException.class)
	public String manejadorResponseStatusException(HttpServletRequest req,
	ResponseStatusException ex){
		System.out.println("Manejador de la excepcion ResponseStatusException");
		// redirige a la pagina error.jsp
		return "error";
	}*/
	@RequestMapping(value = "errors", method = RequestMethod.GET)
	public String renderErrorPage(HttpServletRequest httpRequest, Model model) {
		String msg = "";
		// obtiene el codigo HTTP
		int codigo = (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
		switch (getErrorCode(httpRequest)) {
			case 400: {
				msg = "Codigo de estado: 400 - Peticion erronea";
				break;
			}
			case 401: {
				msg = "Codigo de estado: 401 - No autorizado";
				break;
			}
			case 404: {
				msg = "Codigo de estado: 404 - No encontrado";
				break;
			}
			case 500: {
				msg = "Codigo de estado: 500 - Error interno";
				break;
			}
		}
		System.out.println("msg");
		model.addAttribute("msg", msg);
		return "error";
	}

	private int getErrorCode(HttpServletRequest httpRequest) {
		// TODO Auto-generated method stub
		return 0;
	}
}