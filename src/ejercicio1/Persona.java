package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	//constructores
	public Persona()
	{
		nombre = "sin nombre";
		fechaNacimiento = LocalDate.of(2025, 01, 01);
	}
	
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
		
	//getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public static void VerificarDNI(String dni) {
		if (dni == null || !dni.matches("\\d{8}")) {
			throw new ExVerificarDNI("El DNI debe contener exactamente 8 caracteres numericos");
		}
	}
	

	//Hash code and Equals
	@Override
	public int hashCode() {
		return Objects.hash(apellido, direccion, dni, email, fechaNacimiento, genero, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(dni, other.dni) && Objects.equals(email, other.email)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(genero, other.genero)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}
	
	//metodo toString()
		@Override
		public String toString() {
			return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
					+ fechaNacimiento + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono
					+ ", email=" + email + "]";
		}
	
}
