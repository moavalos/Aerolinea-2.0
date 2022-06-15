package ar.edu.unlam.pb2.aerolinea;

public abstract class Persona {
	
	// es una mierda la superclase persona pero lo dejo asi por las dudas quien sabe
	private String nombre;
	private String apellido;
	private Integer dni;
	
	public Persona(String nombre, String apellido, Integer dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	
	
}
