package vista;

import java.util.Scanner;

import modelo.Cliente;


public class Formulario {
	
	public static Cliente pedirDatosCliente(Scanner scan){
		Cliente cliente=new Cliente();
		
		System.out.println("Dame el dni");
		cliente.setDni(scan.nextLine());
		System.out.println("Dame el nombre");
		cliente.setNombre(scan.nextLine());
		System.out.println("Dame el apellido");
		cliente.setApellido(scan.nextLine());
		System.out.println("Dame direccion");
		cliente.setDireccion(scan.nextLine());
		System.out.println("Dame localidad");
		cliente.setLocalidad(scan.nextLine());
		return cliente;
	}
}
