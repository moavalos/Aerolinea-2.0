package ar.edu.unlam.pb2.aerolinea;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vuelo {
	/*
	 * private String origen; 
	 * private String destino; 
	 * private String fecha;
	 */

	private Integer idVuelo;
	private String aeropuertoOrigen;
	private String aeropuertoDestino;
	private LocalDateTime horaDespegue;
	private LocalDateTime horaAterrizaje;
	private Double precio;

	private ArrayList<Asiento> asientos;
	private ArrayList<Pasaje> pasajes;
	private ArrayList<Pasajero> pasajeros;

	/*
	 * public Vuelo(String origen, String destino, String fecha) { 
	 * 	this.origen = origen; 
	 * 	this.destino = destino; 
	 * 	this.fecha = fecha; 
	 * 	this.asientos = new ArrayList<>(); 
	 * 	this.pasajeros = new ArrayList<>(); }
	 */

	public Vuelo(Integer idVuelo, String aeropuertoOrigen, String aeropuertoDestino, LocalDateTime horaDespegue,
			LocalDateTime horaAteriizaje, Double precio) {
		this.idVuelo = idVuelo;
		this.aeropuertoOrigen = aeropuertoOrigen;
		this.aeropuertoDestino = aeropuertoDestino;
		this.horaDespegue = horaDespegue;
		this.horaAterrizaje = horaAteriizaje;
		this.precio = precio;
	}

	/*public Boolean asignarAsiento(Pasajero pasajero, Asiento asiento) {
		Boolean sePudoAsignar = false;
		for (Pasajero p : pasajeros) {
			if (p.getPasaje() == null) {
				pasajeros.add(p);
				sePudoAsignar = true;

			}

		}
		return sePudoAsignar;

	}

	public Boolean validarAsiento(Vuelo vuelo, Asiento asiento) {
		Boolean asientoOcupado = false;
		for (Pasaje p : pasajes) {
			// if(vuelo.getAsientos().equals(pasajes.getVuelo) &&
			// asientos.equals(pasajes.getAsiento())) {
			asientoOcupado = true;
		}
		return false;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVuelo == null) ? 0 : idVuelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		if (idVuelo == null) {
			if (other.idVuelo != null)
				return false;
		} else if (!idVuelo.equals(other.idVuelo))
			return false;
		return true;
	}

	public int compareTo(Vuelo o) {
		if(this.aeropuertoOrigen.compareTo(o.aeropuertoOrigen) == 0){
			return this.getIdVuelo().compareTo(o.idVuelo);
		}
		return this.aeropuertoOrigen.compareTo(o.aeropuertoOrigen);
	}
	
	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(String aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public String getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public LocalDateTime getHoraDespegue() {
		return horaDespegue;
	}

	public void setHoraDespegue(LocalDateTime horaDespegue) {
		this.horaDespegue = horaDespegue;
	}

	public LocalDateTime getHoraAterrizaje() {
		return horaAterrizaje;
	}

	public void setHoraAterrizaje(LocalDateTime horaAterrizaje) {
		this.horaAterrizaje = horaAterrizaje;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}

	public ArrayList<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(ArrayList<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	/*public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}

	public ArrayList<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(ArrayList<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}*/

}
