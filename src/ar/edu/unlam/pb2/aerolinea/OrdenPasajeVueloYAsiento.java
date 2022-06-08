package ar.edu.unlam.pb2.aerolinea;

import java.util.Comparator;

public class OrdenPasajeVueloYAsiento implements Comparator<Pasaje>{

	@Override
	public int compare(Pasaje o1, Pasaje o2) {
		if(o1.getVuelo().compareTo(o2.getVuelo()) == 0){
			return o1.getAsciento().compareTo(o2.getAsciento());
		}
		
		return o1.getVuelo().compareTo(o2.getVuelo());
	}

}
