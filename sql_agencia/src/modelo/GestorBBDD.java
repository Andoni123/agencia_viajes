package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Cliente;

public class GestorBBDD extends Conector{
	
	public static ArrayList <Cliente> getClientes(){
		
		 ArrayList <Cliente> clientes= new ArrayList<>();
		 String sql = "SELECT * FROM clientes";

			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);

				while (rs.next()) {
					Cliente cliente = new Cliente();

					cliente.setDni(rs.getString("dni"));
					cliente.setNombre(rs.getString("nombre"));
					cliente.setApellido(rs.getString("apellido"));
					cliente.setDireccion(rs.getString("direccion"));
					cliente.setLocalidad(rs.getString("localidad"));

					clientes.add(cliente);
				}
			} catch (SQLException e) {
				System.out.println("te revento ver clientes maquina");
				e.printStackTrace();
			}

			return clientes;
		
	}

	public static void registrarCliente(Cliente cliente) throws SQLException {
		
			String sql = "INSERT INTO clientes (dni,nombre,apellidos,direccion,localidad) VALUES (?,?,?,?,?) ";
			PreparedStatement pst = con.prepareStatement(sql);

			try {
				pst.setString(1, Cliente.getDni());
				pst.setString(2, Cliente.getNombre());
				pst.setString(3, Cliente.getApellido());
				pst.setString(4, Cliente.getDireccion());
				pst.setString(3, Cliente.getLocalidad());

				pst.execute();

			} catch (SQLException e) {
				System.out.println("se tea jodido  registrarCliente");
				e.printStackTrace();
				pst.execute();
			}
		}
//	public static void eliminarCliente(Cliente cliente)throws SQLException{
//		String sql = "DELETE FROM clientes (dni,nombre,apellidos,direccion,localidad) VALUES(?,?,?,?,?) ";
//		PreparedStatement pst = con.prepareStatement(sql);
//		
//		try {
//			pst.setString(1, Cliente.getDni());
//			pst.setString(2, Cliente.getNombre());
//			pst.setString(3, Cliente.getApellido());
//			pst.setString(4, Cliente.getDireccion());
//			pst.setString(3, Cliente.getLocalidad());
//
//			pst.execute();
//
//		} catch (SQLException e) {
//			System.out.println("se tea jodido  eliminarCliente");
//			e.printStackTrace();
//			pst.execute();
//		}
//	}
	public static Cliente modificarCliente(Cliente cliente) throws SQLException {
		String sql ="UPDATE clientes SET dni=?,nombre=?,apellido=?,direccion=?,localidad=?";
		PreparedStatement pst = con.prepareStatement(sql);

					try {
						pst.setString(1, cliente.getDni());
						pst.setString(2, cliente.getNombre());
						pst.setString(3, cliente.getApellido());
						pst.setString(4, cliente.getDireccion());
						pst.setString(5, cliente.getLocalidad());
		
					
						pst.execute();
		
					} catch (SQLException e) {
						System.out.println("Peto en modificarCliente");
						e.printStackTrace();
					}
		
				return cliente;
	}

}


