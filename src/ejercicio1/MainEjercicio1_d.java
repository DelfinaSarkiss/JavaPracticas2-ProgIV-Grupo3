package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.HashSet;

public class MainEjercicio1_d {
	
	public static void main(String[] args) {
	
			
	
			Persona e1 = new Persona("12345678", "Juan", "Pérez", LocalDate.of(1990, 5, 12),
	                "Masculino", "Av. Siempre Viva 123", "1122334455", "juan.perez@email.com");
	
	        Persona e2 = new Persona("87654321", "María", "Gómez", LocalDate.of(1995, 8, 24),
	                "Femenino", "Calle Falsa 123", "1199887766", "maria.gomez@email.com");
	
	        Persona e3 = new Persona("11223344", "Carlos", "López", LocalDate.of(1988, 11, 30),
	                "Masculino", "Mitre 456", "1144556677", "carlos.lopez@email.com");
	
	        Persona e4 = new Persona("44332211", "Ana", "Martínez", LocalDate.of(2000, 1, 15),
	                "Femenino", "Belgrano 789", "1133221100", "ana.martinez@email.com");
	
	        Persona e5 = new Persona("12345678", "Juan", "Pérez", LocalDate.of(1990, 5, 12),
	                "Masculino", "Av. Siempre Viva 123", "1122334455", "juan.perez@email.com"); //No debe agregarlo
	        
	             
	        HashSet<Persona> listaPersonas = new HashSet<Persona>();
	
	        listaPersonas.add(e1);
	        listaPersonas.add(e2);
	        listaPersonas.add(e3);
	        listaPersonas.add(e4);
	        listaPersonas.add(e5);
	
	        Iterator<Persona> it = listaPersonas.iterator();
	
	        while (it.hasNext())
	        {
	        	Persona persona = it.next();
	        	System.out.println(persona.toString());
	        }
	
		}

}
