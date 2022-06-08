package ar.edu.unlam.pb2.aerolinea;

public class Pasaje {
	// LO QUE ESTA COMENTADO PERTENECE A LA VERSION DEL PARCIAL
	
	/*private String asiento;
	private Double precio;
	private Vuelo vuelo;*/
	
	private Vuelo vuelo;
	private Pasajero pasajero;
	private Double precio;
	private String asciento;
	private boolean chequeado;
	
	public Pasaje(Vuelo vuelo, Pasajero pasajero) {
		//this.asiento = asiento;
		this.vuelo = vuelo;
		this.pasajero = pasajero;
		this.precio = calcularPrecio(vuelo, pasajero);
		this.chequeado=false;
	}
	private Double calcularPrecio(Vuelo vuelo2, Pasajero pasajero2) {
		Double precioPasaje = vuelo.getPrecio();
		Double descuento = 0.0;
		if (pasajero2 instanceof PasajeroVip)
			descuento = precioPasaje * 0.1;
		return precioPasaje - descuento;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setAsciento(String asciento) {
		this.asciento = asciento;

	}

	public String getAsciento() {
		return asciento;
	}
	
	

	public boolean isChequeado() {
		return chequeado;
	}

	public void setChequeado(boolean chequeado) {
		this.chequeado = chequeado;
	}

	public void subirAlvuelo() {
		this.chequeado=true;
		
	}

/*	public String getAsiento() {
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
	}*/
	
	
	
	

}
