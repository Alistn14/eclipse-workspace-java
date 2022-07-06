package conectaBD;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaDB {

	public static void main(String[] args) {
		try {
			
			//paso 1
			Connection conexion =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexion.createStatement();
			System.out.println("creado statement");
			//paso 3 
			String instruccionSQL= "DELETE FROM PRODUCTOS  WHERE CODIGOARTICULO='AR77'";
			//paso 4
			miStatement.executeUpdate(instruccionSQL);
			System.out.println("Datos ELIMINADOS correctamente");
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado");
			e.getStackTrace();
	}
		
}
}