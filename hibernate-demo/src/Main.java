import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hibernate-demo";
		String usuario= "hibernate-demo";
		String password= "hibernate-demo";
		
		try {
			System.out.println("Conectando a la base de datos:" + jdbcUrl);
			
			Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, password);
			
			System.out.println("Conexión exitosa");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
