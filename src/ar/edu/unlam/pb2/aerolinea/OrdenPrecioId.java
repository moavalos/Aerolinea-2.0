package ar.edu.unlam.pb2.aerolinea;

import java.util.Comparator;

public class OrdenPrecioId implements Comparator<Vuelo> {

	@Override
	public int compare(Vuelo o1, Vuelo o2) {
		if (o1.getPrecio().compareTo(o2.getPrecio()) == 0) {
			return o1.getIdVuelo().compareTo(o2.getIdVuelo());
		}

		return o1.getPrecio().compareTo(o2.getPrecio());
	}

}
