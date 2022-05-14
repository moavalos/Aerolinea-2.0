package ar.edu.unlam.pb2.aerolinea;

import java.util.ArrayList;

public class Vuelo {
	private String origen;
	private String destino;
	private String fecha;

	private ArrayList<Asiento> asientos;
	private ArrayList<Pasaje> pasajes;
	private ArrayList<Pasajero> pasajeros;

	public Vuelo(String origen, String destino, String fecha) {
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.asientos = new ArrayList<>();
		this.pasajeros = new ArrayList<>();
	}

	public Boolean asignarAsiento(Pasajero pasajero, Asiento asiento) {
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
	}

}
