package ar.edu.unlam.pb2.aerolinea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestAerolinea {

	@Test
	// 1
	public void queSePuedaComprarUnPasajeParaUnPasajeroEnUnVuelo() {
		/*
		 * Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 900.0, true); //
		 * el precio es el pasaje // si el saldo del pasajero es menor al precio del
		 * pasaje, esto daria falso. //(cambiar el precio para corroborar) Vuelo vuelo1
		 * = new Vuelo("Bariloche", "Mendoza", "11/05/2022"); Pasaje pasaje1 = new
		 * Pasaje("A1", 500.0, vuelo1); assertTrue(pasajero.comprarPasaje(pasajero,
		 * pasaje1));
		 */

	}

	@Test
	// 2
	public void queElMismoPasajeroNoPuedaComprarDosPasajesParaelMismoVuelo() {
		/*
		 * Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 500.0, false);
		 * Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza", "11/05/2022"); Pasaje
		 * pasaje1 = new Pasaje("A1", 500.0, vuelo1); Pasaje pasaje2 = new Pasaje("A2",
		 * 500.0, vuelo1); // si la linea 29 se descomenta,, entonces el pasajero va a
		 * comprar dos pasajes y el test va a estar rojo(necesito empezar a comentar)
		 * //pasajero.comprarPasaje(pasajero, pasaje1);
		 * assertTrue(pasajero.comprarPasaje(pasajero, pasaje2));
		 */

	}

	@Test
	// 3
	public void queLosPasajerosVipAlCompraUnPAsajeSeLeAplique5PorcientoMenos() {
		/*
		 * Double porcentaje = 5.0; Pasajero pasajero = new Pasajero("pepe", "tonto",
		 * 5782252, 10000.0, false); Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza",
		 * "11/05/2022"); Pasaje pasaje1 = new Pasaje("A1", 500.0, vuelo1);
		 * 
		 * pasajero.comprarPasaje(pasajero, pasaje1);
		 * 
		 * Double valorEsperado = pasajero.getSaldo() * (porcentaje/100); Double
		 * valorObtenido = pasajero.getPasaje().getPrecio(); assertEquals(valorEsperado,
		 * valorObtenido); // el asiento ya esta asignado, no hace falta el test 4.que
		 * se pueda asignar un asiento para un pasajero en un vuelo
		 */
	}

	@Test
	// 5
	public void queNoSePuedaAsignarUnAsientoAUnVueloSiElAsientoEstaOcupado() {
		/*
		 * Pasajero pasajero = new Pasajero("pepe", "tonto", 5782252, 500.0, false);
		 * Vuelo vuelo1 = new Vuelo("Bariloche", "Mendoza", "11/05/2022"); Pasaje
		 * pasaje1 = new Pasaje("A1", 250.0, vuelo1); Pasajero pasajero2 = new
		 * Pasajero("pepe", "tonto", 5782252, 500.0, true);
		 * 
		 * pasajero2.comprarPasaje(pasajero2, pasaje1); pasajero.comprarPasaje(pasajero,
		 * pasaje1);
		 * 
		 * Asiento asiento = new Asiento("A1");
		 * 
		 * //assertTrue(vuelo1.asignarAsiento(pasajero, asiento));
		 */

	}

	// 6
	@Test
	public void queNoSePuedaAsignarUnAsientoSiElAvionYaDespego() {
		/*
		 * Pasajero pasajero2 = new Pasajero("pepe", "tonto", 5782252, 500.0, true);
		 * Vuelo vuelito = new Vuelo("Bariloche", "Mendoza", "11/05/2022"); Aerolinea
		 * aerolinea = new Aerolinea("Aerolineas Argentinas");
		 */
	}

	// 7

	@Test
	public void queSePuedaObtenerUnaListaDePasajerosQueNoVolaron() {

	}

	@Test
	public void queSePuedaAgregarUnPasajeALaAerolinea() {
		/*
		 * Aerolinea ezeiza = new Aerolinea("ezeiza"); Pasajero pasajero = new
		 * Pasajero("pepe", "tonto", 5782252, 500.0, false); Vuelo vuelo1 = new
		 * Vuelo("Bariloche", "Mendoza", "11/05/2022"); Pasaje pasaje1 = new
		 * Pasaje("A1", 250.0, vuelo1);
		 * 
		 * pasajero.comprarPasaje(pasajero, pasaje1);
		 * 
		 * assertTrue(ezeiza.agregarPasajeALaAerolinea(pasajero, pasaje1));
		 */

	}

	@Test
	public void queSePuedaAgregarUnvueloAUnaAerolinea() {
		Aerolinea aa = new Aerolinea("aerolineas");
		LocalDateTime horaDespegue = LocalDateTime.of(2022, 07, 30, 12, 15, 0);
		LocalDateTime horaAteriizaje = LocalDateTime.of(2022, 07, 30, 14, 35, 0);
		String aeropuertoOrigen = "AEP";
		String aeropuertoDestino = "BRC";
		Integer idVuelo = 1;
		Vuelo vuelo = new Vuelo(idVuelo, aeropuertoOrigen, aeropuertoDestino, horaDespegue, horaAteriizaje, 5000.0);
		assertTrue(aa.agregar(vuelo));

	}

	@Test
	public void queSePuedaVenderUnPasajeAUnVuelo() {
		Aerolinea aa = new Aerolinea("aerolineas");
		LocalDateTime horaDespegue = LocalDateTime.of(2022, 07, 30, 12, 15, 0);
		LocalDateTime horaAteriizaje = LocalDateTime.of(2022, 07, 30, 14, 35, 0);
		String aeropuertoOrigen = "AEP";
		String aeropuertoDestino = "BRC";
		Integer idVuelo = 1;
		Vuelo vuelo = new Vuelo(idVuelo, aeropuertoOrigen, aeropuertoDestino, horaDespegue, horaAteriizaje, 5000.0);

		Integer dni = 1;
		Pasajero pasajero = new PasajeroVip("juana", "perez", 4423432, 550.0, false);
		Pasaje pasaje = new Pasaje(vuelo, pasajero);
		aa.agregar(pasaje);

		assertTrue(aa.agregar(vuelo));

		assertNotNull(pasaje);
		assertEquals(4500, pasaje.getPrecio(), 0.01);

	}

	@Test
	public void queSePuedaVenderUnPasajeAUnVuelo1() {
		Aerolinea aa = new Aerolinea("aerolineas");
		LocalDateTime horaDespegue = LocalDateTime.of(2022, 07, 30, 12, 15, 0);
		LocalDateTime horaAteriizaje = LocalDateTime.of(2022, 07, 30, 14, 35, 0);
		String aeropuertoOrigen = "AEP";
		String aeropuertoDestino = "BRC";
		Integer idVuelo = 1;
		Vuelo vuelo = new Vuelo(idVuelo, aeropuertoOrigen, aeropuertoDestino, horaDespegue, horaAteriizaje, 5000.0);

		Integer dni = 1;
		Pasajero pasajero = new PasajeroVip("juana", "perez", 4423432, 550.0, false);
		Pasaje pasaje = new Pasaje(vuelo, pasajero);

		assertTrue(aa.agregar(vuelo));

		assertNotNull(pasaje);
		assertEquals(4500, pasaje.getPrecio(), 0.01);
		String asciento = "3F";
		aa.asignarAsientoParaUnPasaje(pasaje, asciento);

		aa.subirAlvuelo(pasaje);

		List<Pasajero> pasajerosAusentes = aa.obternerPasajerosAusentes(vuelo);

	}

	@Test
	public void culquierda() {
		Aerolinea aa = new Aerolinea("aerolineas");
		LocalDateTime horaDespegue = LocalDateTime.of(2022, 07, 30, 12, 15, 0);
		LocalDateTime horaAteriizaje = LocalDateTime.of(2022, 07, 30, 14, 35, 0);
		String aeropuertoOrigen = "AEP";
		String aeropuertoDestino = "BRC";
		Integer idVuelo = 1;

		Vuelo vuelo = new Vuelo(idVuelo, aeropuertoOrigen, aeropuertoDestino, horaDespegue, horaAteriizaje, 4000.0);

		aeropuertoOrigen = "AEP";
		aeropuertoDestino = "IGR";
		idVuelo = 2;

		Vuelo vuelo2 = new Vuelo(idVuelo, aeropuertoOrigen, aeropuertoDestino, horaDespegue, horaAteriizaje, 8000.0);

		aeropuertoOrigen = "MDZ";
		aeropuertoDestino = "BRC";
		idVuelo = 3;

		Vuelo vuelo3 = new Vuelo(idVuelo, aeropuertoOrigen, aeropuertoDestino, horaDespegue, horaAteriizaje, 6000.0);

		aeropuertoOrigen = "AEP";
		aeropuertoDestino = "COR";
		idVuelo = 50;

		Vuelo vuelo50 = new Vuelo(idVuelo, aeropuertoOrigen, aeropuertoDestino, horaDespegue, horaAteriizaje, 2000.0);

		aa.agregar(vuelo2);
		aa.agregar(vuelo3);
		aa.agregar(vuelo50);
		aa.agregar(vuelo);

		for (Vuelo vuelo1 : aa.getVuelos()) {
			System.out.println(vuelo1.getIdVuelo() + vuelo1.getAeropuertoOrigen() + vuelo1.getAeropuertoDestino()
					+ "Precio: " + vuelo1.getPrecio());
		}

		System.out.println("------------------------------");

		for (Vuelo vuelo1 : aa.obtenerListaDeVuelosOrdenadasPorPrecioYID()) {
			System.out.println(vuelo1.getIdVuelo() + vuelo1.getAeropuertoOrigen() + vuelo1.getAeropuertoDestino()
					+ "Precio: " + vuelo1.getPrecio());
		}

	}

}
