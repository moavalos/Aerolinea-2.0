package ar.edu.unlam.pb2.aerolinea;

public class Pasajero extends Persona {

	private Boolean esVip;
	private Double saldo;
	private Pasaje pasaje;
	
	// LOS METODOS Y VARIABLES VIP PASARIAN A SER UNA CLASE APARTE PERO LO VOY A DEJAR ASI 
	private Boolean vip;
	
	private Integer dni;

	public Pasajero(String nombre, String apellido, Integer dni, Double saldo, Boolean vip) {
		super(nombre, apellido, dni);
		this.vip = vip;
		this.saldo = saldo;
		this.pasaje = pasaje;
		this.dni = dni;

	}

	public Boolean comprarPasaje(Pasajero pasajero, Pasaje pasaje) {
		Boolean sePudoComprar = false;
		Double descuento = 0.0;
		if (pasajero.getVip()) {
			descuento = 5.0;
		}
		pasaje.setPrecio(aplicarDescuentoVip(descuento, pasaje.getPrecio()));
		if (pasajero.getSaldo() >= pasaje.getPrecio() && pasajero.getPasaje() == null) {
			pasajero.setPasaje(pasaje);
			sePudoComprar = true;
		}
		return sePudoComprar;
		/*
		 * Boolean sePudoComprar=false; 
		 * if (pasajero.getSaldo()>=pasaje.getPrecio() && pasajero.getPasaje()==null && pasajero.getEsVip() == true) { 
		 * Double precioFinal = pasaje.setPrecio(pasaje.getPrecio()*0.05);
		 * pasajero.setPasaje(pasaje); sePudoComprar=true; 
		 * }else{  
		 * if (pasajero.getSaldo()>=pasaje.getPrecio() && pasajero.getPasaje()==null) {
		 * pasajero.setPasaje(pasaje); sePudoComprar=true; 
		 * } 
		 * } return sePudoComprar;
		 */

	}

	public Double aplicarDescuentoVip(Double pocentajeDescuento, Double importePasaje) {
		return importePasaje - (importePasaje * (pocentajeDescuento / 100));
	}

//	public Double esVip(Pasajero pasajero, Pasaje pasaje){
//		Integer precioActual = pasaje.getPrecio(); 
//		Double descuento= 0.05;
//		Double precioFinal=0.0;
//	if (pasajero.getEsVip()==true) {
//		precioFinal= precioActual*descuento;
//		}
//	return precioFinal;
//	}

	public Boolean getVip() {
		return this.vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
