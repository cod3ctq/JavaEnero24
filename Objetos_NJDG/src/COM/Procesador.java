package COM;

public class Procesador {
	
	public Procesador(String frabricanrte, int nucleos, double frecuencia) {
		super();
		this.frabricanrte = frabricanrte;
		this.nucleos = nucleos;
		this.frecuencia = frecuencia;
	}

	String frabricanrte;
	int nucleos;
	double frecuencia;
	
	public Procesador() {
		
		
	}

	public String getFrabricanrte() {
		return frabricanrte;
	}

	public void setFrabricanrte(String frabricanrte) {
		this.frabricanrte = frabricanrte;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [frabricanrte=" + frabricanrte + ", nucleos=" + nucleos + ", frecuencia=" + frecuencia + "]";
	}
	
	

}
