package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Gestor_DELETE {

		public static void main(String[] args) {
			

			try {
				
				//paso 1
Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2
				Statement miStatement= conexionbanco.createStatement();
				System.out.println("creado statement");
			
				//paso 3: Generar datos a eliminar de gestor
				String eliminacionSQL= "DELETE FROM gestor where id='2'";
				
				//paso 4: Insertar la eliminacion de gestor
				miStatement.executeUpdate(eliminacionSQL);
				System.out.println("Datos eliminados correctamente");
				
			
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}




		}

	}

