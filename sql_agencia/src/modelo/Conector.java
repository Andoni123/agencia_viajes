package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Conector {

		private static final String HOST="localhost";
		private static final String BBDD="biblioteca";
		private static final String USER="root";
		private static final String PASSWORD="";
		
		public static Connection con;

		public static void conectar() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jbc:mysql://localhost/agencia_viajes";
				con = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD,USER,PASSWORD);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void cerrar() {
			
		}
	}

