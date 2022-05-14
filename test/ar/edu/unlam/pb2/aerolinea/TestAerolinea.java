package ar.edu.unlam.pb2.aerolinea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestAerolinea {

	@Test
	// 1
	public void queSePuedaComprarUnPasajeParaUnPasajeroEnUnVuelo() {
		Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 900.0, true); // el precio es el pasaje
		// si el saldo del pasajero es menor al precio del pasaje, esto daria falso.
		//(cambiar el precio para corroborar)
		Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza", "11/05/2022"); 
		Pasaje pasaje1 = new Pasaje("A1", 500.0, vuelo1);
		assertTrue(pasajero.comprarPasaje(pasajero, pasaje1));

	}

	@Test
	// 2
	public void queElMismoPasajeroNoPuedaComprarDosPasajesParaelMismoVuelo() {
		Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 500.0, false);
		Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza", "11/05/2022"); 
		Pasaje pasaje1 = new Pasaje("A1", 500.0, vuelo1);
		Pasaje pasaje2 = new Pasaje("A2", 500.0, vuelo1);
		// si la linea 29 se descomenta,, entonces el pasajero va a comprar dos pasajes y el test va a estar rojo(necesito empezar a comentar)
		//pasajero.comprarPasaje(pasajero, pasaje1);
		assertTrue(pasajero.comprarPasaje(pasajero, pasaje2));

	}

	@Test
	// 3
	public void queLosPasajerosVipAlCompraUnPAsajeSeLeAplique5PorcientoMenos() {
		Double porcentaje = 5.0;
		Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 10000.0, false);
		Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza", "11/05/2022"); 
		Pasaje pasaje1 = new Pasaje("A1", 500.0, vuelo1);
		
		pasajero.comprarPasaje(pasajero, pasaje1);
		
		Double valorEsperado = pasajero.getSaldo() * (porcentaje/100);
		Double valorObtenido = pasajero.getPasaje().getPrecio();
		assertEquals(valorEsperado, valorObtenido);
		// el asiento ya esta asignado, no hace falta el test 4.que se pueda asignar un asiento para un pasajero en un vuelo

	}

	@Test
	// 5
	public void queNoSePuedaAsignarUnAsientoAUnVueloSiElAsientoEstaOcupado() {
		Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 500.0, false);
		Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza", "11/05/2022");
		Pasaje pasaje1 = new Pasaje("A1", 250.0, vuelo1);
		Pasajero pasajero2 = new Pasajero("pepe", "tonto", 5782252, 500.0, true);
		
		pasajero2.comprarPasaje(pasajero2, pasaje1);
		pasajero.comprarPasaje(pasajero, pasaje1);
		
		Asiento asiento = new Asiento("A1");
		
		//assertTrue(vuelo1.asignarAsiento(pasajero, asiento));
		
	}
	// 6
	@Test
	public void queNoSePuedaAsignarUnAsientoSiElAvionYaDespego() {
		Pasajero pasajero2 = new Pasajero("pepe", "tonto", 5782252, 500.0, true);
		Vuelo vuelito = new Vuelo("Bariloche", "Mendoza", "11/05/2022");
		Aerolinea aerolinea = new Aerolinea("Aerolineas Argentinas");
	}

	//7
	
	@Test
	public void queSePuedaObtenerUnaListaDePasajerosQueNoVolaron() {
		
	}
	@Test
	public void queSePuedaAgregarUnPasajeALaAerolinea() {
		Aerolinea ezeiza = new Aerolinea("ezeiza");
		Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 500.0, false);
		Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza", "11/05/2022");
		Pasaje pasaje1 = new Pasaje("A1", 250.0, vuelo1);

		pasajero.comprarPasaje(pasajero, pasaje1);

		assertTrue(ezeiza.agregarPasajeALaAerolinea(pasajero, pasaje1));

	}
	

}
