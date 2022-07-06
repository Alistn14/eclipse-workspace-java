package PracticaModulo4.ConectaBancoBD;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

public class Gestor_CREATE {


		public static void main(String[] args) {

			try {
				
				//paso 1: Conectar Base de Datos
  Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2: Obtenci�n de un objeto de tipo Statement
				Statement miStatement=conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3 Generar nuevo gestor con atributos 
				String instruccionSQL= "INSERT INTO gestor (usuario, password, correo) VALUES ('gestor4','gestor4', 'gestor4@correo.com')";

				//paso 4 insertar datos del nuevo gestor en la BD
				miStatement.executeUpdate(instruccionSQL);
				System.out.println("Datos insertados correctamente");
				
				
			
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}

	}


		}




