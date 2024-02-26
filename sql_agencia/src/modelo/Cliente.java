package modelo;

public class Cliente {

	private static String dni;
	private static String nombre;
	private static String apellido;
	private static String direccion;
	private static String localidad;
	
	public static  String getDni() {
		return dni;
	}
	public  static void setDni(String dni) {
		Cliente.dni = dni;
	}
	public  static String getNombre() {
		return nombre;
	}
	public  static void setNombre(String nombre) {
		Cliente.nombre = nombre;
	}
	public static String getApellido() {
		return apellido;
	}
	public static void setApellido(String apellido) {
		Cliente.apellido = apellido;
	}
	public  static String getDireccion() {
		return direccion;
	}
	public static void setDireccion(String direccion) {
		Cliente.direccion = direccion;
	}
	public  static String getLocalidad() {
		return localidad;
	}
	public static void setLocalidad(String localidad) {
		Cliente.localidad = localidad;
	}
	
}
