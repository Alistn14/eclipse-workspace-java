package com.ejemplo;
import org.springframework.stereotype.Component;

	@Component("mientrenadorBaloncesto")

	public class EntrenadorBaloncesto implements Entrenador {
		
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
		public EntrenadorBaloncesto(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
		}
		
		@Override
		public String getEntrenamiento() {
			return "Lanzar 30 tiros a canasta";
		}

		@Override
		public int getExperiencia() {
			return experienciaServicio.getExperiencia();
		}

		@PostConstruct
		public void init() {
			
		System.out.println("Inicialización Basquet");
		
		}
		
		@PreDestroy
		public void destroy() {
		
			System.out.println("Destrucción Basquet");
		
		}
	}


