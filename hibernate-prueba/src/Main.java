
import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
	//	String jdbcUrl= "jdbc:mysql://localhost:3306/hibernate-demo";
		//String usuario= "root";
		//String password= "";
		
		/*
		creación del objeto SessionFactory. Hibernate buscará por defecto el archivo
		hibernate.cfg.xml, aunque no se le indique, por lo que no es necesario establecerlo
		como parámetro en el método configure
		*/
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Estudiante.class)
				.buildSessionFactory();
		
		// creación de un objeto de tipo Session a partir del SessionFactory
		Session session = factory.getCurrentSession();
		
		try {
		
		//System.out.println("Conectado a la base de datos: " + jdbcUrl);
		//Connection conexion= DriverManager.getConnection(jdbcUrl, usuario, password);
		//System.out.println("Conexión exitosa");
		
			// obtención/manipulación/almacenamiento de objetos
			//INSERT INTO
			Estudiante estudiante = new Estudiante ("Alison", "Triguero Naranjo", 18);
			//Comienza la transacción (un envio del rollback)
			session.beginTransaction();
			//Guardar el objeto
			session.save(estudiante);
			
			//Finaliza y guardar la transacción INSERT INTO en la BBDD
			session.getTransaction().commit();
			
		} 
		finally {
			factory.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
