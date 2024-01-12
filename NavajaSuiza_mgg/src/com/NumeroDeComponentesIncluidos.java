package com;

public class NumeroDeComponentesIncluidos {
	
	Boolean cuchillo;
	String destornillador;
	Boolean lima;
	Boolean tijera;
	Boolean abrebotellas;
	
	public NumeroDeComponentesIncluidos() {
		
	}

	public NumeroDeComponentesIncluidos(Boolean cuchillo, String destornillador, Boolean lima, Boolean tijera,
			Boolean abrebotellas) {
		super();
		this.cuchillo = cuchillo;
		this.destornillador = destornillador;
		this.lima = lima;
		this.tijera = tijera;
		this.abrebotellas = abrebotellas;
	}

	public Boolean getCuchillo() {
		return cuchillo;
	}

	public void setCuchillo(Boolean cuchillo) {
		this.cuchillo = cuchillo;
	}

	public String getDestornillador() {
		return destornillador;
	}

	public void setDestornillador(String destornillador) {
		this.destornillador = destornillador;
	}

	public Boolean getLima() {
		return lima;
	}

	public void setLima(Boolean lima) {
		this.lima = lima;
	}

	public Boolean getTijera() {
		return tijera;
	}

	public void setTijera(Boolean tijera) {
		this.tijera = tijera;
	}

	public Boolean getAbrebotellas() {
		return abrebotellas;
	}

	public void setAbrebotellas(Boolean abrebotellas) {
		this.abrebotellas = abrebotellas;
	}

	@Override
	public String toString() {
		return "NumeroDeComponentesIncluidos [cuchillo=" + cuchillo + ", destornillador=" + destornillador + ", lima="
				+ lima + ", tijera=" + tijera + ", abrebotellas=" + abrebotellas + "]";
	}

	
}
