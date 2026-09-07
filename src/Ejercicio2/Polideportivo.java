package ejercicio2;

import java.util.Objects;

public class Polideportivo implements IEdificio, IInstalacionDeportiva{

	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;
	
	public Polideportivo() {
		
	}
	
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + ", superficie=" + superficie + ", tipoDeInstalacion="
				+ tipoDeInstalacion + "]";
	}

	@Override
	public double getSuperficieEdificio() {
		
		return superficie;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		
		return tipoDeInstalacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, superficie, tipoDeInstalacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Polideportivo other = (Polideportivo) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(superficie) == Double.doubleToLongBits(other.superficie)
				&& tipoDeInstalacion == other.tipoDeInstalacion;
	}
	
	
	
}
