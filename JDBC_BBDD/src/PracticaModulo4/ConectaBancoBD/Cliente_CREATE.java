package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cliente_CREATE {

		public static void main(String[] args) {

			try {
				
				//paso 1: Conectar Base de Datos
				
	Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2: Obtención de un objeto de tipo Statement
				Statement miStatement=conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3: Generar un nuevo cliente con atributos 
				String instruccion1SQL= "INSERT INTO cliente (id, id_gestor, usuario, password, correo, saldo) VALUES "
						+ "(4, 1, 'Alis', 'basesdedatos1', alis@correo.com, 10000)";
				
				//paso 4 Insertar los datos del nuevo cliente en la BD
				miStatement.executeUpdate(instruccion1SQL);
				System.out.println("Datos insertados correctamente");
				
				
			
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}

	}


		}



