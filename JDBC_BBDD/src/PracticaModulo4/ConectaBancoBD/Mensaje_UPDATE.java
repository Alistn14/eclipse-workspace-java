package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mensaje_UPDATE {

		public static void main(String[] args) {

			try {
				
				//paso 1: Conectar Base de Datos
	Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2: Obtención de un objeto de tipo Statement
				Statement miStatement=conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3: Generar la actualizacion de un mensaje 
				String actualizacionSQL= "UPDATE mensaje SET texto='Buenas tardes' where id=1";
				
				//paso 4 Insertar los datos a actualizar
				miStatement.executeUpdate(actualizacionSQL);
				System.out.println("Datos actualizados correctamente");
				
				
			
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}

	}


		}

