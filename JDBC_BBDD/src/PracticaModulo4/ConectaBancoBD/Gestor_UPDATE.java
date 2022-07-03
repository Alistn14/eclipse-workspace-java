package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Gestor_UPDATE {

	public static void main(String[] args) {
		

		try {
			
			//paso 1
			
	Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			
			//paso 2
			Statement miStatement=conexionbanco.createStatement();
			System.out.println("creado statement");
			
			//paso 3 Actualizacion de un gestor 
			String actualizacionSQL= "UPDATE gestor SET correo= 'new@correo.com' where id=3";
			
			//paso 4 Insertar datos a actualizar
			miStatement.executeUpdate(actualizacionSQL);
			System.out.println("Datos actualizados correctamente");
			
			
		
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado u otro error");
			e.getStackTrace();

	}

}


	}
