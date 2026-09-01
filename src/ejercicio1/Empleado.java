package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona{

	private static int contadorLegajo = 1000;
	private final int legajo;
	private String puesto;
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public Empleado()
	{
		super();
		contadorLegajo++;
		this.legajo = contadorLegajo;
		this.puesto = "Sin puesto";
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, 
			String genero, String direccion, String telefono, String email, String puesto)
	{
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		contadorLegajo++;
		this.legajo = contadorLegajo;
		this.puesto = puesto; 
	}
	public static int devuelveProximoLegajo() {
		return contadorLegajo + 1;
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + ", datosPersona=" + super.toString() + "]";
	}
}