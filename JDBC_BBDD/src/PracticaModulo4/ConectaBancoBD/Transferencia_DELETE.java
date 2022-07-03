package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transferencia_DELETE {

		public static void main(String[] args) {
			
			try {
				
				//paso 1: Conectar con la Base de Datos
		Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2: Obtención de un objeto de tipo Statement
				Statement miStatement= conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3: Generar los datos a eliminar de cliente
				String eliminacionSQL= "DELETE FROM transferencia where id='2'";
				
				//paso 4 Insertar la eliminacion de cliente
				miStatement.executeUpdate(eliminacionSQL);
				System.out.println("Datos eliminados correctamente");
				
			
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}




		}

	}
