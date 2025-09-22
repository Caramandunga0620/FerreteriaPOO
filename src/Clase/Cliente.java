package Clase;

public class Cliente {
		
		private String nombre;
		private String dni;
		
		public Cliente(String nombre, String dni)
		{
			this.nombre = nombre;
			this.dni = dni;
		}
		
		public String getNombre() {
			return nombre;
		}
		public String getDni() {
			return dni;
		}
		
		public void comprar() {
	        System.out.println(nombre + " está realizando una compra.");
	    }
		
		public void saludar() {
		    System.out.println("Hola, soy " + nombre + " y vengo a comprar.");
		} 
	package Clase;

public class Cliente {
		
	private String nombre;
	private String dni;
		
	public Cliente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
		
	public String getNombre() {
		return nombre;
	}
		
	public String getDni() {
		return dni;
	}
	
	public void comprar() {
		System.out.println(nombre + " está realizando una compra.");
	}
	
	public void saludar() {
		System.out.println("Hola, soy " + nombre + " y vengo a comprar.");
	}
	
	// Nuevo método para modificar los datos del cliente
	public void modificar(String nuevoNombre, String nuevoDni) {
		this.nombre = nuevoNombre;
		this.dni = nuevoDni;
		System.out.println("Datos del cliente actualizados.");
	}

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Fernando", "12345678");
		cliente1.saludar();
		cliente1.comprar();
		
		System.out.println("---");
		System.out.println("Modificando los datos del cliente...");
		cliente1.modificar("Ana", "87654321");
		System.out.println("---");

		
		System.out.println("Datos del cliente después de la modificación:");
		System.out.println("Nombre: " + cliente1.getNombre());
		System.out.println("DNI: " + cliente1.getDni());
	}
}

		public static void main(String[] args) {
			Cliente cliente1 = new Cliente("Fernando", "12345678");
			cliente1.saludar();
	        cliente1.comprar();
		}
	}

