package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<IEdificio> edificios = new ArrayList<>();

		edificios.add(new Polideportivo("Polideportivo Norte", 1500.50, 1));
		edificios.add(new Polideportivo("Polideportivo Sur", 2100.75, 2));
		edificios.add(new Polideportivo("Polideportivo Centro", 1800.00, 3));
		edificios.add(new EdificioDeOficinas(25, 3200.40));
		edificios.add(new EdificioDeOficinas(40, 5100.80));

		Iterator<IEdificio> it = edificios.iterator();

		while (it.hasNext()) {
			IEdificio edificio = it.next();
			System.out.println(edificio.toString());
		}
	}

}
