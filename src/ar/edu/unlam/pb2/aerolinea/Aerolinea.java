package ar.edu.unlam.pb2.aerolinea;

import java.util.ArrayList;

public class Aerolinea {

	private String nombre;
	private ArrayList<Pasaje> listaDePasajes;
	private Pasajero pasajero;
	
	public Aerolinea(String nombre){
		this.nombre = nombre;
		this.listaDePasajes = new ArrayList<>();
		
	}
	public Boolean agregarPasajeALaAerolinea(Pasajero pasajero, Pasaje pasaje) {
		Boolean sePudoAgregar=false;
		if (pasajero.getPasaje()!=null) {
			this.listaDePasajes.add(pasaje);
			sePudoAgregar=true;
		}
		return sePudoAgregar;
	}
	
	
	
	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
