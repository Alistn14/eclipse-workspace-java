package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mensaje_READ {

		public static void main(String[] args) {
		

			try {
				
				//paso 1: Conectar Base de Datos
	Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2: Obtención de un objeto de tipo Statement
				Statement miStatement= conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3: Selección mensaje
				ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM mensaje");
				System.out.println("creado resultset");
				
				//paso 4: Mostrar por consola los datos de todos los clientes
				
				while(miResultSet.next()) {
					System.out.println(miResultSet.getString("texto") +" "+ miResultSet.getString("fecha"));
				
			}
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}

	}
	}
