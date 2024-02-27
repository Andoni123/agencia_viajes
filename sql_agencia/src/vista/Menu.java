package vista;

import java.sql.SQLException;
import java.util.Scanner;

import controlador.GestorClientes;

public class Menu {
	

	static Scanner scan= new Scanner (System.in);

	static int eleccion;

	public static void main(String[] args) throws SQLException {
		final int GESTIONCLIENTES = 1;
		final int GESTIONRESERVA= 2;
		final int GESTIONHOTEL = 3;
		final int SALIR = 0;



		eleccion= Integer.parseInt(scan.nextLine());
		do {
		switch(eleccion) {
		case GESTIONCLIENTES:
			gestionClientes();
			break;
		case GESTIONRESERVA:
			gestionReserva();
			break;
		case GESTIONHOTEL:
			gestionHotel();
			break;
		case SALIR:
			System.out.println("Salir....");
		}
		}while (eleccion!=0);
	}

	private static void gestionHotel() {
		final int SALIR =0;
		final int ALTA =1;
		final int CREARHABITACION=2;
		
		eleccion= Integer.parseInt(scan.nextLine());
		do {
			switch(eleccion) {
			case ALTA:
				break;
			case CREARHABITACION:
				break;
			case SALIR:
				System.out.println("Salir...");
				break;
			}
		}while(eleccion!=0);
	}

	private static void gestionReserva() {
		final int SALIR =0;
		final int REALIZARESERVA=1;
		final int ANULARESERVA=2;

		eleccion= Integer.parseInt(scan.nextLine());
		do {
			switch(eleccion) {
			case REALIZARESERVA:
				break;
			case ANULARESERVA:
				break;
			case SALIR:
				System.out.println("Salir...");
				break;
			}
		}while(eleccion!=0);
	}
	

	private static void gestionClientes() throws SQLException {
		final int SALIR =0;
		final int REGISTRAR = 1;
		final int LISTAR_CLIENTES = 2;
		final int ELIMINAR_CLIENTES = 3;
		final int MODIFICAR_DATOS_CLIENTE = 4;
		
		do {
			//MOSTRAR MENU
			Visor.mostrarMenuClientes();
			eleccion= Integer.parseInt(scan.nextLine());
			switch(eleccion) {
			case REGISTRAR:
				GestorClientes.registrarCliente(scan);
				break;
			case LISTAR_CLIENTES:
				GestorClientes.verClientes(scan);
				break;
			case ELIMINAR_CLIENTES:
				GestorClientes.eliminarCliente(scan);
			case SALIR:
				System.out.println("Salir...");
				break;
			}
		}while(eleccion!=0);
	}
	}


