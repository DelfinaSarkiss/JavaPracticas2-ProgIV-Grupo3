package ejercicio2;

import java.util.Objects;

public class EdificioDeOficinas implements IEdificio {

	private int numeroDeOficinas;
	private double superficie;

	public EdificioDeOficinas() {

	}

	public EdificioDeOficinas(int numeroDeOficinas, double superficie) {
		this.numeroDeOficinas = numeroDeOficinas;
		this.superficie = superficie;
	}

	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDeOficinas, superficie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EdificioDeOficinas other = (EdificioDeOficinas) obj;
		return numeroDeOficinas == other.numeroDeOficinas
				&& Double.doubleToLongBits(superficie) == Double.doubleToLongBits(other.superficie);
	}

	@Override
	public String toString() {
		return "EdificioDeOficinas [numeroDeOficinas=" + numeroDeOficinas + ", superficie=" + superficie + "]";
	}
}
