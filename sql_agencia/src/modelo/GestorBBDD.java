package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Cliente;

public class GestorBBDD extends Conector{

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
	}


