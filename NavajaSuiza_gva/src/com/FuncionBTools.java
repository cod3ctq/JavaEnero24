package com;

public class FuncionBTools {
	boolean DestornilladorPeq, Destornillador, Tijeras;
	public FuncionBTools() {
		
	}
	public FuncionBTools(boolean destornilladorPeq, boolean destornillador, boolean tijeras) { 
		DestornilladorPeq = destornilladorPeq;
		Destornillador = destornillador;
		Tijeras = tijeras;
	}
	public boolean isDestornilladorPeq() {
		return DestornilladorPeq;
	}
	public void setDestornilladorPeq(boolean destornilladorPeq) {
		DestornilladorPeq = destornilladorPeq;
	}
	public boolean isDestornillador() {
		return Destornillador;
	}
	public void setDestornillador(boolean destornillador) {
		Destornillador = destornillador;
	}
	public boolean isTijeras() {
		return Tijeras;
	}
	public void setTijeras(boolean tijeras) {
		Tijeras = tijeras;
	}
	@Override
	public String toString() {
		return "FuncionBTools [DestornilladorPeq=" + DestornilladorPeq + ", Destornillador=" + Destornillador
				+ ", Tijeras=" + Tijeras + "]";
	}
	
	
	
}
