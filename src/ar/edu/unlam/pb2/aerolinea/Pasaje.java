package ar.edu.unlam.pb2.aerolinea;

public class Pasaje {
	private String asiento;
	private Double precio;
	private Vuelo vuelo;
	
	
	public Pasaje(String asiento, Double precio, Vuelo vuelo) {
		this.asiento = asiento;
		this.precio = precio;
		this.vuelo= vuelo;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public Double getPrecio() {
		return precio;
	}

	public Double setPrecio(Double precio) {
		return this.precio = precio;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	
	
	

}
