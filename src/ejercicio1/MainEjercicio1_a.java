package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {
	public static void main(String[] args) {
		Persona personaInvalida = new Persona("AA202020", "Juan", "Perez", LocalDate.of(1990, 5, 10),
				"Masculino", "Calle 123", "11111111", "juan@email.com");
		Persona personaValida = new Persona("20202020", "Ana", "Gomez", LocalDate.of(1995, 8, 20),
				"Femenino", "Avenida 456", "22222222", "ana@email.com");

		validarPersona(personaInvalida);
		validarPersona(personaValida);
	}

	private static void validarPersona(Persona persona) {
		try {
			Persona.VerificarDNI(persona.getDni());
			System.out.println("Persona agregada correctamente");
		} catch (ExVerificarDNI e) {
			System.out.println("Persona no agregada por no verificar el DNI");
		}
	}
}
