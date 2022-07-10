package com.ejemplo;
import org.springframework.stereotype.Component;

	@Component("mientrenadorFutbol")
	public class EntrenadorFutbol implements Entrenador {
		
		protected String email;
		
		protected String equipo; 
		
		public String getEmail() {
			return email;
			}
		
		public void setEmail(String email) {
			System.out.println("Inyección de un literal en un método setter: " + email);
			this.email = email;
			}
			public String getEquipo() {
			return equipo;
			}
			public void setEquipo(String equipo) {
			System.out.println("Inyección de un literal en un método setter: " + equipo);
			this.equipo = equipo;
			}
		

		private ExperienciaServicio experienciaServicio;

		// constructor con el servicio inyectado
		public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
		}
		@Override
		public String getEntrenamiento() {
		return "Correr durante 30 minutos";
		}
		
		// implementación del método del servicio inyectado
		
		@Override
		public int getExperiencia() {
		return experienciaServicio.getExperiencia();
		}
		
		@Override
		public void init() {
		System.out.println("Inicialización Futbol");
		}
		
		// Este método se invocará cuando se cierre el contexto
		
		@Override
		public void destroy() {
		System.out.println("Destrucción Futbol");
		}
		
		
	}
		
		

		
		





