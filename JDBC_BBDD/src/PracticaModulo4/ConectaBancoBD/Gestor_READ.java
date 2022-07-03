package PracticaModulo4.ConectaBancoBD;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	
public class Gestor_READ {

		public static void main(String[] args) {

			try {
				
				//paso 1
				
	Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2
				Statement miStatement= conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3 conexion con la DB gestor
				ResultSet miResultSet= miStatement.executeQuery("SELECT * FROM gestor");
				System.out.println("creado resultset");
				
				//paso 4
				while(miResultSet.next()) {
					System.out.println(miResultSet.getString("usuario") +" "+ miResultSet.getString("password"));
			
				
			}
			}
			catch (SQLException e) {
				System.out.println("no esta conectado");
				e.getStackTrace();

		}
			

		}

		}



