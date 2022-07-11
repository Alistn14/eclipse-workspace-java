package metodoSetter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProfesores2 {

	public static void main(String[] args) {
		
		
		//Abrir contexto a partir del archivo de configuración

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Solicitar bean del objeto

		Profesor2 Marc = contexto.getBean("miProfesor", Profesor2.class);
		System.out.println(Marc.getClases());
		System.out.println(Marc.getExperiencia());
		
		//Cerrar contexto
		contexto.close();
	}

}
