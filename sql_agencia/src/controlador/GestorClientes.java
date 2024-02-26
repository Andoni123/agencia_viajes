package controlador;

import java.sql.SQLException;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Conector;
import modelo.GestorBBDD;
import vista.Formulario;

public class GestorClientes extends  Conector {

	public static void registrarCliente(Scanner scan) throws SQLException {
		Conector.conectar();
		Cliente cliente = Formulario.pedirDatosCliente(scan);
		GestorBBDD.registrarCliente(cliente);
		Conector.cerrar();
	}
	public static void verClientes(Scanner scan) {
		
	}
	
	


}
