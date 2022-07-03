package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mensaje_CREATE {

		public static void main(String[] args) {

			try {
				
				//paso 1: Conectar Base de Datos
				
	Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2: Obtención de un objeto de tipo Statement
				Statement miStatement=conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3: Generar un nuevo mensaje con atributos 
				String instruccion1SQL= "INSERT INTO mensaje (id, id_origen, id_destino, texto) VALUES "
						+ "(2, 1, 1, 'Adiós')";
				
				//paso 4 Insertar los datos del nuevo mensaje en la BD
				miStatement.executeUpdate(instruccion1SQL);
				System.out.println("Datos insertados correctamente");
				
				
			
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}

	}


		}


